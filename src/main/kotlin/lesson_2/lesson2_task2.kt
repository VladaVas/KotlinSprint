package org.example.lesson_2

fun main() {

    val numberOfEmployees = 50
    val employeeSalary = 30000
    val numberOfInterns = 30
    val internSalary = 20000

    val totalEmployeeSalaryExpenses = numberOfEmployees * employeeSalary
    val totalSalaryExpenses = numberOfInterns * internSalary + totalEmployeeSalaryExpenses
    val averageSalary = totalSalaryExpenses / (numberOfEmployees + numberOfInterns)

    println("Расходы на выплату зарплаты постоянных сотрудников: $totalEmployeeSalaryExpenses рублей")
    println("Общие расходы по ЗП после прихода стажеров: $totalSalaryExpenses рублей")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary рублей")

}