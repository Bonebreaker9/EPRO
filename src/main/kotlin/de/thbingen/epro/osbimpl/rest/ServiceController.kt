package de.thbingen.epro.osbimpl.rest

import org.springframework.web.bind.annotation.RestController

@RestController
class ServiceController : BaseController {
/* not supported
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
    }*/
}