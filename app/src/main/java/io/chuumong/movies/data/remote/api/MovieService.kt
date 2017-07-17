package io.chuumong.movies.data.remote.api

import io.chuumong.movies.data.remote.model.Movies
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by JongHunLee on 2017-07-17.
 */
interface MovieService {
    @GET("movie/popular")
    abstract fun loadMovies(): Call<Movies>
}