package com.sou1maker.dex.models.attributes

import com.sou1maker.dex.models.LocalizedString
import com.sou1maker.dex.models.Tag
import com.sou1maker.dex.models.enums.*
import com.sou1maker.dex.models.serializers.LocalizedStringListSerializer
import kotlinx.serialization.*
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject

/**
 * 漫画属性
 * @property Title LocalizedString
 * @property AltTitles List<LocalizedString>?
 * @property Description LocalizedString?
 * @property IsLocked Boolean
 * @property Links JsonObject
 * @property OriginalLanguage String
 * @property LastVolume String?
 * @property LastChapter String?
 * @property PublicationDemographic PublicationDemographic?
 * @property Status MangaStatus?
 * @property Year Int?
 * @property ContentRating ContentRating
 * @property ChapterNumbersResetOnNewVolume Boolean
 * @property Tags List<String>
 * @property State UploadState
 * @property CreatedAt String
 * @property UpdatedAt String
 * @property Version Int
 * @constructor
 */
@Serializable
@SerialName("manga")
data class MangaAttributes(
    @SerialName("title")
    val Title: LocalizedString,
    @SerialName("altTitles")
    val AltTitles: List<LocalizedString>? = null,

//    @Serializable(with = LocalizedStringListSerializer::class)
    @SerialName("description")
    val Description: JsonElement,
    @SerialName("isLocked")
    val IsLocked: Boolean,
    @SerialName("links")
    val Links: JsonObject,
    @SerialName("originalLanguage")
    val OriginalLanguage: String,
    @SerialName("lastVolume")
    val LastVolume: String? = null,
    @SerialName("lastChapter")
    val LastChapter: String? = null,
    @SerialName("publicationDemographic")
    val PublicationDemographic: PublicationDemographic?,
    @SerialName("status")
    val Status: MangaStatus? = null,
    @SerialName("year")
    val Year: Int? = null,
    @SerialName("contentRating")
    val ContentRating: ContentRating,
    @SerialName("chapterNumbersResetOnNewVolume")
    val ChapterNumbersResetOnNewVolume: Boolean,
    @SerialName("tags")
    val Tags: List<Tag>,
    @SerialName("state")
    val State: UploadState,
    @SerialName("availableTranslatedLanguages")
    val AvailableTranslatedLanguages: List<String>,

    @SerialName("createdAt")
    val CreatedAt: String,
    @SerialName("updatedAt")
    val UpdatedAt: String,
    @SerialName("version")
    val Version: Int,
):Attributes()
