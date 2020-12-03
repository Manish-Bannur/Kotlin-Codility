package ds.strings

object StringOps {
    @JvmStatic
    fun main(args: Array<String>) {
        val str1 = "Shanghai Houston Colorado Alexandria"
        val str2 = "Alexandria Colorado Houston Shanghai"

        // Determine whether characters 0 through 7 in str1
        // match characters 28 through 35 in str2.
        val match1 = str1.regionMatches(0, str2, 28, 8)

        // Determine whether characters 9 through 15 in str1
        // match characters 9 through 15 in str2.
        val match2 = str1.regionMatches(9, str2, 9, 8)

        // Display the results of the regionMatches method calls.
        println("str1[0 - 7] == str2[28 - 35]? $match1")
        println("str1[9 - 15] == str2[9 - 15]? $match2")

        // Create three strings in three different ways.
//        String str1 = "Java Exercises";
//        String str2 = new StringBuffer("Java").append(" Exercises").toString();
//        String str3 = str2.intern();
//
//        // Determine which strings are equivalent using the ==
//        // operator (as compared to calling equals(), which is
//        // a more expensive operation.
//        System.out.println("str1 == str2? " + (str1 == str2));
//        System.out.println("str1 == str3? " + (str1 == str3));

        //    Sample Output
        //a  b c  d e  f  g h i  j
        //=========================
        //36 10 7 40 2 16 42 1 6 20
        //
        //k  l  m  n  o  p q  r  s  t
        //===========================
        //8 35 22 14 12 23 4 11 24 31
        //
        //u  v  w  x  y  z
        //================
        //5 27 13 18 38 37


        // Get the index of all the characters of the alphabet
        // starting from the beginning of the String.
        // int a = str.lastIndexOf("a", str.length() - 1);

//        String str = "The quick brown fox jumps over the lazy dog.";
//        // Get the index of all the characters of the alphabet
//        // starting from the beginning of the String.
//        int a = str.indexOf("a", 0);
//        int b = str.indexOf("b", 0);
//        int c = str.indexOf("c", 0);
//        int d = str.indexOf("d", 0);
//        int e = str.indexOf("e", 0);
//        int f = str.indexOf("f", 0);
//        int g = str.indexOf("g", 0);
//        int h = str.indexOf("h", 0);
//        int i = str.indexOf("i", 0);
//        int j = str.indexOf("j", 0);
//        int k = str.indexOf("k", 0);
//        int l = str.indexOf("l", 0);
//        int m = str.indexOf("m", 0);
//        int n = str.indexOf("n", 0);
//        int o = str.indexOf("o", 0);
//        int p = str.indexOf("p", 0);
//        int q = str.indexOf("q", 0);
//        int r = str.indexOf("r", 0);
//        int s = str.indexOf("s", 0);
//        int t = str.indexOf("t", 0);
//        int u = str.indexOf("u", 0);
//        int v = str.indexOf("v", 0);
//        int w = str.indexOf("w", 0);
//        int x = str.indexOf("x", 0);
//        int y = str.indexOf("y", 0);
//        int z = str.indexOf("z", 0);
//        // Display the results of all the indexOf method calls.
//        System.out.println(" a  b c  d e  f  g h i  j");
//        System.out.println("=========================");
//        System.out.println(a + " " + b + " " + c + " " + d + " " +
//                e + " " + f + " " + g + " " + h + " " +
//                i + " " + j + "\n");
//        System.out.println("k  l  m  n  o  p q  r  s  t");
//        System.out.println("===========================");
//        System.out.println(k + " " + l + " " + m + " " + n + " " +
//                o + " " + p + " " + q + " " + r + " " +
//                s + " " + t + "\n");
//        System.out.println("u  v  w  x  y  z");
//        System.out.println("================");
//        System.out.println(u + " " + v + " " + w + " " + x + " " +
//                y + " " + z);

//        String str = "Python Exercises.";
//        // Get the hash code for the above string.
//        int hash_code = str.hashCode();
//        // Display the hash code.
//        System.out.println("The hash for " + str +
//                " is " + hash_code);

//        String str = "This is a sample String.";
//        // Copy the contents of the String to a byte array.
//        byte[] byte_arr = str.getBytes();
//        // Create a new String using the contents of the byte array.
//        String new_str = new String(byte_arr);
//        // Display the contents of the byte array.
//        System.out.println("\nThe new String equals " +
//                new_str + "\n");

//        //The char array equals "[C@2a139a55"
//        String str = "This is a sample string.";
//        // Copy the contents of the String to a byte array.
//        // Only copy characters 4 through 10 from str.
//        // Fill the source array starting at position 2.
//        char[] arr = new char[] { ' ', ' ', ' ', ' ',
//                ' ', ' ', ' ', ' ' };
//        str.getChars(4, 10, arr, 2);
//        // Display the contents of the byte array.
//        System.out.println("The char array equals \"" +
//                arr + "\"");

//        // Character array with data.
//        char[] arr_num = new char[] { '1', '2', '3', '4' };
//        // Create a String containig the contents of arr_num
//        // starting at index 1 for length 2.
//        String str = String.copyValueOf(arr_num, 1, 3);
//        // Display the results of the new String.
//        System.out.println("\nThe book contains " + str +" pages.\n");

        //System.out.println(System.currentTimeMillis());
//        Calendar c = Calendar.getInstance();
//        System.out.println("Current Date and Time :");
//        System.out.format("%tB %te, %tY%n", c, c, c);
//        System.out.format("%tl:%tM %tp%n", c, c, c);

//        String s1 = "example.com";
//        String s2 = "Example.com";
//        // Returns false
//        System.out.println(s1.contentEquals(s2));

//        String s1 = "Java Exercises";
//        System.out.println("Position 0': "+s1.charAt(0));
//        System.out.println("Position 10': "+s1.charAt(10));

//        String s2 = "w3resource.com ";
//        System.out.println("Character(unicode point 1)': "+s2.codePointBefore(1));
//        System.out.println("Character(unicode point 9)': "+s2.codePointBefore(9));
//        System.out.println("codepoint count': "+s2.codePointCount(0, 9));

//        String str_Sample = "RockStar";
//        System.out.println("Compare To 'ROCKSTAR': " + str_Sample.compareTo("rockstar"));
//        //Compare to - Ignore case
//        System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + str_Sample.compareToIgnoreCase("ROCKSTAR"));
//        System.out.println("ROCKSTAR': " + str_Sample.compareTo("RockStar"));

//        String str1 = "Java Exercises 1";
//        String str3 = "Java Exercises 1";
//        String str2 = "Java Exercises 2";
//
//        System.out.println("String 1: " + str1);
//        System.out.println("String 2: " + str2);
//
//        // Compare the two strings.
//        int result = str1.compareTo(str2);
//
//        // Compare ignore case
//        int result1 = str1.compareToIgnoreCase(str3);
//
//        // Display the results of the comparison.
//        if (result < 0)
//        {
//            System.out.println("\"" + str1 + "\"" +
//                    " is less than " +
//                    "\"" + str2 + "\"");
//        }
//        else if (result == 0)
//        {
//            System.out.println("\"" + str1 + "\"" +
//                    " is equal to " +
//                    "\"" + str2 + "\"");
//        }
//        else // if (result > 0)
//        {
//            System.out.println("\"" + str1 + "\"" +
//                    " is greater than " +
//                    "\"" + str2 + "\"");
//        }
    }
}