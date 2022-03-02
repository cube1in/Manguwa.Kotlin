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
@SerialName("author")
data class AuthorAttributes(
    @SerialName("name")
    val Name: String,
    @SerialName("imageUrl")
    val ImageUrl: String,

    // TODO: object or array
    @SerialName("biography")
    val Biography: LocalizedString? = null,
    @SerialName("twitter")
    val Twitter: String? = null,
    @SerialName("pixiv")
    val Pixiv: String? = null,
    @SerialName("melonBook")
    val MelonBook: String? = null,
    @SerialName("fanBox")
    val FanBox: String? = null,
    @SerialName("booth")
    val Booth: String? = null,
    @SerialName("nicoVideo")
    val NicoVideo: String? = null,
    @SerialName("skeb")
    val Skeb: String? = null,
    @SerialName("fantia")
    val Fantia: String? = null,
    @SerialName("tumblr")
    val Tumblr: String? = null,
    @SerialName("youtube")
    val Youtube: String? = null,
    @SerialName("weibo")
    val Weibo: String? = null,
    @SerialName("naver")
    val Naver: String? = null,
    @SerialName("website")
    val Website: String? = null,

    @SerialName("createdAt")
    val CreatedAt: String,
    @SerialName("updatedAt")
    val UpdatedAt: String,
    @SerialName("version")
    val Version: Int,
):Attributes()
