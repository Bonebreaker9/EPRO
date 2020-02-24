package de.thbingen.epro.osbimpl.model.provisioning

import com.fasterxml.jackson.annotation.JsonProperty
import de.thbingen.epro.osbimpl.model.catalog.MaintenanceInfo
import java.util.*

data class ProvisioningRequest(
        @JsonProperty("service_id") val serviceId: UUID,
        @JsonProperty("plan_id") val planId: UUID,
        @JsonProperty("context") val context: Any?,
        @JsonProperty("organization_guid") val organizationGuid: String,
        @JsonProperty("space_guid") val spaceGuid: String,
        @JsonProperty("parameters") val parameters: Any?,
        @JsonProperty("maintenance_info") val maintenanceInfo: MaintenanceInfo?
) {
    init {
        if (organizationGuid.isEmpty()) throw IllegalStateException()
        if (spaceGuid.isEmpty()) throw IllegalStateException()
    }
}