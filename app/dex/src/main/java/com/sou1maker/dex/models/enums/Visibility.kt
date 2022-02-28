package com.sou1maker.dex.models.enums

import kotlinx.serialization.*

/**
 * 可见性
 */
@Suppress("unused", "SpellCheckingInspection")
@Serializable
enum class Visibility {

    /**
     * 默认，无
     */
    @SerialName("none")
    None,

    /**
     * 私有
     */
    @SerialName("private")
    Private,

    /**
     * 公开
     */
    @SerialName("public")
    Public
}