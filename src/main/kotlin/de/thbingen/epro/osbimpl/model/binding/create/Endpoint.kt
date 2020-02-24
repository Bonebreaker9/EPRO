package de.thbingen.epro.osbimpl.model.binding.create

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue

data class Endpoint(
        @JsonProperty("host") val host: String,
        @JsonProperty("ports") val ports: List<String>,
        @JsonProperty("protocol") val protocol: Protocol?
) {
    init {
        assert(ports.all { it.matches(portRegEx) })
    }

    companion object {
        private val portRegEx = Regex("^\\d+(?:-\\d+)?$")
    }

    enum class Protocol(@JsonValue val string: String) {
        TCP("tcp"), UDP("udp"), ALL("all")
    }
}