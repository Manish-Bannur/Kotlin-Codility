package ds.strings

import java.util.*
import java.util.function.Consumer

object Interleavings {
    private fun allInterLeavings(res: String, P: String, Q: String, out: MutableSet<String>) {
        if (P.isEmpty() && Q.isEmpty()) {
            out.add(res)
            return
        }
        if (P.isNotEmpty()) {
            allInterLeavings(res + P[0], P.substring(1), Q, out)
        }
        if (Q.isNotEmpty()) {
            allInterLeavings(res + Q[0], P, Q.substring(1), out)
        }
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val P = "WX"
        val Q = "YZ"
        println("The given strings are: $P  $Q")
        println("The interleavings strings are: ")
        val out: MutableSet<String> = HashSet()
        allInterLeavings("", P, Q, out)
        out.forEach(Consumer { s: String? -> println(s) })
    }
}