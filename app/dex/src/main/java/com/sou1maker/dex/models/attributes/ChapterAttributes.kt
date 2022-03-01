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
    val Title: String,
    @SerialName("publishAt")
    val PublishAt: String,
    @SerialName("readableAt")
    val ReadableAt: String,
    @SerialName("uploader")
    val Uploader: String,
    @SerialName("translatedLanguage")
    val TranslatedLanguage: String,
    @SerialName("volume")
    val Volume: String?,
    @SerialName("chapter")
    val Chapter: String?,
    @SerialName("pages")
    val Pages: String,
    @SerialName("externalUrl")
    val ExternalUrl: String?,

    @SerialName("createdAt")
    val CreatedAt: String,
    @SerialName("updatedAt")
    val UpdatedAt: String,
    @SerialName("version")
    val Version: Int,
)
