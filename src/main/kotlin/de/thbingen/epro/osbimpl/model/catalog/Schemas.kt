package de.thbingen.epro.osbimpl.model.catalog

import com.fasterxml.jackson.annotation.JsonProperty

data class Schemas(
        @JsonProperty("service_instance") val serviceInstance: ServiceInstanceSchema?,
        @JsonProperty("service_binding") val serviceBinding: ServiceBindingSchema?
)