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

    companion object {
        val list = mutableListOf<ServicePlan>()

        fun getInstances(): List<ServicePlan> {
            if (list.isEmpty()) {
                val small = ServicePlan(UUID.fromString("82420c0f-f757-409f-80f4-40b633666f59"),
                        "Small",
                        "einzelner kleiner Container mit niedrigen Ressourcen",
                        null,
                        null,
                        null,
                        false,
                        null,
                        null,
                        null)

                val standard = ServicePlan(UUID.fromString("648bf863-d5f7-4501-af14-da092ac6833a"),
                        "Standard",
                        "einzelner Container mit vielen Ressourcen",
                        null,
                        null,
                        null,
                        false,
                        null,
                        null,
                        null)

                val cluster = ServicePlan(UUID.fromString("84a0c934-a7dc-4713-b5d0-83892b2e898b"),
                        "Cluster",
                        "Cluster an Containern",
                        null,
                        null,
                        null,
                        false,
                        null,
                        null,
                        null)

                list.addAll(mutableListOf(small, standard, cluster))
            }
            return list
        }
    }
}