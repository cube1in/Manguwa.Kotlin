package com.sou1maker.dex.models.attributes

import android.opengl.Visibility
import kotlinx.serialization.*

/**
 * 自定义列表属性
 * @property Name String
 * @property Visibility Visibility
 * @constructor
 */
@Suppress("unused")
@Serializable
data class CustomListAttributes(
    @SerialName("name")
    val Name: String,
    @SerialName("visibility")
    val Visibility: Visibility,
    
    @SerialName("version")
    val Version: Int,
)
