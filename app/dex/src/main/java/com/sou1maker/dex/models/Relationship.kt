package com.sou1maker.dex.models

import com.sou1maker.dex.models.enums.Related
import com.sou1maker.dex.models.enums.Type

/**
 * 关系
 * @property Id String ID
 * @property Type Type 类型
 * @property Related Related? 漫画类型 Related Manga type, only present if you are on a Manga entity and a Manga relationship
 * @property Attributes Object 属性 If Reference Expansion is applied, contains objects attributes
 * @constructor
 */
data class Relationship(
    var Id: String,
    var Type: Type,
    var Related: Related?,
    var Attributes: Any
)