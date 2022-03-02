package com.sou1maker.dex.models.attributes

import com.sou1maker.dex.models.enums.Visibility
import kotlinx.serialization.*

/**
 * 自定义列表属性
 * @property Name String
 * @property Visibility Visibility
 * @constructor
 */
@Suppress("unused")
@Serializable
@SerialName("custom_list")
data class CustomListAttributes(
    @SerialName("name")
    val Name: String,
    @SerialName("visibility")
    val Visibility: Visibility,

    @SerialName("version")
    val Version: Int,
):Attributes()
