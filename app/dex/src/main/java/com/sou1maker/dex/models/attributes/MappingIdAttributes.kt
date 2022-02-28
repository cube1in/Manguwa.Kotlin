package com.sou1maker.dex.models.attributes

import com.sou1maker.dex.models.enums.Type
import kotlinx.serialization.*

/**
 * 映射ID属性
 * @property Type Type
 * @property LegacyId Int
 * @property NewId Int
 * @constructor
 */
@Serializable
data class MappingIdAttributes(
    @SerialName("type")
    var Type: Type,
    @SerialName("legacyId")
    var LegacyId: Int,
    @SerialName("newId ")
    var NewId: Int,
)
