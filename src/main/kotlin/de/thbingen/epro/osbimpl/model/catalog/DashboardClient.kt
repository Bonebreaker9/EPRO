package de.thbingen.epro.osbimpl.model.catalog

import com.fasterxml.jackson.annotation.JsonProperty

data class DashboardClient(
        @JsonProperty("id") val id: String,
        @JsonProperty("secret") val secret: String,
        @JsonProperty("redirect_uri") val redirectUri: String?
)