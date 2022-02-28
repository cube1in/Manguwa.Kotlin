package com.sou1maker.dex.models.enums

import kotlinx.serialization.*

/**
 * 报告分类
 */
@Suppress("unused", "SpellCheckingInspection")
@Serializable
enum class ReportCategory {

    /**
     * 默认，无
     */
    @SerialName("none")
    None,

    /**
     * 漫画
     */
    @SerialName("manga")
    Manga,

    /**
     * 扫描组
     */
    @SerialName("scanlation_group")
    ScanlationGroup,

    /**
     * 用户
     */
    @SerialName("user")
    User,

    /**
     * 作者
     */
    @SerialName("author")
    Author
}