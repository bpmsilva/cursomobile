import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // If, else if, else
        System.out.print("Digite um número: ");
        int numero = s.nextInt();
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        // Switch case
        System.out.print("Digite um dia da semana (1-7): ");
        int dia = s.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido.");
                break;
        }

        // Loop for
        int repeticoes = new Random().nextInt(5) + 3; // Gera um número aleatório entre 3 e 7
        System.out.println("Fazendo uma contagem de " + repeticoes + " repetições usando o for.");
        for (int i = 1; i <= repeticoes; i++) {
            System.out.println("Contagem: " + i);
        }

        // Loop while
        int contador = 0;
        System.out.println("Contando até 5 usando o loop while.");
        while (contador < 5) {
            contador++;
            System.out.println("Contador: " + contador);
        }

        // Loop do-while
        int entrada;
        do {
            // Este bloco será executado pelo menos uma vez.
            System.out.print("Digite 0 para sair: ");
            entrada = s.nextInt();
        } while (entrada != 0); // Repete enquanto o usuário não digitar 0

        s.close();

        // break e continue
        System.out.println("Exemplo de break e continue:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Break: Interrompendo o loop quando i é igual a 5.");
                break; // Interrompe o loop quando i é igual a 5
            }
            if (i % 2 == 0) {
                System.out.println("Continue: Pulando a iteração quando i é par (i = " + i + ").");
                continue; // Pula a iteração quando i é par
            }
            System.out.println("Valor de i: " + i);
        }
    }
}
