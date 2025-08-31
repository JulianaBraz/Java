import java.util.Random;

public class SomaMatrizes {

    public static void main(String[] args) {

        final int TAMANHO = 3;
        int[][] matrizA = new int[TAMANHO][TAMANHO];
        int[][] matrizB = new int[TAMANHO][TAMANHO];
        int[][] matrizSoma = new int[TAMANHO][TAMANHO];

        Random random = new Random();

        System.out.println("Matriz A:");
        preencherEExibirMatriz(matrizA, random, TAMANHO);
        System.out.println("\nMatriz B:");
        preencherEExibirMatriz(matrizB, random, TAMANHO);

        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        System.out.println("\nMatriz Soma (A + B):");
        exibirMatriz(matrizSoma, TAMANHO);
    }
    public static void preencherEExibirMatriz(int[][] matriz, Random random, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = random.nextInt(10);
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }
    public static void exibirMatriz(int[][] matriz, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }
}
