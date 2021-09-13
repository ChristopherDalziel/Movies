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


    // get movies from multiple providers combine
//    p1 = [m1, m2, m3]
//    p2  [m1, m6]

    // combineProviders

//    movies: {
//        m1: {
//            providers: {
//                p1: {
//                    price: '',
//                    poster: ''
//                },
//            p2: {
//
//        }
//        }
//        }
//    }

    fun getMovie(provider: String, id: String): MovieResponse {
        return moviesDAO.getMovie(provider, id)
    }
}