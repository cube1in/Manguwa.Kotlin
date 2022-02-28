package com.sou1maker.dex.models.attributes

import kotlinx.serialization.*

/**
 * 章节属性
 * @property Title String
 * @property PublishAt String
 * @property ReadableAt String
 * @property Uploader String
 * @property TranslatedLanguage String
 * @property Volume String
 * @property Pages String
 * @property ExternalUrl String
 * @constructor
 */
@Suppress("unused")
@Serializable
data class ChapterAttributes(
    @SerialName("title")
    var Title: String,
    @SerialName("publishAt")
    var PublishAt: String,
    @SerialName("readableAt")
    var ReadableAt: String,
    @SerialName("uploader")
    var Uploader: String,
    @SerialName("translatedLanguage")
    var TranslatedLanguage: String,
    @SerialName("volume")
    var Volume: String?,
    @SerialName("chapter")
    var Chapter: String?,
    @SerialName("pages")
    var Pages: String,
    @SerialName("externalUrl")
    var ExternalUrl: String?,

    @SerialName("createdAt")
    var CreatedAt: String,
    @SerialName("updatedAt")
    var UpdatedAt: String,
    @SerialName("version")
    var Version: Int,
)
