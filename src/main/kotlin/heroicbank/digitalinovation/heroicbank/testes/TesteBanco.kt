package heroicbank.digitalinovation.heroicbank.testes

import heroicbank.digitalinovation.heroicbank.Banco

fun main() {
    //dataclass imutavel, nao pode ser trocada.
    val heroicBank = Banco(nome = "HeroicBank", numero = 12)

    println(heroicBank.nome)
    println(heroicBank.numero)

    val banco2 = heroicBank.copy(nome = "Banco2")
    println(banco2.info())

}