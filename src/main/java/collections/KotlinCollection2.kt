package collections

/**
 * @author Alexander Naumov.
 */

fun main(args: Array<String>) {

    var list: ArrayList<String> = ArrayList()
    var cities = listOf("London", "Paris", "Rome", "Kiev", "Moscow", "Washington")
    var empty = emptyList<String>()
    println(empty.javaClass)
    var range = 1 .. 10

    println(cities.javaClass)
    range.forEach{ print("$it ")}

    var mutableCities = mutableListOf<String>("London", "Paris", "Rome", "Kiev", "Moscow", "Washington")
    mutableCities.add("Chicago")

    val hashMap = hashMapOf(Pair("Madrid", "Spain"), Pair("New York", "USA"), Pair("Donetsk", "Ukraine"))
    val characters = charArrayOf('A', 'B', 'C', 'D', 'E', 'F', 'G')
    print("\n")
    characters.forEach { print("$it ") }
}