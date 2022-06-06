package heroicbank.digitalinovation.heroicbank.testes

import heroicbank.digitalinovation.heroicbank.ClienteTipo

fun main() {
    //Usando um nome que colocamos
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    //Usando o nome por padrão
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    println(">>${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println(">> ${pj.name} - ${pj.descricao}")
}