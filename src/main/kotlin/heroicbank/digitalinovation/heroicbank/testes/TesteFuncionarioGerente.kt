package heroicbank.digitalinovation.heroicbank.testes

import heroicbank.digitalinovation.heroicbank.Gerente



fun main() {
    val lancelot = Gerente( nome = "Lancelot", cpf = "12345678910", salario = 5000.0)

    ImprimeRelatorioFuncionario.imprime(lancelot)



}
