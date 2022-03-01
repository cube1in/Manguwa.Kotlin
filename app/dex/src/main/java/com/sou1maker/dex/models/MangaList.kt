package com.sou1maker.dex.models

import com.sou1maker.dex.models.enums.*
import kotlinx.serialization.*

/**
 * 漫画列表
 * @property Data Iterable<Manga>
 * @property Limit Int
 * @property Offset Int
 * @property Total Int
 * @property Response Response
 * @property Result Result
 * @constructor
 */
@Serializable
data class MangaList(
    @SerialName("data")
    val Data: Iterable<Manga>,

    @SerialName("limit")
    val Limit: Int,
    @SerialName("offset")
    val Offset: Int,
    @SerialName("total")
    val Total: Int,

    @SerialName("response")
    val Response: Response,
    @SerialName("result")
    val Result: Result,
)