package one.heroicbank.collections

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    // valor em cada interação na variável
    for (valor in values) {
        println(valor)
    }

    println("=====================================")
    //cada interação a variavel valor ja tem um nome nesse array
    values.forEach { valor ->
        println(valor)
    }

    println("=====================================")

    //precisa imprimir values e o index nesse array
    for (index in values.indices) {
        println(values[index])
    }


    //recurso dentro de um array para ordenar, por padrão,  do menor para o maior
    println("=====================================")
    values.sort()
    for (valor in values) {
        println(valor)
    }


}