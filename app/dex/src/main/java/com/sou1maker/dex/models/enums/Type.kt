package com.sou1maker.dex.models.enums

import kotlinx.serialization.*

/**
 * 类型
 */
@Suppress("unused", "SpellCheckingInspection")
@Serializable
enum class Type {
    /**
     * 默认，无
     */
    None,

    /**
     * 漫画资源
     */
    Manga,

    /**
     * 标签资源
     */
    Tag,

    /**
     * 漫画的封面艺术
     */
    @SerialName("cover_art")
    CoverArt,

    /**
     * 章节资源
     */
    Chapter,

    /**
     * 扫描组资源
     */
    @SerialName("scanlation_group")
    ScanlationGroup,

    /**
     * 用户资源
     */
    User,

    /**
     * 自定义列表资源
     */
    @SerialName("custom_list")
    CustomList,

    /**
     * 作者资源
     */
    Author,

    /**
     * 作者资源（仅限抽屉）
     * Author resource (drawers only)
     */
    Artist,

    /**
     * 映射 ID
     */
    @SerialName("mapping_id")
    MappingId,

    /**
     * 漫画关系
     */
    @SerialName("manga_relation")
    MangaRelation,

    /**
     * 上传会话
     */
    @SerialName("upload_session")
    UploadSession,

    /**
     * 上传会话文件
     */
    @SerialName("upload_session_file")
    UploadSessionFile,

    /**
     * 报告
     */
    Report
}