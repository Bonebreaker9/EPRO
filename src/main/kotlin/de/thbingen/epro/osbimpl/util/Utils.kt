package de.thbingen.epro.osbimpl.util

inline fun <T> T?.assertIfPresent(block: T.()->Boolean) = assert(this?.block() ?: true)