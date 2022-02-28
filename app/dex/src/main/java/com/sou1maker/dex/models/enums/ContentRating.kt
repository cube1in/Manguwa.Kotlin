package com.sou1maker.dex.models.enums

import kotlinx.serialization.*

/**
 * 内容分级
 */
@Suppress("unused", "SpellCheckingInspection")
@Serializable
enum class ContentRating {

    /**
     * 默认，无
     */
    @SerialName("none")
    None,


    /**
     * 安全
     */
    @SerialName("safe")
    Safe,


    /**
     * 性暗示
     */
    @SerialName("suggestive")
    Suggestive,


    /**
     * 黄色
     */
    @SerialName("erotica")
    Erotica,


    /**
     * 色情
     */
    @SerialName("pornographic")
    Pornographic
}