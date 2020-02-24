package de.thbingen.epro.osbimpl.model.catalog

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import de.thbingen.epro.osbimpl.model.LastServiceOperation

data class LastBindingOperation(
        @JsonProperty("state") val state: LastServiceOperation.State,
        @JsonProperty("description") val description: String?
) {
    enum class State(@JsonValue val string: String) {
        IN_PROGRESS("in progress"),
        SUCCEEDED("succeeded"),
        FAILED("failed")
    }
}