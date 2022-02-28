package com.sou1maker.dex.models.enums

import kotlinx.serialization.*

/**
 * 源
 */
@Suppress("unused", "SpellCheckingInspection")
@Serializable
enum class Source {

    /**
     * 默认，无
     */
    @SerialName("none")
    None,

    /**
     * 本地
     */
    @SerialName("local")
    Local,

    /**
     * 远程
     */
    @SerialName("remote")
    Remote
}