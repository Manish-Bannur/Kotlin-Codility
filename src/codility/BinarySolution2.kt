package codility

class BinarySolution2 {

    fun solution(N: Int): Int {
        //Base and Edge Cases//Set Max Count if Count is Greater
        //Reset Count
        //Return Max Count
//Digit is 1, If Count Isn't Zero
        //Increment Count if Digit is 0
        //Loop Through Binary String From 2nd Element
        //Count
        //Max Count
        //Binary String Representation of Integer
        when {
            N < 5 -> return 0
            N == 5 -> return 1
            N < 9 -> return 0
            else -> {
                val bin = Integer.toBinaryString(N) //Binary String Representation of Integer
                var mc = 0 //Max Count
                var cc = 0 //Count
                for (i in 1 until bin.length)
                //Loop Through Binary String From 2nd Element
                {
                    if (bin[i] == '0')
                        cc++ //Increment Count if Digit is 0
                    else if (cc > 0)
                    //Digit is 1, If Count Isn't Zero
                    {
                        mc = if (cc > mc) cc else mc //Set Max Count if Count is Greater
                        cc = 0 //Reset Count
                    }
                }
                print("  \n Second $mc")
                return mc //Return Max Count
            }
        }
    }
}