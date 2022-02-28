package com.sou1maker.dex.models.enums

import kotlinx.serialization.*

/**
 * 上传状态
 */
@Suppress("unused", "SpellCheckingInspection")
@Serializable
enum class UploadState {

    /**
     * 默认，无
     */
    @SerialName("none")
    None,

    /**
     * 草稿
     */
    @SerialName("draft")
    Draft,

    /**
     * 已提交
     */
    @SerialName("submitted")
    Submitted,

    /**
     * 已发表
     */
    @SerialName("published")
    Published,

    /**
     * 已拒绝
     */
    @SerialName("rejected")
    Rejected
}