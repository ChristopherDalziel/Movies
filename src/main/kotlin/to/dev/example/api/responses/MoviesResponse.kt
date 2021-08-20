package to.dev.example.api.responses

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.kjetland.jackson.jsonSchema.annotations.JsonSchemaDescription
import com.kjetland.jackson.jsonSchema.annotations.JsonSchemaTitle
import net.ozwolf.raml.annotations.RamlExample

@JsonSerialize
@JsonSchemaTitle("Movies Response")
@JsonSchemaDescription("This method is used to return a list of movies related to a provider")
data class MoviesResponse (
    @get:JsonProperty(value = "provider", required = true)
    @get:JsonPropertyDescription("provider")
    val provider: String,

    @get:JsonProperty(value = "movies", required = true)
    @get:JsonPropertyDescription("list of movies")
    val movies: Movies
) {
    companion object {
        @JvmStatic
        @RamlExample
        fun example(): MoviesResponse = MoviesResponse(
            "provider",
            Movies("ID", "title", "type", "poster")
        )
    }
}

data class Movies (
    @get:JsonProperty(value = "ID", required = true)
    var ID: String,

    @get:JsonProperty(value = "title", required = true)
    var title: String,

    @get:JsonProperty(value = "type", required = true)
    var type: String,

    @get:JsonProperty(value = "poster", required = true)
    var poster: String
    )