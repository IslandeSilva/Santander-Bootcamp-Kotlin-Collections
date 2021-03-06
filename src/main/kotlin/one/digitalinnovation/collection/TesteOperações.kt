package one.digitalinnovation.collection

fun main(){
    val salarios = doubleArrayOf(1000.0,2250.0,4000.0)

    for (salario in  salarios) {
        println(salario)
    }
    println("---------------------")

    println("Maior Salario: ${salarios.maxOrNull()}")
    println("Menor Salario ${salarios.minOrNull()}")
    println("Media dos Salarios ${salarios.average()}")

    println("---------------------")

    val salariosMaior2500 = salarios.filter { it > 2500.0 }
    salariosMaior2500.forEach{ println(it) }

    println("---------------------")

    println(salarios.count { it in 2000.0..5000.0})

    println("---------------------")

    println(salarios.find { it == 2250.0})
    println(salarios.find { it == 500.0})

    println("---------------------")

    println(salarios.any { it == 1000.0})
    println(salarios.any { it == 500.0})
}