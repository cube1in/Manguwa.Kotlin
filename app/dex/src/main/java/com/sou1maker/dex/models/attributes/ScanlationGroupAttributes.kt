package com.sou1maker.dex.models.attributes

import com.sou1maker.dex.models.LocalizedString
import kotlinx.serialization.*

/**
 * 扫描组属性
 * @property Name String
 * @property AltNames Iterable<LocalizedString>
 * @property Website String?
 * @property IrcServer String?
 * @property IrcChannel String?
 * @property Discord String?
 * @property ContactEmail String?
 * @property Description String?
 * @property Twitter String?
 * @property MangaUpdates String?
 * @property FocusedLanguage Iterable<String>?
 * @property Locked Boolean
 * @property Official Boolean
 * @property Inactive Boolean
 * @property PublishDelay String
 * @constructor
 */
@Suppress("SpellCheckingInspection")
@Serializable
data class ScanlationGroupAttributes(
    @SerialName("name")
    val Name: String,
    @SerialName("altNames")
    val AltNames: Iterable<LocalizedString>,
    @SerialName("website")
    val Website: String?,
    @SerialName("ircServer")
    val IrcServer: String?,
    @SerialName("ircChannel")
    val IrcChannel: String?,
    @SerialName("discord")
    val Discord: String?,
    @SerialName("contactEmail")
    val ContactEmail: String?,
    @SerialName("description")
    val Description: String?,
    @SerialName("twitter")
    val Twitter: String?,
    @SerialName("mangaUpdates")
    val MangaUpdates: String?,
    @SerialName("focusedLanguage")
    val FocusedLanguage: Iterable<String>?,
    @SerialName("locked")
    val Locked: Boolean,
    @SerialName("official")
    val Official: Boolean,
    @SerialName("inactive")
    val Inactive: Boolean,
    @SerialName("publishDelay")
    val PublishDelay: String,

    @SerialName("createdAt")
    val CreatedAt: String,
    @SerialName("updatedAt")
    val UpdatedAt: String,
    @SerialName("version")
    val Version: Int,
)
