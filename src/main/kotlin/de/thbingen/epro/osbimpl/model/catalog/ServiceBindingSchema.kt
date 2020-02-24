package de.thbingen.epro.osbimpl.model.catalog

import com.fasterxml.jackson.annotation.JsonProperty

data class ServiceBindingSchema(
        @JsonProperty("create") val create: InputParametersSchema?
)