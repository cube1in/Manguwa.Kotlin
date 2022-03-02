package com.sou1maker.dex.models

import kotlinx.serialization.*

/**
 * 章节
 * @property Hash String 哈希
 * @property Data List<String> 原始质量数据
 * @property DataSaver List<String> 压缩质量数据
 * @constructor
 */
@Serializable
data class AtHomeChapter(
    @SerialName("hash")
    val Hash: String,
    @SerialName("data")
    val Data: List<String>,
    @SerialName("dataSaver")
    val DataSaver: List<String>
)