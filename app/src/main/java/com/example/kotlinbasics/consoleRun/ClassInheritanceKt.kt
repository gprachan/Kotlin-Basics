package com.example.kotlinbasics.consoleRun

fun main() {
    val dog = Dog("red", "pup")
    dog.printResult()
    val testTwo = TestTwo("Insight Workshop")
    val testThree = TestThree()
}

/*an open keyword enables the extension of class to its child class
* The examples given below are of primary constructors*/
/*open class Animal(color: String) {
    init {
        println("From animal we get: $color")
    }
}

class Dog(color: String, breed: String) : Animal(color) {
    init {
        println("From dog we get: $color and $breed")
    }
}*/

/*The examples given below are of secondary constructors
* The secondary constructor can't have var keyword
* The secondary constructor has its own body
* Whenever we are using the secondary constructor we need to call super class constructor
* The classes in kotlin are final by default so we need to add open keyword to make it inheritable*/
open class Animal {
    var color: String = ""

    constructor(color: String) {
        this.color = color

    }

    open fun printResult() {
        println("From animal we get: $color")
    }
}

class Dog : Animal {
    var breed: String = ""

    constructor(color: String, breed: String) : super(color) {
        this.breed = breed
    }

    override fun printResult() {
        println("From dog we get: $color and $breed")
    }
}

/*Another example of primary constructor*/
class Test public constructor(val name: String, var age: Int) {
    private val nameOne = name

    init {
        println("My name is $nameOne and I'm $age years old.")
    }
}

/*Examples of secondary constructors*/
class TestOne(val name: String) {
    private var nameOne = ""

    constructor(name: String, age: Int) : this(name) {
        this.nameOne = name
    }
}

/*The init block in primary or secondary constructor will be executed even having a secondary constructors body
* Moreover it will execute before the execution of secondary constructor*/
class TestTwo() {
    /*If their is no () on class for primary constructor
    * we don't have to put this keyword on secondary constructor*/
    constructor(name: String) : this() {
        println("Secondary constructor")
    }

    init {
        println("Initializer block")
    }
}

/*Primary constructor with default values*/
class TestThree(val name: String = "Insight Workshop") {
    init {
        println(name)
    }
}