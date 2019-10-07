package function


fun main() {
    fun sum(a: Int, b: Int) = a + b

    fun printSum(a: Int, b: Int) {
        println("sum of $a and $b is ${a + b}")
    }

    fun getStringLength(obj: Any): Int? {
        // `obj` is automatically cast to `String` on the right-hand side of `&&`
        if (obj is String && obj.length > 0) {
            return obj.length
        }
        return null
    }

    //printSum(5, 8)
    //println(getStringLength("Manish Bannur"))

    val items = listOf("apple", "banana", "kiwifruit")
    //for (index in items.indices) println("item at $index is ${items[index]}")
    var index = 0
    while (index < items.size) {
        //println("item at $index is ${items[index]}")
        index++
    }

    // WHEN
    fun describe(obj: Any): String = when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }

    //println(describe(3F))

    //Using ranges
    val x = 10
    val y = 9
    if (x in 1..y + 1) {
        //println("\nfits in range")
    }

    // Check if number is out of range
    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex) {
        //println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        //println("list size is out of valid list indices range, too")
    }

    // Iteration
    for (x in 1..10 step 2) {
        //print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        //print(x)
    }

    // Lambdas
    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits.filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        //.forEach { //println(it) }

    fun arrayOfMinusOnes(size: Int): IntArray {
        return IntArray(size).apply { fill(-1) }
    }

    //println("${arrayOfMinusOnes(5).toList()}")

    var a = 1
    var b = 2
    println("{$a $b}")
    a = b.also { b = a }
    println("{$a $b}")
}