package to.dev.example.resources

import net.ozwolf.raml.annotations.RamlBody
import net.ozwolf.raml.annotations.RamlDescription
import net.ozwolf.raml.annotations.RamlResponse
import net.ozwolf.raml.annotations.RamlResponses
import org.reflections.Reflections.log
import to.dev.example.api.responses.CalculatorResponse
import to.dev.example.service.CalculatorService
import javax.inject.Inject
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("/")
class CalculatorResource @Inject constructor(private val calculatorService: CalculatorService){
    @RamlDescription("Addition")
    @RamlResponses(
        RamlResponse(
            status = 200,
            description = "Used to add value a to value b",
            bodies = [
                RamlBody(contentType = MediaType.APPLICATION_JSON, type = CalculatorResponse::class)
            ]
        )
    )
    @Path("/addition")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun addition(@HeaderParam("a") a: Double, @HeaderParam("b") b: Double) : CalculatorResponse {
        try {
            val additionResponse = calculatorService.addition(a, b)

            return CalculatorResponse(additionResponse)
        } catch (e: Exception) {
            log.error("there was an error")
            throw e
        }
    }

    @RamlDescription("Subtract")
    @RamlResponses(
        RamlResponse(
            status = 200,
            description = "Used to take value a from value b",
            bodies = [
                RamlBody(contentType = MediaType.APPLICATION_JSON, type = CalculatorResource::class)
            ]
        )
    )
    @Path("/subtract")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun subtraction(@HeaderParam("a") a: Double, @HeaderParam("b") b: Double) : CalculatorResponse {
        try {
            val subtractionResponse = calculatorService.subtract(a, b)
            return CalculatorResponse(subtractionResponse)
        } catch (e: Exception) {
            log.error("there was an error")
            throw e
        }
    }

    companion object {

    }
}