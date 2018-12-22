package classes

/**
 * @author Alexander Naumov.
 */

abstract class Derived

/**
 * CLASS FOR EXTENDING.
 */
open class Base1 {
    open fun f() {}
}

/**
 * ABSTRACT CLASS.
 */
abstract class Base2 :Base1() {
    override fun f() {
        super.f()
    }
}

class MySimpleClass(var name:String, var age:Int) {
    fun greeting():Unit = println("Hello my name is $name, and i'm $age old.")
}

fun main(args: Array<String>) {
    val clazz = MySimpleClass("Alex", 31)
    clazz.greeting()
    clazz.name = "Katrine"
    clazz.age = 25
    clazz.greeting()
}