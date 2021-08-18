package to.dev.example

import io.dropwizard.Application
import io.dropwizard.setup.Environment
import to.dev.example.configuration.MoviesConfig
import to.dev.example.resources.CalculatorResource
import to.dev.example.service.CalculatorService
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.QueryParam

fun main(args: Array<String>) {
    CalculatorApp().run(*args)
}

class CalculatorApp : Application<MoviesConfig>() {
    override fun run(configuration: MoviesConfig, environment: Environment) {
        println("Running ${configuration.name}")
        val calculatorResource = CalculatorResource
        environment.jersey().register(calculatorResource)
    }
}