fun main(){

    val age = 60

    when(age) {
        in 1..17 -> println("Not eligible for voting")
        in 18..60 -> {
            println(" Eligible for voting")
            println(" Not senior citizen")
        }
        else -> {
            println(" Eligible for voting")
            println(" Senior citizen")
        }
    }

    age.takeIf { it in 1..17 }
//    if(age <= 18) {
//        println(" Not eligible for voting")
//    } else if(age <= 60) {
//        println(" Eligible for voting")
//        println(" Not senior citizen")
//    } else {
//        println(" Senior citizen")
//    }

//    if(age <= 18) {
//        println(" Not eligible for voting")
//    } else {
//        println(" Eligible for voting")
//
//        if(age > 60){
//            println(" Senior citizen")
//        } else {
//            println(" Not senior citizen")
//        }
//    }
}