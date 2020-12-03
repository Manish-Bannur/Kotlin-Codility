package ds.strings

object SecondFrequentChar {
    private const val NOOFCHARS = 256
    private fun get2ndMostFreq(str1: String): Char {
        val ctr = IntArray(NOOFCHARS)
        var i: Int
        i = 0
        while (i < str1.length) {
            ctr[str1[i].toInt()]++
            i++
        }
        var ctr_first = 0
        var ctr_second = 0
        i = 0
        while (i < NOOFCHARS) {
            if (ctr[i] > ctr[ctr_first]) {
                ctr_second = ctr_first
                ctr_first = i
            } else if (ctr[i] > ctr[ctr_second] && ctr[i] != ctr[ctr_first]) ctr_second = i
            i++
        }
        return ctr_second.toChar()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val str1 = "successes"
        println("The given string is: $str1")
        val res = get2ndMostFreq(str1)
        if (res != '\u0000') println("The second most frequent char in the string is: $res") else println("No second most frequent character found in the string.")
    }
}