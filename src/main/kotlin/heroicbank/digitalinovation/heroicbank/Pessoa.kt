package heroicbank.digitalinovation.heroicbank

class Pessoa {
    var nome: String = "Altria Pendragon"
    var cpf: String = "123.456.789-10"
}

//Função apenas para teste afim de retornar os objetos instanciados na classe
fun main(){
    val Altria = Pessoa()

    println(Altria.nome)
    println(Altria.cpf)
}