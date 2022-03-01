package com.sou1maker.dex.models.attributes

import com.sou1maker.dex.models.enums.ReportStatus
import kotlinx.serialization.*

/**
 * 报告属性
 * @property ObjectId String
 * @property Details String
 * @property Status ReportStatus
 * @property CreatedAt String
 * @constructor
 */
@Serializable
data class ReportAttributes(
    @SerialName("objectId")
    val ObjectId: String,
    @SerialName("details")
    val Details: String,
    @SerialName("reportStatus")
    val Status: ReportStatus,
    @SerialName("createdAt")
    val CreatedAt: String,
)