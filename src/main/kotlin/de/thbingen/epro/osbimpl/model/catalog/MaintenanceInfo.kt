package de.thbingen.epro.osbimpl.model.catalog

import com.fasterxml.jackson.annotation.JsonProperty
import de.thbingen.epro.osbimpl.util.assertIfPresent

data class MaintenanceInfo(
        @JsonProperty("version") val version: String,
        @JsonProperty("description") val description: String?
) {
    init {
        version.assertIfPresent(semVerRegEx::matches)
    }

    companion object {
        /**
         * https://semver.org/#is-there-a-suggested-regular-expression-regex-to-check-a-semver-string
         */
        private val semVerRegEx: Regex = Regex("^(?<major>0|[1-9]\\d*)\\.(?<minor>0|[1-9]\\d*)\\.(?<patch>0|[1-9]\\d*)(?:-(?<prerelease>(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+(?<buildmetadata>[0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?\$")
    }
}
