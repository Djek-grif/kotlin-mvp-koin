package com.djekgrif.kotlinmvpkoin.utils

fun <T : Any> T?.notNull(block: T.() -> Unit) {
    this?.let(block)
}