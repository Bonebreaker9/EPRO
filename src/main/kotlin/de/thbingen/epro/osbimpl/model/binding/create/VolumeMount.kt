package de.thbingen.epro.osbimpl.model.binding.create

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue

data class VolumeMount(
        @JsonProperty("driver") val driver: String,
        @JsonProperty("container_dir") val containerDir: String,
        @JsonProperty("mode") val mode: Mode,
        @JsonProperty("device_type") val deviceType: String,
        @JsonProperty("device") val device: Device
) {
    enum class Mode(@JsonValue val string: String) {
        R("r"), RW("rw")
    }
}