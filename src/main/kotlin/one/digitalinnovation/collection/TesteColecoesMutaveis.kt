package one.digitalinnovation.collection


fun main() {
    val joao = funcionario("Joao", 2000.0,"CLT")
    val pedro = funcionario("Pedro", 1500.0,"CLT")
    val maria = funcionario("Maria", 4000.0, "PJ")

    val funcionarios = mutableListOf(joao,maria)
    funcionarios.forEach { println(it) }

    println("----------------------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("----------------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("----------SET ------------")

    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach { println(it) }

    println("----------------------")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach { println(it) }

    println("----------------------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach { println(it) }
}
