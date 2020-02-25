package de.thbingen.epro.osbimpl.model.catalog

import com.fasterxml.jackson.annotation.JsonProperty
import de.thbingen.epro.osbimpl.util.assertIfPresent
import java.util.*

data class ServiceOffering(
        @JsonProperty("name") val name: String,
        @JsonProperty("id") val id: UUID,
        @JsonProperty("description") val description: String,
        @JsonProperty("tags") val tags: List<String>?,
        @JsonProperty("requires") val requires: List<String>?,
        @JsonProperty("bindable") val bindable: Boolean,
        @JsonProperty("instances_retrievable") val instancesRetrievable: Boolean?,
        @JsonProperty("bindings_retrievable") val bindingsRetrievable: Boolean?,
        @JsonProperty("allow_context_updates") val allowContextUpdates: Boolean?,
        @JsonProperty("metadata") val metadata: List<Byte>?,
        @JsonProperty("dashboard_client") val dashboardClient: DashboardClient?,
        @JsonProperty("plan_updateable") val planUpdateable: Boolean?,
        @JsonProperty("plans") val plans: List<ServicePlan>
) {
    init {
        name.assertIfPresent(String::isNotEmpty)
        description.assertIfPresent(String::isNotEmpty)
        plans.assertIfPresent(List<ServicePlan>::isNotEmpty)
    }

    companion object {
        fun getInstances(): List<ServiceOffering> {
            val list = mutableListOf<ServiceOffering>()
            val jpaOffering = ServiceOffering(name = "JPA",
                    id = UUID.fromString("86aa2765-b782-408a-878f-de3262ab8c64"),
                    description = "Offers a JPA-Conform Database",
                    tags = listOf("relational", "sql"),
                    requires = null,
                    bindable = true,
                    instancesRetrievable = false,
                    bindingsRetrievable = false,
                    allowContextUpdates = null,
                    metadata = null,
                    dashboardClient = null,
                    planUpdateable = null,
                    plans = ServicePlan.getInstances()
            )
            list.add(jpaOffering)
            return list
        }
    }
}