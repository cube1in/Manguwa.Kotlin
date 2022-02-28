package com.sou1maker.dex.models

/**
 * 章节
 * @property Hash String 哈希
 * @property Data Iterable<String> 原始质量数据
 * @property DataSaver Iterable<String> 压缩质量数据
 * @constructor
 */
data class AtHomeChapter(var Hash: String, var Data: Iterable<String>, var DataSaver: Iterable<String>)