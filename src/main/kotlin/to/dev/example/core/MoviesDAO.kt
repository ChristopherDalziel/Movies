package to.dev.example.core

import to.dev.example.api.responses.MoviesResponse
import javax.inject.Inject
import javax.ws.rs.client.Client
import javax.ws.rs.core.MediaType

class MoviesDAO @Inject constructor(
    private val client: Client
) {
    fun getMovies(provider: String): MoviesResponse {
        return client.target("https://challenge.lexicondigital.com.au/api/${provider}/movies")
            .request(MediaType.APPLICATION_JSON)
            .header("x-api-key", System.getenv("x-api-key"))
            .get(MoviesResponse::class.java)
    }
}