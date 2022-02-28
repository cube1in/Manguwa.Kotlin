package com.sou1maker.dex.models.enums

import kotlinx.serialization.*

/**
 * 漫画状态
 */
@Suppress("unused", "SpellCheckingInspection")
@Serializable
enum class MangaStatus {

    /**
     * 默认，无
     */
    @SerialName("none")
    None,

    /**
     * 漫画还在继续
     */
    @SerialName("ongoing")
    Ongoing,

    /**
     * 漫画完成了
     */
    @SerialName("completed")
    Completed,

    /**
     * 漫画暂停了
     */
    @SerialName("hiatus")
    Hiatus,

    /**
     * 漫画被取消了
     */
    @SerialName("cancelled")
    Cancelled
}