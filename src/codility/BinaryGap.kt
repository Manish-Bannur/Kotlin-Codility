package codility

import kotlin.system.measureTimeMillis

// Scenarios:
// N = 9 (1001), Expected = 2
// N = 529 = (1000010001), Expected = 4
// N = 51272 (1100100001001000), Expected = 4
// N = 15 (1111), Expected = 0
// N = 53 (110101), Expected = 1
// N = 2147483647 (1111111111111111111111111111111), Expected = 0
// N = 2147483648 (10000000000000000000000000000000), Expected = 0
// N = 0 (0), Expected = 0
// N = -1 (null), Expected = 0
// N = "A" (null), Expected = 0
// N = null (null), Expected = 0
// N = [blank] (null), Expected = 0

class BinaryGap {

    fun solution1(N: Int): Int {
        var tempGap = 0
        var gap = 0
        val binaryString = Integer.toBinaryString(N)
        print(" Binary Value is --> $binaryString")
        var i = 0
        //1. 0<3 == True
        //2. 2<3 == True
        //3. 3<3 == False
        while (i < binaryString.length) {
            //1. binaryString[0] == "1" == True
            //2. binaryString[2] == "1" == True
            if (binaryString[i] == '1') {
                // initialize tempGap to hold binary gap temporarily and increment the index pointing to binary array
                // 1. Value of i == 1
                // 2. Value of i == 3
                ++i
                tempGap = 0
                // move until we encounter '1' or end of array is reached
                //1. 1 < 3 && binaryString[1] == 0 so !='1' is True == True
                //2. 2 < 3 && binaryString[2] == 1 sp !='1' is False == False
                //3. 3 < 3 && binaryString[3] ==
                while (i < binaryString.length && binaryString[i] != '1') {
                    //1. Value of i == 2
                    ++i
                    //1. tempGap == 1
                    tempGap++
                }
                // in case, end of array is reached but we did not find '1'
                //1. 2 >= 3 == False
                //2. 3 >= 3 == True
                if (i >= binaryString.length)
                    tempGap = 0
            } else {
                // i == 2
                ++i
            }
            if (tempGap > gap) {
                // gap == 0 && tempGap == 1
                gap = tempGap
            }
        }
        print("  \n First $gap")
        return gap
    }
}

fun main() {
    fun getBinaryGap(N: Int): Int {
        if (N in 1..2147483647) {
            return BinaryGap().solution1(N)
        }
        return 0
    }

    fun getBinarySol2(N: Int): Int {
        if (N in 1..2147483647) {
            return BinarySolution2().solution(N)
        }
        return 0
    }
    val time1 = measureTimeMillis {
        // call your function here
        getBinaryGap(5)
    }
    print(" \n Time taken by First $time1")
    val time2 = measureTimeMillis {
        getBinarySol2(2147483647)
    }
    print(" \n Time taken by Second $time2")
}



