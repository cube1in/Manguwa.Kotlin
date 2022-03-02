package com.sou1maker.dex.models

import com.sou1maker.dex.models.enums.*
import kotlinx.serialization.*

/**
 * 漫画列表
 * @property Data List<Manga>
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
    var Data: List<Manga>,

    @SerialName("limit")
    var Limit: Int,
    @SerialName("offset")
    var Offset: Int,
    @SerialName("total")
    var Total: Int,

    @SerialName("response")
    var Response: Response,
    @SerialName("result")
    var Result: Result,
)