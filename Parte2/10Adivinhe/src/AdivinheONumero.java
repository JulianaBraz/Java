import java.util.Random;
import java.util.Scanner;

public class AdivinheONumero {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(100) + 1, tentativa, tentativas = 0;

        System.out.println("Bem-vindo ao jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        do {
            System.out.print("Sua tentativa: ");
            tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa > numeroAleatorio) {
                System.out.println("Tente um número MENOR.");
            } 
            else if (tentativa < numeroAleatorio) {
                System.out.println("Tente um número MAIOR.");
            } 
            else {
                System.out.println("\nParabéns! Você acertou o número " + numeroAleatorio + " em " + tentativas + " tentativa(s).");
            }
        }
    while (tentativa != numeroAleatorio);

        scanner.close();
    }
}