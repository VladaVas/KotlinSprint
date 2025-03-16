package org.example.lesson_2

fun main() {

    val crystalOre = 7
    val ironOre = 11
    val buffPercentage = 20
    val buffMultiplier = buffPercentage / 100.0

    val bonusCrystalOre = (crystalOre * buffMultiplier).toInt()
    val bonusIronOre = (ironOre * buffMultiplier).toInt()

    println(buffMultiplier)

    println("Бонусные кристаллические руды: $bonusCrystalOre")
    println("Бонусные железные руды: $bonusIronOre")
}