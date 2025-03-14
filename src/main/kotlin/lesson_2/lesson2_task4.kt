package org.example.lesson_2

fun main() {

    val crystalOre = 7
    val ironOre = 11
    val buffMultiplier = 0.2

    val bonusCrystalOre = (crystalOre * buffMultiplier).toInt()
    val bonusIronOre = (ironOre * buffMultiplier).toInt()

    println("Бонусные кристаллические руды: $bonusCrystalOre")
    println("Бонусные железные руды: $bonusIronOre")
}