package de.thbingen.epro.osbimpl.model.catalog

import com.fasterxml.jackson.annotation.JsonProperty

data class InputParametersSchema(
        @JsonProperty("parameters") val parameters: JsonSchema?
)