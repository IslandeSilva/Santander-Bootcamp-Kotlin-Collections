package one.digitalinnovation.collection

fun main() {
    val joao = funcionario("Joao", 2000.0,"CLT")
    val pedro = funcionario("Pedro", 1500.0,"CLT")
    val maria = funcionario("Maria", 4000.0, "PJ")

    val repositorio = Repositorio<funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findbyId(maria.nome))

    println("--------------------")
    repositorio.findall().forEach { println(it) }

    println("--------------------")
    repositorio.remove(maria.nome)
    repositorio.findall().forEach { println(it) }
}