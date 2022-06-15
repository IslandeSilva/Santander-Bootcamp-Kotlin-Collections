package one.digitalinnovation.collection

fun main(){
    val salarios = doubleArrayOf(1000.0,2250.0,4000.0)

    for (salario in  salarios) {
        println(salario)
    }
    println("---------------------")

    println("Maior Salario: ${salarios.max()}")
    println("Menor Salario ${salarios.min()}")
    println("Media dos Salarios ${salarios.average()}")

    println("---------------------")

    val salariosMaior2500 = salarios.filter { it > 2500.0 }
    salariosMaior2500.forEach{ println(it) }
}