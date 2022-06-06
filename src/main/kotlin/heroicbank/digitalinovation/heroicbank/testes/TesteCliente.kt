package heroicbank.digitalinovation.heroicbank.testes

import heroicbank.digitalinovation.heroicbank.Cliente
import heroicbank.digitalinovation.heroicbank.ClienteTipo

fun main() {
    val altria = Cliente(
        nome = "Altria Pendragon",
        cpf = "123.456.789-10" ,
        clienteTipo = ClienteTipo.PF ,
        senha = "12345"
    )

    println(altria)

    TesteAutenticacao().autentica(altria)

}

