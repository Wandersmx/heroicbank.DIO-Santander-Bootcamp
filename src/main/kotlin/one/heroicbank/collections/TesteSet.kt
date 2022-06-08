package one.heroicbank.collections

fun main() {
    val funcionario1 = Funcionario("Gawain", 2000.0, "CLT")
    val funcionario2 = Funcionario("Garenth", 1500.0,"PJ")
    val funcionario3 = Funcionario("Percival", 4000.0, "CLT")

    val grupo1 = setOf(funcionario1, funcionario2)
    val grupo2 = setOf(funcionario3)
    val grupo3 = setOf(funcionario1, funcionario2, funcionario3)

    val resultUnion = grupo1.union(grupo2)
    resultUnion.forEach{ println(it) }

    println("-------------------------------")
    val resultSubtractExpression = grupo3.subtract(grupo2)
    resultSubtractExpression.forEach{ println(it) }

    println("-------------------------------")
    val resultIntersect = grupo3.intersect(grupo2)
    resultIntersect.forEach{ println(it) }
}
