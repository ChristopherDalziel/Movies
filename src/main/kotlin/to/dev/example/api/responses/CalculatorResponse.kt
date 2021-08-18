package to.dev.example.api.responses

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import net.ozwolf.raml.annotations.RamlExample

@JsonSerialize
data class CalculatorResponse(
    @get:JsonProperty(value = "result", required = true)
    val result: Double
) {
    companion object {
        @JvmStatic
        @RamlExample
        fun example(): CalculatorResponse = CalculatorResponse(
            150.0
        )
    }
}