package to.dev.example.api.responses

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyDescription

data class CombinedMovieResponse (
    val id: String,

    val title: String,

    val filmWorldPrice: Double,

    val cinemaWorldPrice: Double
) {
    companion object {
        fun from(id: String, title: String, filmWorldPrice: Double, cinemaWorldPrice: Double): CombinedMovieResponse = CombinedMovieResponse(
            id,
            title,
            filmWorldPrice,
            cinemaWorldPrice
        )
    }
}
