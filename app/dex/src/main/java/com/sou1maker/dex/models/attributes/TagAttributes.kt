package com.sou1maker.dex.models.attributes

import com.sou1maker.dex.models.LocalizedString
import kotlinx.serialization.*

/**
 * 标签属性
 * @property Name String
 * @property Group String
 * @property Description LocalizedString?
 * @constructor
 */
@Serializable
data class TagAttributes(
    @SerialName("name")
    val Name: String,
    @SerialName("group")
    val Group: String,

    // TODO: object or array
    @SerialName("description")
    val Description: LocalizedString?,
    
    @SerialName("version")
    val Version: Int,
)
