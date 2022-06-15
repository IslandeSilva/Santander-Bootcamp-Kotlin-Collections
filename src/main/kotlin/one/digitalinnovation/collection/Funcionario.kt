package one.digitalinnovation.collection

data class funcionario(
    val nome: String,
    val salario: Double,
    val TipoContratacao: String,
){
    override fun toString(): String = """
        Nome: $nome
        Salario: $salario
    """.trimIndent()
}