class Animal (
    // Este é o construtor primário
    nome: String = "",
    especie: String = "",
    idade: Int = 0
) {

    var nome: String
    var especie: String
    var idade: Int
    
    init {
        // init é um bloco de inicialização que é chamado quando o objeto é criado
        this.nome = nome
        this.especie = especie
        this.idade = idade
    }
    
    // Este método é chamado quando queremos exibir as informações do animal
    fun exibirInformacoes() {
        println("$nome é um(a) $especie e tem $idade anos.")
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
