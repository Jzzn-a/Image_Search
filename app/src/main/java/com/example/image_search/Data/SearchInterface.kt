package com.example.image_search.Data

import android.media.Image
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface SearchInterface {
    @GET("https://dapi.kakao.com/v2/search/image")
    suspend fun getImage(@QueryMap param: HashMap<String, String>) : Image
}