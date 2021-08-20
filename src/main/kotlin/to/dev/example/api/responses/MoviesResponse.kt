package to.dev.example.api.responses

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.kjetland.jackson.jsonSchema.annotations.JsonSchemaDescription
import com.kjetland.jackson.jsonSchema.annotations.JsonSchemaTitle

@JsonSerialize
@JsonSchemaTitle("Movies Response")
@JsonSchemaDescription("This method is used to return a list of movies related to a provider")
data class MoviesResponse (
    @get:JsonProperty(value = "provider", required = true)
    @get:JsonPropertyDescription("provider")
    val provider: String
)