import java.util.Scanner;

public class MediaElementosVetor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // Define o tamanho do vetor
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

        System.out.println("\nA média de todos os elementos do vetor é: " + soma/5);

        scanner.close();
    }
}
