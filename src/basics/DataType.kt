fun main(){
    // Variables
    var x:Long = 10
    // Values
    val y = 20

    // Charater
    val A = 'a'
    // STring
    val B = "a"
    val z = x

    x+= 1
    printDataType(A, B)
    printDataType(B, A)

    // Error - Val cannot be reassigned
    //y+= 1
}

fun<Any> printDataType(x:Any, y:Any) {
    when(x) {

        // -32768 to 32767
        is Short -> println("$x is an Short")
        // -2147483648 to 2147483647
        is Int -> println("$x is an Integer")
        // -92233720368548775808 to 92233720368548775807
        is Long -> println("$x is an Long")
        // -1.4E-45 to 3.4028235E38
        is Float -> println("$x is an Float")
        // 4E-45 to 1.7976931348623157E308
        is Double -> println("$x is an Double")

        is Unit -> println("$x is an Unit")
         // 1 character
        is Char -> println("$x is an Character")
        // Words or characters
        is String -> println("$x is an String")
        is Byte -> println("$x is an Byte")
        is Any -> println("${x.hashCode()} ${x == y} ${y.hashCode()} is an Any")
    }
}