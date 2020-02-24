package de.thbingen.epro.osbimpl.model.binding.create

import com.fasterxml.jackson.annotation.JsonProperty

data class Device(
        @JsonProperty("volume_id") val volumeId: String,
        @JsonProperty("mount_config") val mountConfig: Any?
)