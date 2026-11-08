class Animal {
    var nome: String = ""
    var especie: String = ""
    var idade: Int = 0
    
    // Este construtor é chamado quando criamos um objeto da classe Animal
    // Ele é também conhecido como construtor secundário
    constructor(nome: String, especie: String, idade: Int) {
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
