package de.thbingen.epro.osbimpl.model.updateservice

import com.fasterxml.jackson.annotation.JsonProperty
import de.thbingen.epro.osbimpl.util.assertIfPresent
import java.net.URL

data class UpdateServiceResponse(
        @JsonProperty("dashboard_url") val dashboardUrl: URL?,
        @JsonProperty("operation") val operation: String?
) {
    init {
        operation.assertIfPresent(String::isNotEmpty)
    }
}