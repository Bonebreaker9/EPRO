package de.thbingen.epro.osbimpl.model.error

import com.fasterxml.jackson.annotation.JsonProperty
import de.thbingen.epro.osbimpl.util.assertIfPresent

data class ErrorResponse(
        @JsonProperty("error") val error: String?,
        @JsonProperty("description") val description: String?
) {
    init {
        error.assertIfPresent(String::isNotEmpty)
        description.assertIfPresent(String::isNotEmpty)
    }

    enum class StandardErrors(val error: String) {
        ASYNC_REQUIRED("AsyncRequired"),
        CONCURRENCY_ERROR("ConcurrencyError"),
        REQUIRES_APP("RequiresApp"),
        MAINTENANCE_INFO_CONFLICT("MaintenanceConflict")
    }
}