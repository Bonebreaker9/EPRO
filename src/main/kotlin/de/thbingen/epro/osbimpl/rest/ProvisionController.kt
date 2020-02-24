package de.thbingen.epro.osbimpl.rest

import de.thbingen.epro.osbimpl.model.deprovisioning.DeprovisioningResponse
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
        return TODO()
    }

    @DeleteMapping("/v2/service_instances/{instance_id}")
    fun deprovision(@PathVariable("instance_id") instanceId: String,
                    @RequestParam("accepts_incomplete", required = false) acceptsIncomplete: Boolean,
                    @RequestParam("service_id", required = false) serviceId: String,
                    @RequestParam("plan_id", required = false) planId: String,
                    servletResponse: HttpServletResponse): DeprovisioningResponse {
        return TODO()
    }
}