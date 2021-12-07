package to.dev.example.resources

import net.ozwolf.raml.annotations.RamlBody
import net.ozwolf.raml.annotations.RamlDescription
import net.ozwolf.raml.annotations.RamlResponse
import net.ozwolf.raml.annotations.RamlResponses
import to.dev.example.api.responses.MovieResponse
import to.dev.example.api.responses.MoviesResponse
import to.dev.example.service.MoviesService
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.Context
import javax.ws.rs.core.HttpHeaders
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.UriInfo

@Path("/")
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
    @Path("/provider/{provider}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getMovies(@PathParam("provider") provider: String, @Context headers: HttpHeaders): MoviesResponse {
        val apiKey = headers.getHeaderString("x-api-key")
        return moviesService.getMovies(provider, apiKey)
    }

    @Path("/provider/{provider}/id/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun getMovie(@PathParam("provider") provider: String, @PathParam("id") id: String): MovieResponse {
        return moviesService.getMovie(provider, id)
    }

}