import java.util.Random;

public class SomaDiagonalPrincipal {

    public static void main(String[] args) {

        final int TAMANHO = 4;
        int[][] matriz = new int[TAMANHO][TAMANHO];
        int somaDiagonal = 0;
        Random random = new Random();

        System.out.println("Matriz gerada:");

        for (int linha = 0; linha < TAMANHO; linha++) {
            for (int coluna = 0; coluna < TAMANHO; coluna++) {
                matriz[linha][coluna] = random.nextInt(10);
                System.out.print("[" + matriz[linha][coluna] + "]");
            }
            System.out.println();
        }
        for (int i = 0; i < TAMANHO; i++) {
            somaDiagonal += matriz[i][i];
        }
        System.out.println("\nSoma da diagonal principal é: " + somaDiagonal);
    }
}