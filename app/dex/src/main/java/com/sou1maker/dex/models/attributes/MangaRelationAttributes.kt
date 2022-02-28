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
    var Relation: Related,

    @SerialName("version")
    var Version: Int,
)
