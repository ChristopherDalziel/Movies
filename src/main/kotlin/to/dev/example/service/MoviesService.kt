package to.dev.example.service

import to.dev.example.api.responses.CombinedMovieResponse
import to.dev.example.api.responses.MovieResponse
import to.dev.example.api.responses.MoviesResponse
import to.dev.example.core.dao.MoviesDAO
import javax.inject.Inject
import javax.ws.rs.core.UriInfo

class MoviesService @Inject constructor(
    private val moviesDAO: MoviesDAO,
){

//    filmworld
//    cinemaworld

//    fw1234
//    cw1234

//    fun combinedMovie(): CombinedMovieResponse {
//
//    }

    fun getMovies(provider: String, apiKey: String): MoviesResponse {
        return moviesDAO.getMovies(provider, apiKey)
    }

    fun getMovie(provider: String, id: String): MovieResponse {
        return moviesDAO.getMovie(provider, id)
    }
}