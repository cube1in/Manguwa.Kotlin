package com.sou1maker.dex.models

import com.sou1maker.dex.models.attributes.TagAttributes
import com.sou1maker.dex.models.enums.Type
import kotlinx.serialization.*

@Serializable
data class Tag(
    @SerialName("id")
    val Id: String,
    @SerialName("type")
    val Type: Type,
    @SerialName("attributes")
    val Attributes: TagAttributes,
    @SerialName("relationships")
    val Relationships: List<Relationship>,
)
