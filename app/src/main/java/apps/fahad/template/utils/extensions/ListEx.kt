package apps.fahad.template.utils.extensions

fun <T> List<T>.toArrayList(): ArrayList<T> {
    return ArrayList(this)
}

fun <T> Array<T>.toArrayList(): ArrayList<T> {
    return this.asList().toArrayList()
}