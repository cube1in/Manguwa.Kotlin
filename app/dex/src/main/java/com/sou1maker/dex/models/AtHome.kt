package com.sou1maker.dex.models

import kotlinx.serialization.*

/**
 * MangaDex@Home
 * @property BaseUrl String
 * @property Chapter AtHomeChapter
 * The base URL to construct final image URLs from.
 * The URL returned is valid for the requested chapter only, and for a duration of 15 minutes
 * example: https://abcdef.xyz123.mangadex.network:12345/some-temporary-access-token
 * @constructor
 */
@Serializable
data class AtHome(
    @SerialName("baseUrl")
    var BaseUrl: String,
    @SerialName("chapter")
    var Chapter: AtHomeChapter
)