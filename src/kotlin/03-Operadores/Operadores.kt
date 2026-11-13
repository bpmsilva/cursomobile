// Operadores em Kotlin (muito semelhantes a Java)
fun somar(x: Int, y: Int) = x + y

/*
 * Esta função demonstra o uso de operadores em Kotlin,
 * que são muito semelhantes aos operadores em Java.
 */
fun operadoresSemelhantesAoJava() {
    
    // Atribuições (muito semelhantes a Java)
	var n = 10
	n = 12
	n += 3 // Equivale a n = n + 3.
	n -= 1
	n *= 2
	n /= 2
	n %= 5
	println("Atribuições (=, +=, -=, *=, /=, %=): $n")


	// Aritméticos (muito semelhantes a Java)
	val a = 10
	val b = 3
	println("Soma (+): ${a + b}")
	println("Subtração (-): ${a - b}")
	println("Multiplicação (*): ${a * b}")
	println("Divisão (/): ${a / b}")
	println("Resto (%): ${a % b}")
	println("Mais unário (+): ${+a}; menos unário (-): ${-a}")


	// Incremento/decremento: a ordem importa (prefixados ou pós-fixados): mesmo comportamento de Java.
	var contador = 5
	println("contador++: ${contador++}")
	println("++contador: ${++contador}")
	println("contador--: ${contador--}")
	println("--contador: ${--contador}")
	
	// Comparação
	println("Igual/diferente (==, !=): ${a == b}, ${a != b}")
	println("Comparação (<, >, <=, >=): ${a < b}, ${a > b}, ${a <= b}, ${a >= b}")


	// Lógicos: && (E), || (OU) e ! (NÃO). && e || permitem curto-circuito
	// Muito semelhantes a Java
	val conectado = true
	val autorizado = false
	println("AND (&&): ${conectado && autorizado}")
	println("OR (||): ${conectado || autorizado}")
	println("NOT (!): ${!conectado}")
}

fun main() {

    operadoresSemelhantesAoJava()

    // Referença: === e !== verificam se duas referências apontam para o mesmo objeto.
	val referencia1 = Any()
	val referencia2 = referencia1
	println("Identidade (===): ${referencia1 === referencia2}")
	println("Diferença  (!==): ${referencia1 !== referencia2}")


	// Intervalos e pertencimento: .. inclui os extremos; until exclui o final.
	val faixa = 1..5 // Poderia ser 1 until 6
	println("Intervalo: $faixa; 5 in faixa=${5 in faixa}; 8 !in faixa=${8 !in faixa}")
	println("Progressão regressiva: ${5 downTo 1 step 2}")


	// Tipos: is/!is verificam o tipo; as converte e pode falhar; as? retorna null.
	val item: Any = "Kotlin"
	println("is String=${item is String}; !is Int=${item !is Int}")
	val texto = item as String
	val numero = item as? Int
	println("as: $texto; as?: $numero")


	// Outros usos: [] acessa índice (get/set); () chama função; :: cria referência.
	val letras = listOf("a", "b", "c")
	println("Índice []: ${letras[1]}")
	println("Chamada (): ${somar(2, 3)}")
	val referenciaDaFuncao = ::somar
	println("Referência (::): ${referenciaDaFuncao(4, 5)}")
}
