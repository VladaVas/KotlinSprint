package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val initialAmount = 70000.0
    val annualInterestRate = 16.7 / 100
    val years = 20

    val finalAmount = initialAmount * (1 + annualInterestRate).pow(years)

    println("Размер вклада через 20 лет будет: %.3f".format(finalAmount))
}