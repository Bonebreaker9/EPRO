package de.thbingen.epro.osbimpl.model.binding.create

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

data class BindingRequest(
        @JsonProperty("context") val context: Any?,
        @JsonProperty("service_id") val serviceId: UUID,
        @JsonProperty("plan_id") val planId: UUID,
        @JsonProperty("app_guid") val appGuid: String?,
        @JsonProperty("bind_resource") val bindResource: BindResource?,
        @JsonProperty("parameters") val parameters: Any?
        ) {
    init {
        if (appGuid?.isEmpty() == true) throw IllegalStateException()
    }
}