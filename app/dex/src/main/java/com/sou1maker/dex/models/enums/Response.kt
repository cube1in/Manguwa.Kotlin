package com.sou1maker.dex.models.enums

import kotlinx.serialization.*

/**
 * 响应类型
 * 只在 Ok 状态下
 */
@Suppress("unused", "SpellCheckingInspection")
@Serializable
enum class Response {

    /**
     *  默认，无
     */
    @SerialName("none")
    None,

    /**
     *  实体
     */
    @SerialName("entity")
    Entity,

    /**
     *  集合
     */
    @SerialName("collection")
    Collection
}