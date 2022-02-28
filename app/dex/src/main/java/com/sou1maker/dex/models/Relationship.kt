package com.sou1maker.dex.models

import com.sou1maker.dex.models.enums.*
import kotlinx.serialization.*

/**
 * 关系
 * @property Id String ID
 * @property Type Type 类型
 * @property Related Related? 漫画类型 Related Manga type, only present if you are on a Manga entity and a Manga relationship
 * @property Attributes Object 属性 If Reference Expansion is applied, contains objects attributes
 * @constructor
 */
@Serializable
data class Relationship(
    @SerialName("id")
    var Id: String,
    @SerialName("type")
    var Type: Type,
    @SerialName("related")
    var Related: Related?,
    @SerialName("attributes")
    var Attributes: Any
)