package com.egdroid.datasource.remote.movie

import com.egdroid.models.remote.movie.popularmovie.MovieResponse
import retrofit2.Call
import retrofit2.http.GET


interface PopularMovieService {

    @GET("popular")
    fun getMovies(): Call<MovieResponse>
}