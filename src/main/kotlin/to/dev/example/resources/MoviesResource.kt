package to.dev.example.resources

import net.ozwolf.raml.annotations.RamlBody
import net.ozwolf.raml.annotations.RamlDescription
import net.ozwolf.raml.annotations.RamlResponse
import net.ozwolf.raml.annotations.RamlResponses
import to.dev.example.api.responses.Movies
import to.dev.example.api.responses.MoviesResponse
import to.dev.example.service.MoviesService
import java.lang.Exception
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

class MoviesResource @Inject constructor(private val moviesService: MoviesService) {
    @RamlDescription("Returns a list of movies from a provider")
    @RamlResponses(
        RamlResponse(
            status = 200,
            description = "This method returns a list of movies from a provider",
            bodies = [
                RamlBody(contentType = MediaType.APPLICATION_JSON, type = MoviesResponse::class)
            ]
        )
    )
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getMovies(@PathParam("provider") provider: String ): MoviesResponse {
        try {
            val response = moviesService.getMovies(provider)

            return MoviesResponse(provider, response)
        } catch (e: Exception) {
            throw e
        }
    }
}