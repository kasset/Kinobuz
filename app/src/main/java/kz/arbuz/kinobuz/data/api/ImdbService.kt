package kz.arbuz.kinobuz.data.api

import kz.arbuz.kinobuz.data.entity.ApiMovie
import retrofit2.http.GET

/**
 * --> API URL <--
 * https://imdb-api.com/api
 *
 * API KEY IN BUILD CONFIG
 */
interface ImdbService {

    @GET("ru/API/Top250Movies/")
    suspend fun getMovies(): List<ApiMovie>
}