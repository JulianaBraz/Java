import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        final int TAMANHO = 3;

        int[][] matriz = new int[TAMANHO][TAMANHO];

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite 9 números inteiros para preencher a matriz 3x3: ");

        for (int linha = 0; linha < TAMANHO; linha++) {
            for (int coluna = 0; coluna < TAMANHO; coluna++) {
                System.out.print("Digite o valor para a posição [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = scanner.nextInt();
            }
        }
        System.out.println("\nMatriz preenchida:");

        for (int linha = 0; linha < TAMANHO; linha++) {
            for (int coluna = 0; coluna < TAMANHO; coluna++) {
                System.out.print("[" + matriz[linha][coluna] + "]1");
            }
            
            System.out.println();
        }
        scanner.close();
    }
}
