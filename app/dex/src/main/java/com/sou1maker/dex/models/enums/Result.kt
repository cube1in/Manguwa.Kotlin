package com.sou1maker.dex.models.enums

import kotlinx.serialization.*

/**
 * 响应结果
 */
@Suppress("unused", "SpellCheckingInspection")
@Serializable
enum class Result {

    /**
     * 默认，无
     */
    @SerialName("none")
    None,

    /**
     * 成功
     */
    @SerialName("ok")
    Ok,

    /**
     * 错误
     */
    @SerialName("error")
    Error
}