package ds.strings

object Palindrome {
    private fun printSubStr(str1: String, l: Int, h: Int) {
        println(str1.substring(l, h + 1))
    }

    private fun longPalSubstr(str1: String): Int {
        val n = str1.length
        val table = Array(n) { BooleanArray(n) }
        var mLength = 1

        //Create a table of table[n][n]
        for (i in 0 until n) table[i][i] = true
        var start = 0

        // Loop i from 0 to (length-1)
        // i = 15 and n 32
        for (i in 0 until n - 1) {
            // Check charAt(i) == charAt(i+1)
            if (str1[i] == str1[i + 1]) {
                table[i][i + 1] = true
                start = i // start = i = 15
                mLength = 2 // mLength 2
            }
        }

        // Loop k from 3 to <= length
        for (k in 3..n) {

            // Loop from 0 to (length - k(current value)+1)
            // n = 31, k=3
            // i = 12, n = 32, k = 10
            // i = 10, n = 32, k = 12
            for (i in 0 until n - k + 1) {
                // i=0, k=3
                // 17, 4
                // i==14, k =4
                // i
                val j = i + k - 1
                if (table[i + 1][j - 1] && str1[i] == str1[j]) {
                    table[i][j] = true

                    // k = 4, length = 2
                    // m length = 16
                    if (k > mLength) {
                        start = i
                        mLength = k
                    }
                }
            }
        }
        print("The longest palindrome substring in the given string is; ")
        printSubStr(str1, start, start + mLength - 1)
        return mLength
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val str1 = "thequickbrownfoxxofnworbquickthe"
        println("The given string is: $str1")
        println("The length of the palindromic substring is: " + longPalSubstr(str1))
    }
}