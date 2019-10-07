package maths

fun main(args: Array<String>) {
    println("10th fibonacci number is - ${findNthFibonacciNo(10)}")
}

fun findNthFibonacciNo(n: Int): Int {
    var a = 0
    var b = 1
    var c: Int

    if(n == 0) {
        return a
    }

    for(i in 2..n) {
        c = a+b
        a = b
        b = c
    }
    return b
}