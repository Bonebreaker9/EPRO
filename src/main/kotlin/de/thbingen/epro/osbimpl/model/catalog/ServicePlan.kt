package de.thbingen.epro.osbimpl.model.catalog

import com.fasterxml.jackson.annotation.JsonProperty
import de.thbingen.epro.osbimpl.util.assertIfPresent
import java.util.*

data class ServicePlan(
        @JsonProperty("id") val id: UUID,
        @JsonProperty("name") val name: String,
        @JsonProperty("description") val description: String,
        @JsonProperty("metadata") val metadata: List<Byte>?,
        @JsonProperty("free") val free: Boolean?,
        @JsonProperty("bindable") val bindable: Boolean?,
        @JsonProperty("plan_updateable") val planUpdateable: Boolean?,
        @JsonProperty("schemas") val schemas: Schemas?,
        @JsonProperty("maximum_polling_duration") val maximumPollingDuration: Int?,
        @JsonProperty("maintenance_info") val maintenanceInfo: MaintenanceInfo?
) {
    init {
        name.assertIfPresent(String::isNotEmpty)
        description.assertIfPresent(String::isNotEmpty)
    }
}