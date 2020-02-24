package de.thbingen.epro.osbimpl.rest

import de.thbingen.epro.osbimpl.model.catalog.Catalog
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletResponse

@RestController
class CatalogController : BaseController {

    @GetMapping("/v2/catalog")
    fun getCatalog(servletResponse: HttpServletResponse): Catalog {
        servletResponse.status = 200
        return Catalog.catalog
    }
}