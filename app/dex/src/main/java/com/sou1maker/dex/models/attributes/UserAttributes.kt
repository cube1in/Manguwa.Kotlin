package com.sou1maker.dex.models.attributes

import kotlinx.serialization.*

/**
 * 用户属性
 * @property Username String
 * @property Roles Iterable<String>
 * @constructor
 */
@Serializable
data class UserAttributes(
    @SerialName("username")
    val Username: String,
    @SerialName("roles")
    val Roles: Iterable<String>,

    @SerialName("version")
    val Version: Int,
)
