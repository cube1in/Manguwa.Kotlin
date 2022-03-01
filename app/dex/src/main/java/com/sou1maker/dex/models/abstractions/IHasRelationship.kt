package com.sou1maker.dex.models.abstractions

import com.sou1maker.dex.models.Relationship

interface IHasRelationship {
    val relationships: Iterable<Relationship>
}