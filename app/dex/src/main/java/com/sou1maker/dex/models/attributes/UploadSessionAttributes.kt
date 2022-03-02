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
@SerialName("upload_session")
data class UploadSessionAttributes(
    @SerialName("isCommitted")
    val IsCommitted: Boolean,
    @SerialName("isProcessed")
    val IsProcessed: Boolean,
    @SerialName("isDeleted")
    val IsDeleted: Boolean,

    @SerialName("createdAt")
    val CreatedAt: String,
    @SerialName("updatedAt")
    val UpdatedAt: String,
    @SerialName("version")
    val Version: Int,
):Attributes()
