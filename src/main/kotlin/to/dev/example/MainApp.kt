package to.dev.example

import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment
import ru.vyarus.dropwizard.guice.GuiceBundle
import to.dev.example.configuration.MoviesConfig
import to.dev.example.core.MoviesDAO
import to.dev.example.modules.DefaultModule
import to.dev.example.resources.CalculatorResource
import to.dev.example.resources.MoviesResource
import to.dev.example.service.CalculatorService
import to.dev.example.service.MoviesService
import javax.ws.rs.client.Client

fun main(args: Array<String>) {
    CalculatorApp().run(*args)
}

class CalculatorApp : Application<MoviesConfig>() {
    override fun initialize(bootstrap: Bootstrap<MoviesConfig>) {
        // dependency injection is awesome
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