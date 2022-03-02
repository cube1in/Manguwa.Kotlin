package com.sou1maker.dex.models.attributes

import com.sou1maker.dex.models.LocalizedString
import com.sou1maker.dex.models.serializers.LocalizedStringListSerializer
import kotlinx.serialization.*
import kotlinx.serialization.json.JsonElement

/**
 * 标签属性
 * @property Name String
 * @property Group String
 * @property Description LocalizedString?
 * @constructor
 */
@Serializable
@SerialName("tag")
data class TagAttributes(
    @SerialName("name")
    val Name: LocalizedString,
    @SerialName("group")
    val Group: String,

//    @Serializable(with = LocalizedStringListSerializer::class)
    @SerialName("description")
    val Description: JsonElement,

    @SerialName("version")
    val Version: Int,
):Attributes()
