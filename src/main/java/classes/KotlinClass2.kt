package classes

/**
 * BASE CLASS.
 */
open class Base(name: String) {
    init {
        print("Base class init $name")
    }
}

/**
 * CHILD CLASS THAT EXTENDS BASE CLASS.
 */
class One(name:String): Base(name)

fun main(args: Array<String>) {
    val clazz = One("Alex")
    val o = Base("One")
}