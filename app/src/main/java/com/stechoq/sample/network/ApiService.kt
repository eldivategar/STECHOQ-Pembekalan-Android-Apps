package com.stechoq.sample.network

import retrofit2.Call
import retrofit2.http.GET
import com.stechoq.sample.model.Photo

interface ApiService {
    @GET("photos")
    fun getPhotos(): Call<List<Photo>>
}
