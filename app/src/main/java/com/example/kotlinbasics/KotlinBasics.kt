package com.example.kotlinbasics


fun main() {
    // Traditional usage
    val a = 5
    val b = 10
    var max1: Int = a
    if (a < b) max1 = b
    println(max1)
// With else
    val max2: Int
    if (a > b) {
        max2 = a
    } else {
        max2 = b
    }
    println(max2)

// As expression
    val max3 = if (a > b) a else b
    println(max3)

    val max = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }
    whenExpression()
    println(hasPrefix("prefixYellow").toString())
    println("")
    println("")
//    usingForLoop()
//    forLoopInRange()
    loopBreak()
}

fun loopBreak() {
    loop@ for (i in 1..100) {
        if (i == 12) {
            break@loop
        } else {
            println(i)
        }
    }
}

fun whenExpression() {
    val x = 11
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        3, 4 -> println("x == 3 or x == 4")
        in 4..10 -> println("x lies between 4 to 10")
        !in 4..10 -> println("x is not between 4 to 10")
        else -> { // Note the block
            println("x is neither 1 nor 2")
        }
    }
}

fun hasPrefix(x: Any) = when (x) {
    is String -> x.startsWith("prefix")
    else -> false
}


fun usingForLoop() {
    val array = arrayOf(10, 11, 30)
//    for (i in array) println(i)
    /*for (item: Int in array) {
        println(item)
    }*/
    /*val array = ArrayList<Int>()
    array.add(1)
    array.add(2)
    array.add(3)*/
    for ((index, item) in array.withIndex()) {
        println("There is value $item at $index index")
    }
}

fun forLoopInRange() {
//    for (item in 1..10) println(item)
    for (i in 6 downTo -2 step 2) {
        println(i)
    }
}















