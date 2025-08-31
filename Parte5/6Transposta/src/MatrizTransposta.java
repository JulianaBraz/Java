import java.util.Random;

public class MatrizTransposta {

    public static void main(String[] args) {

        final int LINHAS_ORIGINAL = 3;
        final int COLUNAS_ORIGINAL = 4;
        final int LINHAS_TRANSPOSTA = COLUNAS_ORIGINAL;
        final int COLUNAS_TRANSPOSTA = LINHAS_ORIGINAL;

        int[][] matrizOriginal = new int[LINHAS_ORIGINAL][COLUNAS_ORIGINAL];
        int[][] matrizTransposta = new int[LINHAS_TRANSPOSTA][COLUNAS_TRANSPOSTA];

        Random random = new Random();

        System.out.println("Matriz Original (" + LINHAS_ORIGINAL + "x" + COLUNAS_ORIGINAL + "):");
        for (int i = 0; i < LINHAS_ORIGINAL; i++) {
            for (int j = 0; j < COLUNAS_ORIGINAL; j++) {
                matrizOriginal[i][j] = random.nextInt(10);
                System.out.print("[" + matrizOriginal[i][j] + "]");
            }
            System.out.println();
        }
        for (int i = 0; i < LINHAS_ORIGINAL; i++) {
            for (int j = 0; j < COLUNAS_ORIGINAL; j++) {
                matrizTransposta[j][i] = matrizOriginal[i][j];
            }
        }
        System.out.println("\nMatriz Transposta (" + LINHAS_TRANSPOSTA + "x" + COLUNAS_TRANSPOSTA + "):");
        for (int i = 0; i < LINHAS_TRANSPOSTA; i++) {
            for (int j = 0; j < COLUNAS_TRANSPOSTA; j++) {
                System.out.print("[" + matrizTransposta[i][j] + "]");
            }
            System.out.println();
        }
    }
}