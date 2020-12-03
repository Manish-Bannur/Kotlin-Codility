package ds.strings

object TwoStringsInterleaving {
    @JvmStatic
    fun main(args: Array<String>) {
        val str1 = "MNO"
        val str2 = "PQ"
        val str3 = "PMQNO"
        println("The given string is: $str3")
        val str4 = "PNQMO"
        println("The given 2 string is: $str4")
        println("The interleaving strings are $str1 and $str2")
        println("The given string is interleaving: " + checkInterleaved(str1, str2, str3))
        println("The given 2 string is interleaving: " + checkInterleaved(str1, str2, str4))
    }

    private fun checkInterleaved(str1: String, str2: String, CheckInString: String): Boolean {
        var i = 0
        var j = 0
        var k = 0
        if (str1.length + str2.length != CheckInString.length) {
            return false
        }
        while (k < CheckInString.length) {
            if (i < str1.length && str1[i] == CheckInString[k]) {
                i++
            } else if (j < str2.length && str2[j] == CheckInString[k]) {
                j++
            } else {
                return false
            }
            k++
        }
        return i == str1.length && j == str2.length && k == CheckInString.length
    }
}