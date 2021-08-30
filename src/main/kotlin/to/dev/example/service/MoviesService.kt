package to.dev.example.service

import to.dev.example.api.responses.MovieResponse
import to.dev.example.api.responses.MoviesResponse
import to.dev.example.core.dao.MoviesDAO
import javax.inject.Inject

class MoviesService @Inject constructor(
    private val moviesDAO: MoviesDAO,
){
    fun getMovies(provider: String): MoviesResponse {
        return moviesDAO.getMovies(provider)
    }

    fun getMovie(provider: String, id: String): MovieResponse {
        return moviesDAO.getMovie(provider, id)
    }
}