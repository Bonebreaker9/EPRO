package de.thbingen.epro.osbimpl.model.binding.create

import com.fasterxml.jackson.annotation.JsonProperty
import de.thbingen.epro.osbimpl.util.assertIfPresent

data class BindingResponse202(
        @JsonProperty("operation") val operation: String
) {
    init {
        operation.assertIfPresent { length <= 10000 }
    }
}