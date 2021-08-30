package to.dev.example.api.responses

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.kjetland.jackson.jsonSchema.annotations.JsonSchemaDescription
import com.kjetland.jackson.jsonSchema.annotations.JsonSchemaTitle

@JsonDeserialize
@JsonSerialize
@JsonSchemaTitle("Combined movies")
@JsonSchemaDescription("Combined movies from all providers")
data class CombinedResponse (
        @JsonProperty(value = "Providers", required = true)
        @field:JsonPropertyDescription("Providers")
        val providers: List<CombinedMovieProviders>

        )

data class CombinedMovieProviders (
        @JsonProperty(value = "Provider", required = true)
        var provider: String,


        )
