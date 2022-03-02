package com.sou1maker.dex

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.sou1maker.dex.providers.*
import kotlinx.serialization.json.Json
import org.junit.Test

import org.junit.Assert.*
import retrofit2.Retrofit
import okhttp3.MediaType.Companion.toMediaType

class MangaProviderTest {
    @Test
    fun getMangaListTest() {
        val contentType = "application/json".toMediaType()

        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.mangadex.org")
            .addConverterFactory(Json{classDiscriminator = "type";ignoreUnknownKeys = true}.asConverterFactory(contentType))
            .build()

        val service = retrofit.create(MangaProvider::class.java)
        val mangaList = service.getMangaList().execute()
        assertNotNull(mangaList)
    }
}