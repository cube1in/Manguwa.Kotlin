package com.sou1maker.dex.models.attributes

import kotlinx.serialization.*

/**
 * 用户属性
 * @property Username String
 * @property Roles List<String>
 * @constructor
 */
@Serializable
@SerialName("user")
data class UserAttributes(
    @SerialName("username")
    val Username: String,
    @SerialName("roles")
    val Roles: List<String>,

    @SerialName("version")
    val Version: Int,
):Attributes()
