package com.sou1maker.dex.models.attributes

import com.sou1maker.dex.models.LocalizedString
import com.sou1maker.dex.models.enums.*
import kotlinx.serialization.*

/**
 * 漫画属性
 * @property Title String
 * @property AltTitles Iterable<String>
 * @property Description LocalizedString?
 * @property IsLocked Boolean
 * @property Links Any
 * @property OriginalLanguage String
 * @property LastVolume String?
 * @property LastChapter String?
 * @property PublicationDemographic PublicationDemographic?
 * @property Status MangaStatus?
 * @property Year Int?
 * @property ContentRating ContentRating
 * @property ChapterNumbersResetOnNewVolume Boolean
 * @property Tags Iterable<String>
 * @property State UploadState
 * @constructor
 */
@Serializable
data class MangaAttributes(
    @SerialName("title")
    val Title: String,
    @SerialName("altTitles")
    val AltTitles: Iterable<LocalizedString>,

    // TODO: object or array
    @SerialName("description")
    val Description: LocalizedString?,
    @SerialName("isLocked")
    val IsLocked: Boolean,
    @SerialName("links")
    val Links: Any,
    @SerialName("originalLanguage")
    val OriginalLanguage: String,
    @SerialName("lastVolume")
    val LastVolume: String?,
    @SerialName("lastChapter")
    val LastChapter: String?,
    @SerialName("publicationDemographic")
    val PublicationDemographic: PublicationDemographic?,
    @SerialName("status")
    val Status: MangaStatus?,
    @SerialName("year")
    val Year: Int?,
    @SerialName("contentRating")
    val ContentRating: ContentRating,
    @SerialName("chapterNumbersResetOnNewVolume")
    val ChapterNumbersResetOnNewVolume: Boolean,
    @SerialName("tags")
    val Tags: Iterable<String>,
    @SerialName("state")
    val State: UploadState,

    @SerialName("createdAt")
    val CreatedAt: String,
    @SerialName("updatedAt")
    val UpdatedAt: String,
    @SerialName("version")
    val Version: Int,
)
