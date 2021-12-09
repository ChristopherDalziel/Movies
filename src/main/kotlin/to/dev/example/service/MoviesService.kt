package to.dev.example.service

import to.dev.example.api.responses.CombinedMovieResponse
import to.dev.example.api.responses.MoviesResponse
import to.dev.example.core.dao.MoviesDAO
import javax.inject.Inject

class MoviesService @Inject constructor(
    private val moviesDAO: MoviesDAO,
){

    fun getMovies(provider: String, apiKey: String): MoviesResponse {
        return moviesDAO.getMovies(provider, apiKey)
    }

    fun getMovieV2(id: String, apiKey: String): CombinedMovieResponse {
        val filmWorldResponse = moviesDAO.getMovie("filmworld", "fw", id, apiKey)
        val cinemaWorldResponse = moviesDAO.getMovie("cinemaworld", "cw", id, apiKey)

        return CombinedMovieResponse(filmWorldResponse.title, filmWorldResponse.price, cinemaWorldResponse.price)
    }
}