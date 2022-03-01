package com.sou1maker.dex.models.attributes

import com.sou1maker.dex.models.enums.Related
import kotlinx.serialization.*

/**
 * 漫画相关属性
 * @property Relation Related
 * @constructor
 */
@Serializable
data class MangaRelationAttributes(
    @SerialName("relation")
    val Relation: Related,

    @SerialName("version")
    val Version: Int,
)
