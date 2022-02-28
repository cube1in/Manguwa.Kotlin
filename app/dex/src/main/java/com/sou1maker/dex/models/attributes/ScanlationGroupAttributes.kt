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
    var Name: String,
    @SerialName("altNames")
    var AltNames: Iterable<LocalizedString>,
    @SerialName("website")
    var Website: String?,
    @SerialName("ircServer")
    var IrcServer: String?,
    @SerialName("ircChannel")
    var IrcChannel: String?,
    @SerialName("discord")
    var Discord: String?,
    @SerialName("contactEmail")
    var ContactEmail: String?,
    @SerialName("description")
    var Description: String?,
    @SerialName("twitter")
    var Twitter: String?,
    @SerialName("mangaUpdates")
    var MangaUpdates: String?,
    @SerialName("focusedLanguage")
    var FocusedLanguage: Iterable<String>?,
    @SerialName("locked")
    var Locked: Boolean,
    @SerialName("official")
    var Official: Boolean,
    @SerialName("inactive")
    var Inactive: Boolean,
    @SerialName("publishDelay")
    var PublishDelay: String,

    @SerialName("createdAt")
    var CreatedAt: String,
    @SerialName("updatedAt")
    var UpdatedAt: String,
    @SerialName("version")
    var Version: Int,
)
