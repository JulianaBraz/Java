import java.util.Scanner;

public class PalindromoVetor {
    //Palíndromo é o que se pode ler, indiferentemente, da esquerda para a direita ou vice-versa.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int TAMANHO = 5;
        int[] vetor = new int[TAMANHO];
        boolean ehPalindromo = true;

        System.out.println("Digite 5 números inteiros para verificar se o vetor é um palíndromo:");

        for (int i = 0; i < TAMANHO; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }
        for (int i = 0; i < TAMANHO / 2; i++) {
            if (vetor[i] != vetor[TAMANHO - 1 - i]) {
                ehPalindromo = false;
                break;
            }
        }
        if (ehPalindromo) {
            System.out.println("\nO vetor é um palíndromo.");
        } 
        else {
            System.out.println("\nO vetor não é um palíndromo.");
        }

        scanner.close();
    }
}