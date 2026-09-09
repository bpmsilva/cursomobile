/**
 * RODE ESTE EXEMPLO NO TERMINAL!
 * Para compilar: javac Main.java
 * Para executar: java Main
*/


// É necessário importar a classe Scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // O objeto Scanner é usado para recebar dados da entrada padrão (teclado)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        // Lê uma linha de texto do usuário
        // Outras métodos de leitura incluem nextInt(), nextDouble(), etc.
        String name = scanner.nextLine(); 

        // Exibe uma mensagem de boas-vindas usando o nome fornecido
        System.out.println("Olá, " + name + "! Bem-vindo ao Java.");

        // Fecha o scanner para liberar recursos. É uma boa prática.
        scanner.close(); 
    }
}
