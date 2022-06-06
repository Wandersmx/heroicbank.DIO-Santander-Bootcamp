package heroicbank.digitalinovation.heroicbank

import java.math.BigDecimal

//constructor primário
class Conta(
    val agencia: String,
    val numero: String,
    val saldo: BigDecimal
) {
    fun deposito(valor: BigDecimal){

    }

    fun saque(valor: BigDecimal){

    }
}