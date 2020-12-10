package com.example.kotlinbasics.consoleRun


fun main() {
//    val derived = Derived("Hello", "World")
    val derived = Derived()
}

/*
open class Base(firstName: String) {
    init {
        println("Initializing base class")
    }

    open val name: Int =
        firstName.length.also { println("The length of name in base class is $it") }
}

@SuppressLint("DefaultLocale")
class Derived(firstName: String, lastName: String) :
    Base(
        firstName.capitalize()
            .also { println("Passed value to base class is: $firstName and $it") }) {
    init {
        println("Initializing derived class")
    }

    override val name: Int =
        (super.name + lastName.length).also { println("The length of derived class is $it") }
}*/
open class Base {
    init {
        println("Base class executed.")
    }
}

class Derived : Base() {
    init {
        println("Derived class executed.")
    }
}