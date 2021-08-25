package to.dev.example.service

import to.dev.example.api.responses.MoviesResponse
import to.dev.example.core.MoviesDAO
import javax.inject.Inject

class MoviesService @Inject constructor(
    private val moviesDAO: MoviesDAO
){
    fun getMovies(): MoviesResponse {
        return moviesDAO.test()
    }
}