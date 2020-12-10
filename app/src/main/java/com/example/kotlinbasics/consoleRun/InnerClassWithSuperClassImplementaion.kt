package com.example.kotlinbasics.consoleRun

fun main() {
    val fr = FilledRectangle()
    fr.draw()
    println("")
    println("")
    val child = Child()
    println("")
    println("")
    val childClass = ChildClass()
    childClass.method()
}

/*Super class implementation*/
open class Parent {
    fun writeLine() {
        println("Printing from parent class")
    }
}

class Child : Parent() {
    init {
        super.writeLine()
    }
}

/*Multiple inheritance using interface*/
open class ParentOne {
    open fun method() {
        println("From parent One")
    }
}

interface ParentTwo {
    fun method() {
        println("From parent two")
    }
}

class ChildClass : ParentOne(), ParentTwo {
    override fun method() {
        super<ParentOne>.method()
        super<ParentTwo>.method()
    }
}

/*Super class implementation with inner class*/
open class Rectangle {
    open fun draw() {
        println("Drawing a rectangle")
    }

    val borderColor: String get() = "black"
}

class FilledRectangle : Rectangle() {
    override fun draw() {
        val filler = Filler()
        filler.drawAndFill()
    }

    inner class Filler {
        private fun fill() {
            println("Filling")
        }

        fun drawAndFill() {
            super@FilledRectangle.draw() // Calls Rectangle's implementation of draw()
            fill()
            println("Drawn a filled rectangle with color ${super@FilledRectangle.borderColor}") // Uses Rectangle's implementation of borderColor's get()
        }
    }
}
