package com.example.kotlinbasics.consoleRun

fun main() {
    val dog = Dog("red", "pup")
}

/*an open keyword enables the extension of class to its child class
* The examples given below are of primary constructors*/
open class Animal(color: String) {
    init {
        println("From animal we get: $color")
    }
}

class Dog(color: String, breed: String) : Animal(color) {
    init {
        println("From dog we get: $color and $breed")
    }
}