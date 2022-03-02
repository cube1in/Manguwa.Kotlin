package com.sou1maker.dex.models.attributes

import com.sou1maker.dex.models.LocalizedString
import kotlinx.serialization.*

/**
 * 扫描组属性
 * @property Name String
 * @property AltNames List<LocalizedString>
 * @property Website String?
 * @property IrcServer String?
 * @property IrcChannel String?
 * @property Discord String?
 * @property ContactEmail String?
 * @property Description String?
 * @property Twitter String?
 * @property MangaUpdates String?
 * @property FocusedLanguage List<String>?
 * @property Locked Boolean
 * @property Official Boolean
 * @property Inactive Boolean
 * @property PublishDelay String
 * @constructor
 */
@Suppress("SpellCheckingInspection")
@Serializable
@SerialName("scanlation_group")
data class ScanlationGroupAttributes(
    @SerialName("name")
    val Name: String,
    @SerialName("altNames")
    val AltNames: List<LocalizedString>,
    @SerialName("website")
    val Website: String? = null,
    @SerialName("ircServer")
    val IrcServer: String? = null,
    @SerialName("ircChannel")
    val IrcChannel: String? = null,
    @SerialName("discord")
    val Discord: String? = null,
    @SerialName("contactEmail")
    val ContactEmail: String? = null,
    @SerialName("description")
    val Description: String? = null,
    @SerialName("twitter")
    val Twitter: String? = null,
    @SerialName("mangaUpdates")
    val MangaUpdates: String? = null,
    @SerialName("focusedLanguage")
    val FocusedLanguage: List<String>? = null,
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
):Attributes()
