package to.dev.example.core.dao

import to.dev.example.api.responses.MovieResponse
import to.dev.example.api.responses.MoviesResponse
import javax.inject.Inject
import javax.ws.rs.client.Client
import javax.ws.rs.core.MediaType

class MoviesDAO @Inject constructor(
    private val client: Client
) {
    fun getMovies(provider: String, apiKey: String): MoviesResponse {
        return client.target("https://challenge.lexicondigital.com.au/api/${provider}/movies")
            .request(MediaType.APPLICATION_JSON)
            .header("x-api-key", apiKey)
            .get(MoviesResponse::class.java)
    }

    fun getMovie(provider: String, providerId: String, movieId: String, apiKey: String): MovieResponse {
        return client.target("https://challenge.lexicondigital.com.au/api/${provider}/movie/${providerId}${movieId}")
            .request(MediaType.APPLICATION_JSON)
            .header("x-api-key", apiKey)
            .get(MovieResponse::class.java)
    }
}