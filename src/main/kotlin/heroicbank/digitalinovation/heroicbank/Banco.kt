package heroicbank.digitalinovation.heroicbank

//data class nao pode ser "open" e "abstract", mas tem membros e etc
data class Banco(
    val nome: String,
    val numero: Int
) {
    fun info() = "$nome - $numero"
}
