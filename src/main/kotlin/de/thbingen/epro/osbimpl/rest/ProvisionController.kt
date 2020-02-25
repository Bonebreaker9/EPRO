package de.thbingen.epro.osbimpl.rest

import de.thbingen.epro.osbimpl.Service
import de.thbingen.epro.osbimpl.model.provisioning.ProvisioningRequest
import de.thbingen.epro.osbimpl.model.provisioning.ProvisioningResponse
import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletResponse

@RestController
class ProvisionController : BaseController {

    @PutMapping("/v2/service_instances/{instance_id}")
    fun provision(@PathVariable("instance_id") instanceId: String,
                  @RequestParam("accepts_incomplete", required = false) acceptsIncomplete: Boolean,
                  @RequestBody provisionBody: ProvisioningRequest,
                  servletResponse: HttpServletResponse): ProvisioningResponse {
        if (Service.instances.any { it.id == instanceId }) {
            servletResponse.status = 409
            return ProvisioningResponse(null, null)
        }

        return try {
            val response = Service.createResource(provisionBody)
            servletResponse.status = 200
            response
        } catch (e: Exception) {
            servletResponse.status = 422
            ProvisioningResponse(null, null)
        }
    }

    @DeleteMapping("/v2/service_instances/{instance_id}")
    fun deprovision(@PathVariable("instance_id") instanceId: String,
                    @RequestParam("accepts_incomplete", required = false) acceptsIncomplete: Boolean,
                    @RequestParam("service_id", required = false) serviceId: String,
                    @RequestParam("plan_id", required = false) planId: String,
                    servletResponse: HttpServletResponse): String {
        if (Service.instances.any { it.id == instanceId }) {
            try {
                Service.deleteResource(instanceId)
                servletResponse.status = 200
            } catch (e: Exception) {
                servletResponse.status = 422
            }
        } else {
            servletResponse.status = 410
        }
        return "{}"

    }
}