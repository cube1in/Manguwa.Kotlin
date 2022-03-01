package com.sou1maker.dex.models

import com.sou1maker.dex.models.attributes.MangaAttributes
import com.sou1maker.dex.models.enums.Type
import kotlinx.serialization.*

/**
 * 漫画
 * @property Id String
 * @property Type Type
 * @property Attributes MangaAttributes
 * @property Relationships Iterable<Relationship>
 * @constructor
 */
@Serializable
data class Manga(
    @SerialName("id")
    val Id: String,
    @SerialName("type")
    val Type: Type,
    @SerialName("attributes")
    val Attributes: MangaAttributes,
    @SerialName("relationships")
    val Relationships: Iterable<Relationship>,
)