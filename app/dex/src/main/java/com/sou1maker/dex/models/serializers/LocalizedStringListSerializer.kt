package com.sou1maker.dex.models.serializers

import com.sou1maker.dex.models.LocalizedString
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.*

object LocalizedStringListSerializer :
    JsonTransformingSerializer<List<LocalizedString>>(ListSerializer(LocalizedString.serializer())) {
    override fun transformSerialize(element: JsonElement): JsonElement =
        if (element !is JsonArray) JsonArray(listOf(element)) else element
}