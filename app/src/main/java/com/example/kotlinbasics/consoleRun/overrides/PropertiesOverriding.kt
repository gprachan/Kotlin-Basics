package com.example.kotlinbasics.consoleRun.overrides

fun main() {
    val child = Child("Child Name")
}

open class Parent {
    open val name: String = "Parent Name"
}

class Child(var nameOne: String) : Parent() {
    override val name: String
        get() = nameOne

    init {
        println(name)
    }
}