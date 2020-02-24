package de.thbingen.epro.osbimpl.model.binding

import com.fasterxml.jackson.annotation.JsonProperty
import de.thbingen.epro.osbimpl.util.assertIfPresent

data class DeleteBindingResponse(
        @JsonProperty("operation") val operation: String
) {
    init {
        operation.assertIfPresent { length <= 10000 }
    }
}