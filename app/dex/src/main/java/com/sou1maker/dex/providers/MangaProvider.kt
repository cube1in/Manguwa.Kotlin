package com.sou1maker.dex.providers

import com.sou1maker.dex.models.MangaList
import retrofit2.Call
import retrofit2.http.*

interface MangaProvider {
    @GET("/manga/{id}")
    fun getMangaList(@Path("id") id: String): Call<MangaList>
}