import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

// Complete the compareTriplets function below.
fun compareTriplets(a: Array<Int>, b: Array<Int>) {
    var aliceTotalScore = 0
    var bobTotalScore = 0
    for (i in 0 until b.size) {
        println("${a[i]} > ${b[i]}  ${a[i] > b[i]}")

        if (a[i] > b[i]) {
            aliceTotalScore++
        } else {
            bobTotalScore++
        }
    }
    println("$aliceTotalScore  $bobTotalScore")
}

// Diagonal difference
fun diagonalDifference(arr: Array<IntArray>): Int {
    var leftSum = 0
    var rightSum = 0
    val n = arr.size
    for (i in 0 until n) {
        leftSum += arr[i][i]
        rightSum += arr[i][n - 1 - i]
    }
    return Math.abs(leftSum - rightSum)
}

fun arithmeticSeriesSum(a: Int = 1, n: Int, d: Int = 1): Int {
    return n/2 * (2*a + (n-1)*d)
}

fun main() {

    // No value passed for value n
    // arithmeticSeriesSum(10)
    println(" sum is "+arithmeticSeriesSum(1, 10))

    /*val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    val b = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    compareTriplets(a, b)*/
}