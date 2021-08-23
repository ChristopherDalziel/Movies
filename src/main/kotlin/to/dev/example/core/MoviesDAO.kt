package to.dev.example.core

import to.dev.example.api.responses.MoviesResponse
import javax.inject.Inject
import javax.ws.rs.client.Client
import javax.ws.rs.client.Entity
import javax.ws.rs.core.MediaType

class MoviesDAO @Inject constructor(
    private val client: Client
) {
    fun test() {
        client.target("https://challenge.lexicondigital.com.au/api/filmworld/movies")
            .request(MediaType.APPLICATION_JSON)
            .header("x-api-key", "")
            .get()
    }
}