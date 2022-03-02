package com.sou1maker.dex.providers

import com.sou1maker.dex.models.*
import retrofit2.Call
import retrofit2.http.*

interface MangaProvider {
    @GET("/manga?includes[]=cover_art")
    fun getMangaList(): Call<MangaList>

    @GET("/manga/{id}")
    fun getManga(@Path("id") id: String): Call<Manga>
}