package de.thbingen.epro.osbimpl.rest

import de.thbingen.epro.osbimpl.model.ServiceInstance
import de.thbingen.epro.osbimpl.model.updateservice.UpdateServiceRequest
import de.thbingen.epro.osbimpl.model.updateservice.UpdateServiceResponse
import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletResponse

@RestController
class ServiceController : BaseController {

    @GetMapping("/v2/service_instances/{instance_id}")
    fun getInstanceById(@PathVariable("instance_id") instanceId: String,
                        @RequestParam("accepts_incomplete", required = false) acceptsIncomplete: Boolean,
                        @RequestParam("plan_id", required = false) planId: String,
                        servletResponse: HttpServletResponse): ServiceInstance {
        return TODO()
    }

    @PatchMapping("/v2/service_instances/{instance_id}")
    fun updateService(@PathVariable("instance_id") instanceId: String,
                      @RequestParam("accepts_incomplete", required = false) acceptsIncomplete: Boolean,
                      @RequestBody updateServiceRequest: UpdateServiceRequest,
                      servletResponse: HttpServletResponse): UpdateServiceResponse {
        return TODO()
    }
}