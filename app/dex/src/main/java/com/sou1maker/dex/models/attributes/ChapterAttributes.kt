package com.sou1maker.dex.models.attributes

import kotlinx.serialization.*

/**
 * 章节属性
 * @property Title String
 * @property PublishAt String
 * @property ReadableAt String
 * @property Uploader String
 * @property TranslatedLanguage String
 * @property Volume String?
 * @property Chapter String?
 * @property Pages String
 * @property ExternalUrl String?
 * @property CreatedAt String
 * @property UpdatedAt String
 * @property Version Int
 * @constructor
 */
@Suppress("unused")
@Serializable
@SerialName("chapter")
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
    val Volume: String? = null,
    @SerialName("chapter")
    val Chapter: String? = null,
    @SerialName("pages")
    val Pages: String,
    @SerialName("externalUrl")
    val ExternalUrl: String? = null,

    @SerialName("createdAt")
    val CreatedAt: String,
    @SerialName("updatedAt")
    val UpdatedAt: String,
    @SerialName("version")
    val Version: Int,
):Attributes()
