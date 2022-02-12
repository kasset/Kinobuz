package kz.arbuz.kinobuz.domain.usecase

import kz.arbuz.kinobuz.BuildConfig
import kz.arbuz.kinobuz.data.api.ImdbService
import kz.arbuz.kinobuz.data.entity.ApiMovie

class GetTop250MoviesUseCase(
    private val service: ImdbService
) {
    suspend operator fun invoke(): List<ApiMovie> {
        return service.getMovies(BuildConfig.API_KEY).apiMovieList
    }
}