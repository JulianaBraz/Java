import java.util.Scanner;

public class VetorPreenchido {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];

        System.out.println("Por favor, digite 5 números inteiros para preencher o vetor:");

        for (int posicao = 0; posicao < 5; posicao++) {
            System.out.print("Digite o " + (posicao + 1) + "º número: ");
            vetor[posicao] = scanner.nextInt();
        }

        System.out.println("\nVetor na ordem original:");
        for (int posicao = 0; posicao < 5; posicao++) {
            System.out.print(vetor[posicao] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}