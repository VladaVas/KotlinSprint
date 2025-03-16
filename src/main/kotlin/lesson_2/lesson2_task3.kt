package org.example.lesson_2

fun main() {

    val MINUTES_IN_HOUR = 60

    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinutes = 457

    val totalMinutes = departureHour * MINUTES_IN_HOUR + departureMinute + travelTimeMinutes

    val arrivalHour = (totalMinutes / MINUTES_IN_HOUR) % 24
    val arrivalMinute = totalMinutes % MINUTES_IN_HOUR

    println("Поезд прибудет в $arrivalHour:$arrivalMinute")
}