import java.util.Random;
import java.util.Scanner;

public class SomaLinhaMatriz {

    public static void main(String[] args) {
        
        final int TAMANHO = 5;
        int[][] matriz = new int[TAMANHO][TAMANHO];
        int linhaEscolhida;
      
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Matriz 5x5 gerada:");
        
        for (int linha = 0; linha < TAMANHO; linha++) {
            for (int coluna = 0; coluna < TAMANHO; coluna++) {
                matriz[linha][coluna] = random.nextInt(10); 
                System.out.print("[" + matriz[linha][coluna] + "]");
            }
            System.out.println();
        }
        do {
            System.out.print("\nEscolha uma linha de (0 a 4): ");
            linhaEscolhida = scanner.nextInt();
        } 
        while (linhaEscolhida < 0 || linhaEscolhida >= TAMANHO);
        
        int somaLinha = 0;
        for (int coluna = 0; coluna < TAMANHO; coluna++) {
            somaLinha += matriz[linhaEscolhida][coluna];
        }
        System.out.println("\nA soma dos elementos da linha " + linhaEscolhida + " é: " + somaLinha);
        scanner.close();
    }
}