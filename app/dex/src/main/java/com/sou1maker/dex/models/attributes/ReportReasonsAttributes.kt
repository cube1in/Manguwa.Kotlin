package com.sou1maker.dex.models.attributes

import com.sou1maker.dex.models.LocalizedString
import com.sou1maker.dex.models.enums.ReportCategory
import kotlinx.serialization.*

/**
 * 报告原因属性
 * 此Attributes不需要为Relationship提供支持
 * 仅供ReportReasons使用
 * @property Reason LocalizedString
 * @property DetailsRequired Boolean
 * @property Category ReportCategory
 * @constructor
 */
@Serializable
data class ReportReasonsAttributes(
    @SerialName("reason")
    val Reason: LocalizedString,
    @SerialName("detailsRequired")
    val DetailsRequired: Boolean,
    @SerialName("category")
    val Category: ReportCategory,

    @SerialName("version")
    val Version: Int,
)