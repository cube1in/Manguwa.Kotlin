package com.sou1maker.dex.models.attributes

import com.sou1maker.dex.models.*
import kotlinx.serialization.*

/**
 * 作者属性
 * @property Name String
 * @property ImageUrl String
 * @property Biography LocalizedString?
 * @property Twitter String?
 * @property Pixiv String?
 * @property MelonBook String?
 * @property FanBox String?
 * @property Booth String?
 * @property NicoVideo String?
 * @property Skeb String?
 * @property Fantia String?
 * @property Tumblr String?
 * @property Youtube String?
 * @property Weibo String?
 * @property Naver String?
 * @property Website String?
 * @constructor
 */
@Suppress("unused", "SpellCheckingInspection")
@Serializable
data class AuthorAttributes(
    @SerialName("name")
    val Name: String,
    @SerialName("imageUrl")
    val ImageUrl: String,

    // TODO: object or array
    @SerialName("biography")
    val Biography: LocalizedString?,
    @SerialName("twitter")
    val Twitter: String?,
    @SerialName("pixiv")
    val Pixiv: String?,
    @SerialName("melonBook")
    val MelonBook: String?,
    @SerialName("fanBox")
    val FanBox: String?,
    @SerialName("booth")
    val Booth: String?,
    @SerialName("nicoVideo")
    val NicoVideo: String?,
    @SerialName("skeb")
    val Skeb: String?,
    @SerialName("fantia")
    val Fantia: String?,
    @SerialName("tumblr")
    val Tumblr: String?,
    @SerialName("youtube")
    val Youtube: String?,
    @SerialName("weibo")
    val Weibo: String?,
    @SerialName("naver")
    val Naver: String?,
    @SerialName("website")
    val Website: String?,

    @SerialName("createdAt")
    val CreatedAt: String,
    @SerialName("updatedAt")
    val UpdatedAt: String,
    @SerialName("version")
    val Version: Int,
)
