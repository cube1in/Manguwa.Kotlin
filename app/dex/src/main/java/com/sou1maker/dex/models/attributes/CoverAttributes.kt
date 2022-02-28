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
    var FileName: String,
    @SerialName("volume")
    var Volume: String?,
    @SerialName("description")
    var Description: String?,
    @SerialName("locale")
    var Locale: String?,

    @SerialName("createdAt")
    var CreatedAt: String,
    @SerialName("updatedAt")
    var UpdatedAt: String,
    @SerialName("version")
    var Version: Int,
)
