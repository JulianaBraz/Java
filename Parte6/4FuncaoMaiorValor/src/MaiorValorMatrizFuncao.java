public class MaiorValorMatrizFuncao {

    public static void main(String[] args) {

        int[][] matriz = {
            {10, 5, 25, 8},
            {42, 16, 9, 31},
            {7, 20, 55, 13}
        };

        int maiorValor = encontrarMaiorValor(matriz);
        System.out.println("Matriz:");
        exibirMatriz(matriz);

        System.out.println("\nO maior valor na matriz é: " + maiorValor);
    }
    public static int encontrarMaiorValor(int[][] matriz) {

        if (matriz.length == 0 || matriz[0].length == 0) {
            return Integer.MIN_VALUE;
        }

        int maior = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        return maior;
    }
    public static void exibirMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("|");
        }
    }
}