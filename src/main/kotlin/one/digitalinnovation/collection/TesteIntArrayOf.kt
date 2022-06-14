package one.digitalinnovation.collection

fun main(){
    val values = intArrayOf(2,3,4,1,10,7)

    values.forEach {
        println(it)
    }
    println("-------------------------")

    values.sort() //Ordenação da Array
    values.forEach {
        println(it)
    }
}