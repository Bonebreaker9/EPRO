package de.thbingen.epro.osbimpl.model.binding

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue

data class LastBindingOperation(
        @JsonProperty("state") val state: State,
        @JsonProperty("description") val description: String?
) {
    enum class State(@JsonValue val string: String) {
        IN_PROGRESS("in progress"),
        SUCCEEDED("succeeded"),
        FAILED("failed")
    }
}