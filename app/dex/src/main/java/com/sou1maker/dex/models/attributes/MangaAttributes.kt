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
    var Title: String,
    @SerialName("altTitles")
    var AltTitles: Iterable<LocalizedString>,

    // TODO: object or array
    @SerialName("description")
    var Description: LocalizedString?,
    @SerialName("isLocked")
    var IsLocked: Boolean,
    @SerialName("links")
    var Links: Any,
    @SerialName("originalLanguage")
    var OriginalLanguage: String,
    @SerialName("lastVolume")
    var LastVolume: String?,
    @SerialName("lastChapter")
    var LastChapter: String?,
    @SerialName("publicationDemographic")
    var PublicationDemographic: PublicationDemographic?,
    @SerialName("status")
    var Status: MangaStatus?,
    @SerialName("year")
    var Year: Int?,
    @SerialName("contentRating")
    var ContentRating: ContentRating,
    @SerialName("chapterNumbersResetOnNewVolume")
    var ChapterNumbersResetOnNewVolume: Boolean,
    @SerialName("tags")
    var Tags: Iterable<String>,
    @SerialName("state")
    var State: UploadState,

    @SerialName("createdAt")
    var CreatedAt: String,
    @SerialName("updatedAt")
    var UpdatedAt: String,
    @SerialName("version")
    var Version: Int,
)
