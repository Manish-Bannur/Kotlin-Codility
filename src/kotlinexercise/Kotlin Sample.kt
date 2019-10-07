package kotlinexercise

import maths.findNthFibonacciNo
import kotlin.random.Random

class Foo {

    val b: String = "b"     // val means unmodifiable
    var i: Int = 0          // var means modifiable

    fun hello() {
        val str = "Hello"
        print("${str}World") // String concat
    }

    fun sum(x: Int, y: Int): Int {
        return x + y
    }

    fun maxOf(a: Float, b: Float) = if (a > b) a else b

}

fun main() {

    println(""+Foo().hello())

    val seq = sequence { for (i in 1..5) {
        // yield a square of i
        yield(i * i) }
        // yield a range
        yieldAll(26..28) }
        // print the sequence

    print(seq.toList())  // sum of 4 and 7 is 11

    val x = 4
    val y = 7
    print("\nsum of $x and $y is ${x + y}")  // sum of 4 and 7 is 11

    val a: String? = null
    when(a){
        "abc" -> a
        "kbc" -> a
        null -> println("\nI am null")
        else -> println("\nError a is null")
    }



    when (x) {
        1 -> print("x is 1")
        2 -> print("x is 2")
        3, 4 -> print("x is 3 or 4")
        in 5..10 -> print("x is 5, 6, 7, 8, 9, or 10")
        else -> print("x is out of range")
    }

// In the next line no constructor call happens, and // at the runtime 'name' contains just string "Kotlin"
     val name = Name("Kotlin")
     println(name.s)

    println("10th fibonacci number is - ${findNthFibonacciNo(10)}\n")

    val number = Random.nextInt(42) // number is in range [0, limit)
     println(number)

    val keys = 'a'..'f'
    val map = keys.associateWith { it.toString().repeat(5).capitalize() }
    map.forEach { println(it) }

    fun printAllUppercase(data: List<String>) {
        val result = data
            .filter { it.all { c -> c.isUpperCase() } }
            .ifEmpty { listOf("<no uppercase>") }
        result.forEach { println(it) }
    }

    printAllUppercase(listOf("foo", "Bar"))
    printAllUppercase(listOf("FOO", "BAR"))
}

inline class Name(val s: String)
