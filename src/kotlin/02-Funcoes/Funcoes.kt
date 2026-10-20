fun soma(a: Int, b: Int = 0): Int {
    return a + b
}

fun somaNumeros(a: Number, b: Number): Double {
    return a.toDouble() + b.toDouble()
}

fun main() {
    val resultado1 = soma(10, 20)
    println("Resultado da soma: $resultado1")

    val resultado2 = soma(10)
    println("Resultado da soma: $resultado2")

    // Erro de compilação, pois os parâmetros são do tipo Int
    // val resultado3 = soma(1.0, 2.0)

    // É possível alterar a ordem dos parâmetros, desde que seja informado o nome do parâmetro
    val resultado4 = soma(b = 30, a = 20)
    println("Resultado da soma: $resultado4")

    // Não há erro de compilação, pois os parâmetros são do tipo Number
    val resultado5 = somaNumeros(1.0, 2.0)
    println("Resultado da soma de números: $resultado5")
}
