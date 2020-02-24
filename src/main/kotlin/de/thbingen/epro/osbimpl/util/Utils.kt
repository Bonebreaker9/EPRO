package de.thbingen.epro.osbimpl.util

import java.util.*

class Utils {
    companion object {
        private val uuidList = mutableListOf<UUID>()

        fun getUUID(): UUID {
            var uuid = UUID.randomUUID()
            while (uuidList.contains(uuid)) {
                uuid = UUID.randomUUID()
            }
            uuidList.add(uuid)
            return uuid
        }
    }
}

inline fun <T> T?.assertIfPresent(block: T.() -> Boolean) = assert(this?.block() ?: true)