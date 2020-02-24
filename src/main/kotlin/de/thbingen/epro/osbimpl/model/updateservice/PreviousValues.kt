package de.thbingen.epro.osbimpl.model.updateservice

import com.fasterxml.jackson.annotation.JsonProperty
import de.thbingen.epro.osbimpl.model.catalog.MaintenanceInfo
import java.util.*

data class PreviousValues(
        @JsonProperty("service_id") val serviceId: UUID?,
        @JsonProperty("plan_id") val planId: UUID?,
        @JsonProperty("organization_id") val organizationId: String?,
        @JsonProperty("space_id") val spaceId: String?,
        @JsonProperty("maintenance_info") val maintenanceInfo: MaintenanceInfo?
)