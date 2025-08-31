import java.util.Random;
import java.util.Scanner;

public class ContarValorMatriz {

    public static void main(String[] args) {
        
        final int TAMANHO = 3;
        int[][] matriz = new int[TAMANHO][TAMANHO];
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matriz 3x3 gerada:");
        for (int linha = 0; linha < TAMANHO; linha++) {
            for (int coluna = 0; coluna < TAMANHO; coluna++) {
                matriz[linha][coluna] = random.nextInt(10);
                System.out.print("[" + matriz[linha][coluna] + "]");
            }
            System.out.println();
        }
        System.out.print("\nDigite um número para descobrir quantas vezes ele aparece na matriz: ");
        int numeroBuscado = scanner.nextInt();
        int contador = 0;
        for (int linha = 0; linha < TAMANHO; linha++) {
            for (int coluna = 0; coluna < TAMANHO; coluna++) {
                if (matriz[linha][coluna] == numeroBuscado) {
                    contador++;
                }
            }
        }
        System.out.println("\nO número " + numeroBuscado + " apareceu " + contador + " vez(es) na matriz.");

        scanner.close();
    }
}