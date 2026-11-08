class Animal (
    // Aqui temos um exemplo de construtor primário com propriedades promovidas.
    var nome: String = "",
    var especie: String = "",
    var idade: Int = 0
) {
    // Este método é chamado quando queremos exibir as informações do animal
    fun exibirInformacoes() {
        println("${this.nome} é um(a) ${this.especie} e tem ${this.idade} anos.")
    }
}

fun main() {
    // Criando um objeto da classe Animal
    val animal1 = Animal("Rex", "Cachorro", 5)
    animal1.exibirInformacoes()
    
    // Criando outro objeto da classe Animal
    val animal2 = Animal("Mimi", "Gato", 3)
    animal2.exibirInformacoes()
}
