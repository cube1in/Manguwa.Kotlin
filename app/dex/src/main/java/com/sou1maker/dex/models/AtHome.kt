package com.sou1maker.dex.models

/**
 * MangaDex@Home
 * @property BaseUrl String
 * @property Chapter AtHomeChapter
 * The base URL to construct final image URLs from.
 * The URL returned is valid for the requested chapter only, and for a duration of 15 minutes
 * example: https://abcdef.xyz123.mangadex.network:12345/some-temporary-access-token
 * @constructor
 */
data class AtHome(var BaseUrl: String, var Chapter: AtHomeChapter)