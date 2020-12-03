package ds.strings

class PermutationOfStrings {

    fun permutationWithRepeation(str1: String) {
        println("The given string is: PQR")
        println("The permuted strings are:")
        showPermutation(str1, "")
    }

    private fun showPermutation(str1: String, NewStringToPrint: String) {
        if (NewStringToPrint.length == str1.length) {
            println(NewStringToPrint)
            return
        }

        for (element in str1) {
            showPermutation(str1, NewStringToPrint + element)
        }
    }
}

fun main() {
    PermutationOfStrings().permutationWithRepeation("PQR")
}


