package de.thbingen.epro.osbimpl

import de.thbingen.epro.osbimpl.model.deprovisioning.DeprovisioningResponse
import de.thbingen.epro.osbimpl.model.provisioning.ProvisioningRequest
import de.thbingen.epro.osbimpl.model.provisioning.ProvisioningResponse

class Service(val id: String) {


    companion object {
        val instances: List<Service> = listOf()

        fun createResource(provisioningRequest: ProvisioningRequest): ProvisioningResponse {

            return TODO()
        }

        fun deleteResource(instanceId: String): DeprovisioningResponse {
            return TODO()
        }
    }
}