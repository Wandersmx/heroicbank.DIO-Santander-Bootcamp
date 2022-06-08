package one.heroicbank.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Lancelot", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (k , v) -> println("Chave: $k - Valor: $v") }

    //Sintaxe recurso infix
    val map2 = mapOf(
        "Gawain" to  2500.0,
        "Percival" to 3000

    )
    map2.forEach { (k , v) -> println("Chave: $k - Valor: $v") }
}