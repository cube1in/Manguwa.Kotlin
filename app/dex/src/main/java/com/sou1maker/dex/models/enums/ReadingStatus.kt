package com.sou1maker.dex.models.enums

import kotlinx.serialization.*

/**
 * 漫画阅读状态
 */
@Suppress("unused", "SpellCheckingInspection")
@Serializable
enum class ReadingStatus {

    /**
     * 默认，无
     */
    @SerialName("none")
    None,

    /**
     * 正在阅读
     */
    @SerialName("reading")
    Reading,

    /**
     * 等一下
     */
    @SerialName("on_hold")
    OnHold,

    /**
     * 计划阅读
     */
    @SerialName("plan_to_read")
    PlanToRead,

    /**
     * 下降
     */
    @SerialName("dropped")
    Dropped,

    /**
     * 重读
     */
    @SerialName("re_reading")
    Rereading,

    /**
     * 完成
     */
    @SerialName("completed")
    Completed
}