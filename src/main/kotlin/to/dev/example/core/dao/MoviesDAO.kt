package to.dev.example.core.dao

import to.dev.example.api.responses.MovieResponse
import to.dev.example.api.responses.MoviesResponse
import javax.inject.Inject
import javax.ws.rs.client.Client
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.UriInfo

class MoviesDAO @Inject constructor(
    private val client: Client
) {
    fun getMovies(provider: String, apiKey: String): MoviesResponse {
        return client.target("https://challenge.lexicondigital.com.au/api/${provider}/movies")
            .request(MediaType.APPLICATION_JSON)
            .header("x-api-key", apiKey)
            .get(MoviesResponse::class.java)
    }



    fun getMovie(provider: String, id: String): MovieResponse {
        return client.target("https://challenge.lexicondigital.com.au/api/${provider}/movie/${id}")
            .request(MediaType.APPLICATION_JSON)
            .header("x-api-key", System.getenv("x-api-key"))
            .get(MovieResponse::class.java)
    }
}