package com.sou1maker.dex.models.enums

import kotlinx.serialization.*

/**
 * 报告状态
 */
@Suppress("unused", "SpellCheckingInspection")
@Serializable
enum class ReportStatus {

    /**
     *  默认，无
     */
    @SerialName("none")
    None,

    /**
     * 等待
     */
    @SerialName("waiting")
    Waiting,

    /**
     * 已接受
     */
    @SerialName("accepted")
    Accepted,

    /**
     * 已拒绝
     */
    @SerialName("refused")
    Refused,

    /**
     * 已自动处理
     */
    @SerialName("autoresolved")
    Autoresolved
}
