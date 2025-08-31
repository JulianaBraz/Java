import java.util.Random;

public class SomaTotalMatriz {

    public static void main(String[] args) {

        final int LINHAS = 3;
        final int COLUNAS = 3;
        int[][] matriz = new int[LINHAS][COLUNAS];
        int somaTotal = 0;

        Random random = new Random();

        System.out.println("Matriz:");
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                matriz[i][j] = random.nextInt(10);
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                somaTotal += matriz[i][j];
            }
        }
        System.out.println("\nA soma de todos os elementos da matriz é: " + somaTotal);
    }
}
