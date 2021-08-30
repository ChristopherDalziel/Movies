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
@JsonSchemaTitle("Movie Response")
@JsonSchemaDescription("This method is used to return detailed information about a movie related to a provider")
data class MovieResponse(
    @JsonProperty(value = "ID", required = true)
    @field:JsonPropertyDescription("ID")
    val id: String,

    @JsonProperty(value = "Title", required = true)
    @field:JsonPropertyDescription("Title")
    val title: String,

    @JsonProperty(value = "Year", required = true)
    @field:JsonPropertyDescription("Year")
    val year: String,

    @JsonProperty(value = "Rated", required = true)
    @field:JsonPropertyDescription("Rated")
    val rated: String,

    @JsonProperty(value = "Released", required = true)
    @field:JsonPropertyDescription("Released")
    val released: String,

    @JsonProperty(value = "Runtime", required = true)
    @field:JsonPropertyDescription("Runtime")
    val runtime: String,

    @JsonProperty(value = "Genre", required = true)
    @field:JsonPropertyDescription("Genre")
    val genre: String,

    @JsonProperty(value = "Director", required = true)
    @field:JsonPropertyDescription("Director")
    val director: String,

    @JsonProperty(value = "Writer", required = true)
    @field:JsonPropertyDescription("Writer")
    val writer: String,

    @JsonProperty(value = "Actors", required = true)
    @field:JsonPropertyDescription("Actors")
    val actors: String,

    @JsonProperty(value = "Plot", required = true)
    @field:JsonPropertyDescription("Plot")
    val plot: String,

    @JsonProperty(value = "Language", required = true)
    @field:JsonPropertyDescription("Language")
    val language: String,

    @JsonProperty(value = "Country", required = true)
    @field:JsonPropertyDescription("Country")
    val country: String,

    @JsonProperty(value = "Poster", required = true)
    @field:JsonPropertyDescription("Poster")
    val poster: String,

    @JsonProperty(value = "Type", required = true)
    @field:JsonPropertyDescription("Type")
    val type: String,

    @JsonProperty(value = "Production", required = true)
    @field:JsonPropertyDescription("Production")
    val production: String,

    @JsonProperty(value = "Price", required = true)
    @field:JsonPropertyDescription("Price")
    val price: Double
) {
    companion object {
        @JvmStatic
        @RamlExample
        fun example(): MovieResponse = MovieResponse(
            "id",
            "title",
            "year",
            "rated",
            "released",
            "runtime",
            "genre",
            "director",
            "writer",
            "actors",
            "plot",
            "language",
            "country",
            "poster",
            "type",
            "production",
            24.7
        )
    }
}