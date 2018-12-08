package classes

/**
 * EMPTY CLASS.
 */
class Empty


/**
 * CLASSES WITH PRIMARY CONSTRUCTOR.
 */
class User constructor(id:Long, name:String)

class Cat (name:String, age:Int)

/**
 * CLASS WITH INITIALIZED METHOD.
 */
class Dog constructor (name: String, age: Int) {
    init {
        print("Dog initialized with name ${name} and age ${age}")
    }
}

/**
 * CLASSES WITH SECONDARY CONSTRUCTOR.
 */
class Customer {
    constructor(string:String) {
        print("${string}")
    }
}

/**
 * CLASS WITH PRIMARY AND SECONDARY CONSTRUCTORS.
 */
class Human (val name:String) {
    constructor (name:String, age:Int):this(name) {
        print("name:$name and age:$age")
    }
}

/**
 * CLASS WITH EXPLICIT PARAMETERS.
 */
class Molly constructor(val name: String = "Molly")

/**
 * CLASS WITH PRIMARY CONSTRUCTOR ACTION.
 */
class Person constructor(firstName:String) {
    init {
        print("init primary constructor action of Person1 class $firstName")
    }
}

/**
 * CLASS WITH PRIMARY CONSTRUCTOR WITHOUT DIRECT DEFINITION.
 */
class MyClass (value:Long)

/**
 * CLASS WITH PRIMARY CONSTRUCTOR AND DEFINED CLASS PROPERTY.
 */
class MyUser (val id: Long, val name: String, val email:String)

/**
 * CLASS WITH SECONDARY CONSTRUCTORS.
 */

class Versus constructor(id:Long) {
    constructor(id:Long, name:String):this(id)
    constructor(id:Long, name:String, price:Double):this(id, name)
}

/**
 * CLASS WITH PRIVATE CONSTRUCTOR.
 */
class Clazz private constructor()

fun main(args: Array<String>) {
    val molly = Molly()
    print(molly.name)
}


