package one.digitalinnovation.collection

fun main(){
    val nomes = Array(5){""}
    nomes[0] = "Maria"
    nomes[1] = "Joao"
    nomes[2] = "Jose"
    nomes[3] = "Carlos"
    nomes[4] = "Fatima"

    for (nome in nomes){
        println(nome)
    }
    println("---------------")

    nomes.sort()
    nomes.forEach { println(it) }

    println("---------------")
    val nomes2 = arrayOf("Islande","Zezinho","Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }
}