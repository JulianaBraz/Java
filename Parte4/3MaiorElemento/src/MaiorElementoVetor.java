import java.util.Scanner;

public class MaiorElementoVetor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int TAMANHO = 5;
        int[] vetor = new int[TAMANHO];
        int maiorNumero;

        System.out.println("Digite " + TAMANHO + " números inteiros para preencher o vetor:");

        for (int i = 0; i < TAMANHO; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }

        maiorNumero = vetor[0];

        for (int i = 1; i < TAMANHO; i++) {
            if (vetor[i] > maiorNumero) {
                maiorNumero = vetor[i];
            }
        }

        System.out.println("\nO maior número no vetor é: " + maiorNumero);
        
        scanner.close();
    }
}
