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
data class UploadSessionFileAttributes(
    @SerialName("originalFileName")
    var OriginalFileName: String,
    @SerialName("fileHash")
    var FileHash: String,
    @SerialName("mimeType")
    var MimeType: String,
    @SerialName("fileSize")
    var FileSize: Int,
    @SerialName("source")
    var Source: Source,

    @SerialName("version")
    var Version: Int,
)
