package com.sou1maker.dex.models

import kotlinx.serialization.*

/**
 * 章节
 * @property Hash String 哈希
 * @property Data Iterable<String> 原始质量数据
 * @property DataSaver Iterable<String> 压缩质量数据
 * @constructor
 */
@Serializable
data class AtHomeChapter(
    @SerialName("hash")
    var Hash: String,
    @SerialName("data")
    var Data: Iterable<String>,
    @SerialName("dataSaver")
    var DataSaver: Iterable<String>
)