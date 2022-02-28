package com.sou1maker.dex.models.enums

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * 出版物人口统计
 */
@Suppress("unused", "SpellCheckingInspection")
@Serializable
enum class PublicationDemographic {

    /**
     * 默认，无
     */
    @SerialName("none")
    None,

    /**
     * 少年
     */
    @SerialName("shounen")
    Shounen,

    /**
     * 少女
     */
    @SerialName("shoujo")
    Shoujo,

    /**
     * 女士
     */
    @SerialName("josei")
    Josei,

    /**
     * 青年
     */
    @SerialName("seinen")
    Seinen
}