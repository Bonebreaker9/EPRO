package de.thbingen.epro.osbimpl.model.binding

import com.fasterxml.jackson.annotation.JsonProperty
import de.thbingen.epro.osbimpl.model.binding.create.Endpoint
import de.thbingen.epro.osbimpl.model.binding.create.VolumeMount
import java.net.URL

data class GetBindingResponse(
        @JsonProperty("credentials") val credentials: Any?,
        @JsonProperty("syslog_drain_url") val syslogDrainUrl: URL?,
        @JsonProperty("route_service_url") val routeServiceUrl: URL?,
        @JsonProperty("volume_mounts") val volumeMounts: List<VolumeMount>?,
        @JsonProperty("parameters") val parameters: Any?,
        @JsonProperty("endpoints") val endpoints: List<Endpoint>?
)