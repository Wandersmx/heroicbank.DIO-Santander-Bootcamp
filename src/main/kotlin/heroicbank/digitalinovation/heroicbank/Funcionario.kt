package heroicbank.digitalinovation.heroicbank

import java.math.BigDecimal

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double,
) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf
        Salário: $salario
        Auxilio: ${calculoAuxilio()}
    """.trimIndent()
}