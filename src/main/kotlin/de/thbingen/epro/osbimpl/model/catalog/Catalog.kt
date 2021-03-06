package de.thbingen.epro.osbimpl.model.catalog

import com.fasterxml.jackson.annotation.JsonProperty

data class Catalog(
        @JsonProperty("services") val services: List<ServiceOffering>
) {
    companion object {
        val catalog: Catalog = createCatalog()

        private fun createCatalog(): Catalog {
            return Catalog(ServiceOffering.getInstances())
        }
    }
}

