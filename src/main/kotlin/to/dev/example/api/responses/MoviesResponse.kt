package to.dev.example.api.responses

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.kjetland.jackson.jsonSchema.annotations.JsonSchemaDescription
import com.kjetland.jackson.jsonSchema.annotations.JsonSchemaTitle
import net.ozwolf.raml.annotations.RamlExample

@JsonDeserialize
@JsonSerialize
@JsonSchemaTitle("Movies Response")
@JsonSchemaDescription("This method is used to return a list of movies related to a provider")
data class MoviesResponse (
    @JsonProperty(value = "Provider", required = true)
    @field:JsonPropertyDescription("Provider")
    val provider: String,

    @JsonProperty(value = "Movies", required = true)
    @JsonPropertyDescription("List of movies")
    val movies: List<Movies>
) {
    companion object {
        @JvmStatic
        @RamlExample
        fun example(): MoviesResponse = MoviesResponse(
            "Provider",
            listOf(Movies("ID", "Title", "Type", "Poster"))
        )
    }
}

data class Movies (
    @JsonProperty(value = "ID", required = true)
    var id: String,

    @JsonProperty(value = "Title", required = true)
    var title: String,

    @JsonProperty(value = "Type", required = true)
    var type: String,

    @JsonProperty(value = "Poster", required = true)
    var poster: String
    )