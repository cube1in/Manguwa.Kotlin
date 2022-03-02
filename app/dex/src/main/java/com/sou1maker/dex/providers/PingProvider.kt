package com.sou1maker.dex.providers

import retrofit2.Call
import retrofit2.http.GET

interface PingProvider {
    @GET("/ping")
    fun ping(): Call<String>
}