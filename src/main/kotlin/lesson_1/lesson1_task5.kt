package org.example.lesson_1

fun main() {

    val totalSeconds = 6480
    val hours = totalSeconds / 3600
    val remainigSecondsAfterHours = totalSeconds % 3600
    val minutes = remainigSecondsAfterHours / 60
    val seconds = remainigSecondsAfterHours % 60

    println("Время, проведенное в космосе: ${String.format("%02d", hours)}:${String.format("%02d", minutes)}:${String.format("%02d", seconds)}")

}
