package com.example.kotlinbasics.consoleRun

fun main() {
    val circle = Circle()
    circle.shape("Circle")
    circle.print("Barpak-Gorkha")

    val circleChild = CircleChild()
    // circleChild.print("Kathmandu-Nepal")
}

abstract class Shape {
    abstract fun shape(shape: String)
    open fun print(data: String) {

    }
}

open class Circle : Shape() {
    override fun shape(shape: String) {
        println(shape)
    }

    /*The final keyword protects this method to be override in its child class */
    final override fun print(data: String) {
        println(data)
    }
}

class CircleChild : Circle() {
    /*Here we can't override print from its parent class because its is defined as final*/
    /*override fun print(data: String) {
        println(data)
    }*/
}