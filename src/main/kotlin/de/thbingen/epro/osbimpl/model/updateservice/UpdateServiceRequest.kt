package de.thbingen.epro.osbimpl.model.updateservice

import com.fasterxml.jackson.annotation.JsonProperty
import de.thbingen.epro.osbimpl.model.catalog.MaintenanceInfo
import java.util.*

data class UpdateServiceRequest(
        @JsonProperty("context") val context: Any?,
        @JsonProperty("service_id") val serviceId: UUID,
        @JsonProperty("plan_id") val planId: UUID,
        @JsonProperty("parameters") val parameters: Any?,
        @JsonProperty("previous_values") val previousValues: PreviousValues,
        @JsonProperty("maintenance_info") val maintenanceInfo: MaintenanceInfo?
)