package de.thbingen.epro.osbimpl.model.catalog

import com.fasterxml.jackson.annotation.JsonProperty
import de.thbingen.epro.osbimpl.model.catalog.ServiceOffering

data class Catalog(
        @JsonProperty("services") val services: List<ServiceOffering>
)