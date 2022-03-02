package com.sou1maker.dex.models.attributes

import com.sou1maker.dex.models.enums.Source
import kotlinx.serialization.*

/**
 * 文件上传会话属性
 * @property OriginalFileName String
 * @property FileHash String
 * @property MimeType String
 * @property FileSize Int
 * @property Source Source
 * @constructor
 */
@Serializable
@SerialName("upload_session_file")
data class UploadSessionFileAttributes(
    @SerialName("originalFileName")
    val OriginalFileName: String,
    @SerialName("fileHash")
    val FileHash: String,
    @SerialName("mimeType")
    val MimeType: String,
    @SerialName("fileSize")
    val FileSize: Int,
    @SerialName("source")
    val Source: Source,

    @SerialName("version")
    val Version: Int,
):Attributes()
