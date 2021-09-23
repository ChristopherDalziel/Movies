package to.dev.example.service

import to.dev.example.api.responses.CombinedResponse
import to.dev.example.api.responses.MovieResponse
import to.dev.example.api.responses.MoviesResponse
import to.dev.example.core.dao.MoviesDAO
import javax.inject.Inject
import javax.inject.Provider

class MoviesService @Inject constructor(
    private val moviesDAO: MoviesDAO,
){
    fun getMovies(provider: String): MoviesResponse {
        return moviesDAO.getMovies(provider)
    }


    // get movies from multiple providers and combine
    fun getMoviesFromProviders() {
        // return data from all providers
        // provider one = [movie1, movie 2, movie3]
        // provider two = [movie1, movie6]
    }

    fun combineProviders() {
        // return a list of movies and their providers
        // movies: { movie1 : { providers: { provider1: { price: '', poster: '' }, provider2: { price: '', poster: '' } } }
    }



    fun getMovie(provider: String, id: String): MovieResponse {
        return moviesDAO.getMovie(provider, id)
    }
}