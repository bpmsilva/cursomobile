fun main() {
  
    // Operador intervalo inclusivo:
    val intervaloInclusivo = 1..3
    println("Intervalo inclusivo: $intervaloInclusivo")
    for (i in intervaloInclusivo) {
        println("Inclusivo: $i")
    }
    
    
    // Intervalo com limite final exclusivo:
    // Semelhante a range(1, 4) em Python.
    val intervaloExclusivo = 1 until 4
    println("Intervalo exclusivo: $intervaloExclusivo")
    for (i in intervaloExclusivo) {
        println("Exclusivo: $i")
    }
    
    println()
    
    // Operador de pertencimento:
    val numero = 3
    val pertence = numero in intervaloInclusivo
    println("O número $numero pertence ao intervalo inclusivo? $pertence")
    
    val naoPertence = numero !in intervaloExclusivo
    println("O número $numero não pertence ao intervalo exclusivo? $naoPertence")

    println()
    
    // Operador in e !in com listas:
    val lista = listOf("Kotlin", "Java", "Python")
    for (linguagem in lista) {
        println("$linguagem está na lista.")
    }
    val linguagemProcurada = "Kotlin"
    println(linguagemProcurada in lista)  // true
    println(linguagemProcurada !in lista) // false
    
    println()
    
    // Operador de progressão decrescente:
    val progressaoDecrescente = 3 downTo 1
    println("Progressão decrescente: $progressaoDecrescente")
    for (i in progressaoDecrescente) {
        println("Decrescente: $i")
    }
    
    println()
    
    // Operador de progressão com passo:
    val progressaoComPasso = 1..10 step 3
    println("Progressão com passo: $progressaoComPasso")
    for (i in progressaoComPasso) {
        println("Com passo: $i")
    }
    
    println()
    
    // Operadores de verificação de tipo:
    val valor: Any = "Kotlin"
    println(valor is String) // true
    println(valor is Int)    // false
    println(valor !is Int)   // true

    println()
    
    // Operador de referência:
    fun mensagem() {
        println("Olá!")
    }
    val referencia = ::mensagem
    referencia()
}
