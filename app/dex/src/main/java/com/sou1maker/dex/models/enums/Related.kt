package com.sou1maker.dex.models.enums

import kotlinx.serialization.*

/**
 * 此数据用于漫画关系的“相关”领域
 */
@Suppress("unused", "SpellCheckingInspection")
@Serializable
enum class Related {

    /**
     *  默认，无
     */
    @SerialName("none")
    None,

    /**
     * 这部漫画的单色变体
     */
    @SerialName("monochrome")
    Monochrome,

    /**
     * 这部漫画的彩色变体
     */
    @SerialName("colored")
    Colored,

    /**
     * 保存
     * 这部漫画在正式连载之前的原版
     */
    @SerialName("preserialization")
    Preserialization,

    /**
     * 连载
     * 这部漫画的正式连载
     */
    @SerialName("serialization")
    Serialization,

    /**
     * 前传
     * 同一系列中的上一个条目
     */
    @SerialName("prequel")
    Prequel,

    /**
     * 续集
     * 同一系列的下一个条目
     */
    @SerialName("sequel")
    Sequel,

    /**
     * 主要
     * 这部漫画的是基于原始叙事
     */
    @SerialName("main_story")
    MainStory,

    /**
     * 小故事
     * 与这部漫画的故事同时发生的副业
     */
    @SerialName("side_story")
    SideStory,

    /**
     * 改编自
     * 这部衍生漫画的原著改编自
     */
    @SerialName("adapted_from")
    AdaptedFrom,

    /**
     * 分离
     * 基于这部漫画的官方衍生作品
     */
    @SerialName("spin_off")
    SpinOff,

    /**
     * 基于
     * 这部自助出版的衍生漫画是基于原著
     */
    @SerialName("based_on")
    BasedOn,

    /**
     * 斗金石
     * 根据这部漫画自行出版的衍生作品
     */
    @SerialName("doujinshi")
    DouJinShi,

    /**
     * 同样的特权
     * 这部漫画的知识产权和这部漫画一样
     */
    @SerialName("same_franchise")
    SameFranchise,

    /**
     * 共享宇宙
     * 一部漫画发生在和这部漫画一样的虚构世界里
     */
    @SerialName("shared_universe")
    SharedUniverse,

    /**
     * 另一个故事
     * 这部漫画的另一个故事
     */
    @SerialName("alternate_story")
    AlternateStory,

    /**
     * 替代版本
     * 这部漫画的另一个版本没有其他特别的区别
     */
    @SerialName("alternate_version")
    AlternateVersion,
}