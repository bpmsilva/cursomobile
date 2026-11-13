fun main() {

    var nome: String? = null // Variável do tipo String que pode ser nula

    // Erro de compilação, pois a variável nome é nula
    // print("Tamanho da variável nome: ${nome.length}\n")

    // Chamada segura (?.): no caso retorna null
    print("Tamanho da variável nome: ${nome?.length}\n")

    // Chamada segura com operador Elvis (?:): no caso retorna 0
    print("Tamanho da variável nome: ${nome?.length ?: 0}\n")
    
    // Também é possível usar um if para tratar o caso nome
    if (nome != null) {
        print("Variável nome: ${nome}\n")
    } else {
        print("A variável nome é nula\n")
    }
}
