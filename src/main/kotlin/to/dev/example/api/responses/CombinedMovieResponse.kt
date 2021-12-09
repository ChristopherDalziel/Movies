package to.dev.example.api.responses


data class CombinedMovieResponse (

    val title: String,
    val filmWorldPrice: Double,
    val cinemaWorldPrice: Double
) {
    companion object {
        fun from(title: String, filmWorldPrice: Double, cinemaWorldPrice: Double): CombinedMovieResponse = CombinedMovieResponse(
            title,
            filmWorldPrice,
            cinemaWorldPrice
        )
    }
}
