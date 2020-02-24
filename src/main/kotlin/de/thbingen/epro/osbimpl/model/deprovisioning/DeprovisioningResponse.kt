package de.thbingen.epro.osbimpl.model.deprovisioning

import com.fasterxml.jackson.annotation.JsonProperty
import de.thbingen.epro.osbimpl.util.assertIfPresent

data class DeprovisioningResponse(
        @JsonProperty("operation") val operation: String
) {
    init {
        operation.assertIfPresent { length <= 10000 }
    }
}