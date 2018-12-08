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