// Controle de fluxo: if, while, for e when ...
fun main() {
    // avaliação de uma condição
    val nota = 7
    if (nota >= 7) {
        println("Aprovado")
    } else if (nota >= 5) {
        println("Recuperação")
    } else {
        println("Reprovado")
    }

    
    // if como expressão: retorna um valor
    val idade = 20
    val situacao = if (idade >= 18) {
        "Maior de idade"
    } else {
        "Menor de idade"
    }
    println(situacao)
    
	
	// while: repete enquanto a condição for verdadeira
	var contador = 1
	while (contador <= 3) {
		println("while: $contador")
		contador++
	}
	
	// do-while: garante pelo menos uma execução
	contador = 1
	do {
        println("do-while: $contador")
    } while (contador++ < 3)

	
	// for: percorre um intervalo
	for (numero in 1..3) {
		println("for: $numero")
	}
	
	// for: percorre uma coleção/array/lista
	val nomes = listOf("Alice", "Bob", "Charlie")
	for (nome in nomes) {
        println("for: $nome")
    }

    // Com índices:
    for (indice in nomes.indices) {
        println("for com índice: $indice - ${nomes[indice]}")
    }
    
    // Com índice e valor:
    for ((indice, nome) in nomes.withIndex()) {
        println("for com índice e valor: $indice -> $nome")
    }
       
    // forEach: percorre uma coleção/array/lista
    nomes.forEach { nome ->
        println("forEach: $nome")
    }

    
	// when: seleciona uma ação conforme o valor
	val dia = 2
	val nomeDoDia = when (dia) {
		1 -> "segunda-feira"
		2 -> "terça-feira"
		3 -> "quarta-feira"
		in 4..5 -> "dia útil"
		6, 7 -> "fim de semana"
		else -> "dia inválido"
	}
	println("Dia: $nomeDoDia")

}
