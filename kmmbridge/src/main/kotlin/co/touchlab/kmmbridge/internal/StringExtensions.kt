package co.touchlab.kmmbridge.internal

import java.util.Locale

internal fun String.capitalized(): String = this.replaceFirstChar {
    if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
}
