package de.thbingen.epro.osbimpl.model.binding.create

import com.fasterxml.jackson.annotation.JsonProperty
import java.net.URL

data class BindingResponse200(
        @JsonProperty("credentials") val credentials: Any?,
        @JsonProperty("syslog_drain_url") val syslogDrainUrl: URL?,
        @JsonProperty("route_service_url") val routeServiceUrl: URL?,
        @JsonProperty("volume_mounts") val volumeMounts: List<VolumeMount>?,
        @JsonProperty("endpoints") val endpoints: List<Endpoint>?
)