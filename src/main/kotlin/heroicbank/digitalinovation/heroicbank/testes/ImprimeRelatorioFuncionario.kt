package heroicbank.digitalinovation.heroicbank.testes

import heroicbank.digitalinovation.heroicbank.Funcionario

class ImprimeRelatorioFuncionario {
    //metodo estatico que possa ser invocado via classe e nao via instância
    companion object {
        fun imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}