package com.sou1maker.dex.models.attributes

import kotlinx.serialization.*

/**
 * 封面属性
 * @property FileName String
 * @property Volume String?
 * @property Description String?
 * @property Locale String?
 * @constructor
 */
@Suppress("unused")
@Serializable
data class CoverAttributes(
    @SerialName("fileName")
    val FileName: String,
    @SerialName("volume")
    val Volume: String?,
    @SerialName("description")
    val Description: String?,
    @SerialName("locale")
    val Locale: String?,

    @SerialName("createdAt")
    val CreatedAt: String,
    @SerialName("updatedAt")
    val UpdatedAt: String,
    @SerialName("version")
    val Version: Int,
)
