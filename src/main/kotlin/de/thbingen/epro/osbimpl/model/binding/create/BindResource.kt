package de.thbingen.epro.osbimpl.model.binding.create

import com.fasterxml.jackson.annotation.JsonProperty

data class BindResource(
        @JsonProperty("app_guid") val appGuid: String?,
        @JsonProperty("route") val route: String?
)