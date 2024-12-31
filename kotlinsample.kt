fun String?.safe(default: String = "") = this ?: default

fun CharSequence?.safe(default: CharSequence = "") = this ?: default

fun Int?.safe(default: Int = 0) = this ?: default

fun Double?.safe(default: Double = 0.0) = this ?: default