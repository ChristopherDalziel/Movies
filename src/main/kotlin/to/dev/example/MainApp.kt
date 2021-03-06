package to.dev.example

import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment
import ru.vyarus.dropwizard.guice.GuiceBundle
import to.dev.example.configuration.MoviesConfig
import to.dev.example.modules.DefaultModule
import to.dev.example.resources.MoviesResource

fun main(args: Array<String>) {
    println(args.joinToString { it })
    val argsTwo = if(args.isNullOrEmpty()) {
        arrayOf("server", "config/local.yaml")
    } else {
        args
    }
    MovieApp().run(*argsTwo)
}

class MovieApp : Application<MoviesConfig>() {
    override fun initialize(bootstrap: Bootstrap<MoviesConfig>) {
        bootstrap.addBundle(
            GuiceBundle.builder()
                .enableAutoConfig(javaClass.getPackage().name)
                .modules(DefaultModule())
                .build()
        );
    }

    override fun run(configuration: MoviesConfig, environment: Environment) {
        println("Running ${configuration.name}")
        environment.jersey().register(MoviesResource::class.java);
    }
}