package generics

fun main() {
    val listOfNames = listOf(
        "Filip",
        "Marin",
        "Damir",
        "Luka",
        "Tomislav"
    )
}

fun <T> listOf(vararg elements: T): List<T> = if (elements.size > 0) elements.asList() else emptyList()