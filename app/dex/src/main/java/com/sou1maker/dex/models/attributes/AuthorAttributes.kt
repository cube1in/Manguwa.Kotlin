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
    var Name: String,
    @SerialName("imageUrl")
    var ImageUrl: String,

    // TODO: object or array
    @SerialName("biography")
    var Biography: LocalizedString?,
    @SerialName("twitter")
    var Twitter: String?,
    @SerialName("pixiv")
    var Pixiv: String?,
    @SerialName("melonBook")
    var MelonBook: String?,
    @SerialName("fanBox")
    var FanBox: String?,
    @SerialName("booth")
    var Booth: String?,
    @SerialName("nicoVideo")
    var NicoVideo: String?,
    @SerialName("skeb")
    var Skeb: String?,
    @SerialName("fantia")
    var Fantia: String?,
    @SerialName("tumblr")
    var Tumblr: String?,
    @SerialName("youtube")
    var Youtube: String?,
    @SerialName("weibo")
    var Weibo: String?,
    @SerialName("naver")
    var Naver: String?,
    @SerialName("website")
    var Website: String?,

    @SerialName("createdAt")
    var CreatedAt: String,
    @SerialName("updatedAt")
    var UpdatedAt: String,
    @SerialName("version")
    var Version: Int,
)
