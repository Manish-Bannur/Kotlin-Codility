package test

import maths.findNthFibonacciNo

fun main(args: Array<String>) {
    println("10th fibonacci number is - ${findNthFibonacciNo(16)}")
}

fun findBodyMassIndex(weightInKg: Double, heightInCm: Double): Double {
    // Validate the arguments
    if(weightInKg <= 0) {
        throw IllegalArgumentException("Weight must be greater than zero")
    }
    if(heightInCm <= 0) {
        throw IllegalArgumentException("Height must be greater than zero")
    }

    fun calculateBMI(weightInKg: Double, heightInCm: Double): Double {
        val heightInMeter = heightInCm / 100
        return weightInKg / (heightInMeter * heightInMeter)
    }

    // Calculate BMI using the nested function
    return calculateBMI(weightInKg, heightInCm)
}

fun findBodyMassIndexExample(weightInKg: Double, heightInCm: Double): Double {
    if(weightInKg <= 0) {
        throw IllegalArgumentException("Weight must be greater than zero")
    }
    if(heightInCm <= 0) {
        throw IllegalArgumentException("Height must be greater than zero")
    }

    // Nested function has access to the local variables of the outer function
    fun calculateBMI(): Double {
        val heightInMeter = heightInCm / 100
        return weightInKg / (heightInMeter * heightInMeter)
    }

    return calculateBMI()
}