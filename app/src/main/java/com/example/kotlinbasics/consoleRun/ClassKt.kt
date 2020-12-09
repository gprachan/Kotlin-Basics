package com.example.kotlinbasics.consoleRun

fun main() {
    val dog = Dog("red", "pup")
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
* Whenever we are using the secondary constructor we need to call super class constructor*/
open class Animal {
    var color: String = ""

    constructor(color: String) {
        this.color = color
        println("From animal we get: $color")
    }
}

class Dog : Animal {
    var breed: String = ""

    constructor(color: String, breed: String) : super(color) {
        this.breed = breed
        println("From dog we get: $color and $breed")
    }
}