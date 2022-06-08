package one.heroicbank.collections

fun main() {
    val funcionario1 = Funcionario("Gawain", 2000.0, "CLT")
    val funcionario2 = Funcionario("Garenth", 1500.0,"PJ")
    val funcionario3 = Funcionario("Percival", 4000.0, "CLT")

    println("###################LIST######################")
    val funcionarios = mutableListOf(funcionario1, funcionario2)
    funcionarios.forEach { println(it) }

    println("------------------------------------")
    funcionarios.add(funcionario3)
    funcionarios.forEach { println(it) }

    println("------------------------------------")
    funcionarios.remove(funcionario3)
    funcionarios.forEach { println(it) }

    println("###################SET######################")
    val funcionariosSet = mutableSetOf(funcionario3)
    funcionariosSet.forEach { println(it) }


    println("------------------------------------")
    funcionariosSet.add(funcionario1)
    funcionariosSet.add(funcionario2)
    funcionariosSet.forEach { println(it) }


    println("------------------------------------")
    funcionariosSet.remove(funcionario2)
    funcionariosSet.forEach { println(it) }

}