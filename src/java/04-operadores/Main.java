public class Main {
    public static void main(String[] args) {
        // Operadores aritméticos
        int a = 10;
        int b = 5;

        int soma = a + b;          // Adição
        int subtracao = a - b;     // Subtração
        int multiplicacao = a * b; // Multiplicação
        int divisao = a / b;       // Divisão
        int resto = a % b;         // Resto da divisão

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto: " + resto);

        // Operadores de atribuição
        int c = 10;
        c += 5; // Equivalente a c = c + 5
        System.out.println("Atribuição (c += 5): " + c);
        c -= 3; // Equivalente a c = c - 3
        System.out.println("Atribuição (c -= 3): " + c);
        c *= 2; // Equivalente a c = c * 2
        System.out.println("Atribuição (c *= 2): " + c);
        c /= 4; // Equivalente a c = c / 4
        System.out.println("Atribuição (c /= 4): " + c);
        c %= 3; // Equivalente a c = c % 3
        System.out.println("Atribuição (c %= 3): " + c);

        // Operadores de incremento e decremento
        int d = 10;
        d++; // Incremento (d = d + 1), d += 1. Há ainda ++d;
        System.out.println("Incremento: " + d);

        d--; // Decremento (d = d - 1), d -= 1. Há ainda --d;
        System.out.println("Decremento: " + d);

        // Operadores de Comparação
        int e = 10;
        int f = 5;
        boolean igual = e == f;      // Igualdade
        boolean diferente = e != f;  // Diferença
        boolean maior = e > f;       // Maior que
        boolean menor = e < f;       // Menor que
        boolean maiorOuIgual = e >= f; // Maior ou igual
        boolean menorOuIgual = e <= f; // Menor ou igual

        // Operadores Lógicos
        boolean g = true;
        boolean h = false;
        boolean and = g && h; // AND lógico
        boolean or = g || h;  // OR lógico
        boolean not = !g;     // NOT lógico

        // Operador ternário
        int i = 10;
        String resultado = (i > 5) ? "Maior que 5" : "Menor ou igual a 5";
        System.out.println("Resultado do operador ternário: " + resultado);
   }
}
