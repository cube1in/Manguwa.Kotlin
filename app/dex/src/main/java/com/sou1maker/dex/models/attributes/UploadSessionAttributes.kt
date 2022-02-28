package com.sou1maker.dex.models.attributes

import kotlinx.serialization.*

/**
 * 上传会话属性
 * @property IsCommitted Boolean
 * @property IsProcessed Boolean
 * @property IsDeleted Boolean
 * @constructor
 */
@Serializable
data class UploadSessionAttributes(
    @SerialName("isCommitted")
    var IsCommitted: Boolean,
    @SerialName("isProcessed")
    var IsProcessed: Boolean,
    @SerialName("isDeleted")
    var IsDeleted: Boolean,

    @SerialName("createdAt")
    var CreatedAt: String,
    @SerialName("updatedAt")
    var UpdatedAt: String,
    @SerialName("version")
    var Version: Int,
)
