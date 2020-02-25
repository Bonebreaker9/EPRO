package de.thbingen.epro.osbimpl.rest

import de.thbingen.epro.osbimpl.model.binding.DeleteBindingResponse
import de.thbingen.epro.osbimpl.model.binding.create.BindingRequest
import org.springframework.web.bind.annotation.*
import javax.servlet.http.HttpServletResponse

@RestController
class BindingController : BaseController {
/* not needed since no 202 is returned
    @GetMapping("/v2/service_instances/{instance_id}/last_operation")
    fun lastOperationOnInstance(@PathVariable("instance_id") instanceId: String,
                                @RequestParam("service_id", required = false) serviceId: String,
                                @RequestParam("plan_id", required = false) planId: String,
                                @RequestParam("operation", required = false) operation: String,
                                servletResponse: HttpServletResponse): LastServiceOperation {
        return TODO()
    }

    @GetMapping("/v2/service_instances/{instance_id}/service_bindings/{binding_id}/last_operation")
    fun lastOperationOnBinding(@PathVariable("binding_id") bindingId: String,
                               @PathVariable("instance_id") instanceId: String,
                               @RequestParam("service_id", required = false) serviceId: String,
                               @RequestParam("plan_id", required = false) planId: String,
                               @RequestParam("operation", required = false) operation: String,
                               servletResponse: HttpServletResponse): LastServiceOperation {
        return TODO()
    }*/

    @PutMapping("/v2/service_instances/{instance_id}/service_bindings/{binding_id}")
    fun bind(@PathVariable("binding_id") bindingId: String,
             @PathVariable("instance_id") instanceId: String,
             @RequestParam("accepts_incomplete", required = false) acceptsIncomplete: Boolean,
             @RequestBody bindingRequest: BindingRequest,
             servletResponse: HttpServletResponse): Any {
        return TODO("return BindingResponse200 or BindingResponse202")
    }
/* not supported
    @GetMapping("/v2/service_instances/{instance_id}/service_bindings/{binding_id}")
    fun fetchBinding(@PathVariable("binding_id") bindingId: String,
                     @PathVariable("instance_id") instanceId: String,
                     @RequestParam("service_id", required = false) serviceId: String,
                     @RequestParam("plan_id", required = false) planId: String,
                     servletResponse: HttpServletResponse): GetBindingResponse {
        return TODO()
    }*/

    @DeleteMapping("/v2/service_instances/{instance_id}/service_bindings/{binding_id}")
    fun deleteBinding(@PathVariable("binding_id") bindingId: String,
                      @PathVariable("instance_id") instanceId: String,
                      @RequestParam("service_id", required = false) serviceId: String,
                      @RequestParam("plan_id", required = false) planId: String,
                      @RequestParam("accepts_incomplete", required = false) acceptsIncomplete: Boolean,
                      servletResponse: HttpServletResponse): DeleteBindingResponse {
        return TODO()
    }


}