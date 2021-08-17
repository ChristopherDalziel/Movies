package to.dev.example

import io.dropwizard.Application
import io.dropwizard.setup.Environment
import to.dev.example.configuration.CalculatorConfig
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.QueryParam

fun main(args: Array<String>) {
    CalculatorApp().run(*args)
}

@Path("/")
class CalculatorComponent {
    @Path("/add")
    @GET
    fun add(@QueryParam("a") a: Double, @QueryParam("b") b: Double): Double {
        return a + b
    }

    @Path("/subtract")
    @GET
    fun subtract(@QueryParam("a") a: Double, @QueryParam("b") b: Double): Double {
        return a - b
    }

    @Path("/multiply")
    @GET
    fun multiply(@QueryParam("a") a: Double, @QueryParam("b") b: Double): Double {
        return a * b
    }

    @Path("/divide")
    @GET
    fun divide(@QueryParam("a") a: Double, @QueryParam("b") b: Double): Double {
        return a / b
    }

}

class CalculatorApp : Application<CalculatorConfig>() {
    override fun run(configuration: CalculatorConfig, environment: Environment) {
        println("Running ${configuration.name}")
        val calculatorComponent = CalculatorComponent()
        environment.jersey().register(calculatorComponent)
    }
}