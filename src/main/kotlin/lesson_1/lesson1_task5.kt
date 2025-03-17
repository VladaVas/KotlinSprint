package org.example.lesson_1

fun main() {

    const val SECONDS_IN_MINUTE = 60
    const val SECONDS_IN_HOUR = 3600

    val totalSeconds = 6480
    val hours = totalSeconds / SECONDS_IN_HOUR
    val remainigSecondsAfterHours = totalSeconds %  SECONDS_IN_HOUR
    val minutes = remainigSecondsAfterHours / SECONDS_IN_MINUTE
    val seconds = remainigSecondsAfterHours % SECONDS_IN_MINUTE

    println("%02d:%02d:%02d".format(hours, minutes, seconds))

}
