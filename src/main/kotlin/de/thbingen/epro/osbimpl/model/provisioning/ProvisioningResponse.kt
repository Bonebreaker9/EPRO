package de.thbingen.epro.osbimpl.model.provisioning

import com.fasterxml.jackson.annotation.JsonProperty
import de.thbingen.epro.osbimpl.util.assertIfPresent
import java.net.URL

data class ProvisioningResponse(
        @JsonProperty("dashboard_url") val dashboardUrl: URL?,
        @JsonProperty("operation") val operation: String?
) {
    init {
        operation.assertIfPresent { length <= 10000 }
    }
}