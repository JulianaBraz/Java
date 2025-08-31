import java.util.Scanner;

public class SomaElementosVetor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        final int TAMANHO = 5;
        int[] vetor = new int[TAMANHO];
        int soma = 0;

        System.out.println("Digite " + TAMANHO + " números inteiros para preencher o vetor:");

        for (int i = 0; i < TAMANHO; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }
        for (int i = 0; i < TAMANHO; i++) {
            soma += vetor[i];
        }

        System.out.println("\nA soma de todos os elementos do vetor é: " + soma);

        scanner.close();
    }
}