package de.thbingen.epro.osbimpl.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.net.URL
import java.util.*

data class ServiceInstance(
        @JsonProperty("service_id") val serviceId: UUID?,
        @JsonProperty("plan_id") val planId: UUID?,
        @JsonProperty("dashboard_url") val dashboardUrl: URL?,
        @JsonProperty("parameters") val parameters: Any?
)