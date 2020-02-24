package de.thbingen.epro.osbimpl.model.catalog

import com.fasterxml.jackson.annotation.JsonProperty

data class ServiceInstanceSchema(
        @JsonProperty("create") val create: InputParametersSchema?,
        @JsonProperty("update") val update: InputParametersSchema?
)