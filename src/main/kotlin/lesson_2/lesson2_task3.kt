package org.example.lesson_2

fun main() {

    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinutes = 457

    val totalMinutes = departureHour * 60 + departureMinute + travelTimeMinutes

    val arrivalHour = (totalMinutes / 60) % 24
    val arrivalMinute = totalMinutes % 60

    println("Поезд прибудет в $arrivalHour:$arrivalMinute")
}