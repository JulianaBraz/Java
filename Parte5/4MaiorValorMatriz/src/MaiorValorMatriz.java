import java.util.Random;

public class MaiorValorMatriz {

    public static void main(String[] args) {

        Random random = new Random();

        final int TAMANHO = 5;
        int[][] matriz = new int[TAMANHO][TAMANHO];
        int maiorValor = Integer.MIN_VALUE, linhaMaior = -1, colunaMaior = -1;
        
        System.out.println("Matriz:");

        for (int linha = 0; linha < TAMANHO; linha++) {
            for (int coluna = 0; coluna < TAMANHO; coluna++) {
                matriz[linha][coluna] = random.nextInt(100);
                System.out.print("[" + matriz[linha][coluna] + "]");
                if (matriz[linha][coluna] > maiorValor) {
                    maiorValor = matriz[linha][coluna];
                    linhaMaior = linha;
                    colunaMaior = coluna;
                }
            }
            System.out.println();
        }

        System.out.println("\nO maior valor da matriz é " + maiorValor);
        System.out.println("Ele está na posição [" + linhaMaior + "][" + colunaMaior + "].");
    }
}