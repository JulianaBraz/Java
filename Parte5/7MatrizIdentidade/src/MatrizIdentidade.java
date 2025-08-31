public class MatrizIdentidade {

    public static void main(String[] args) {
       
        int[][] matrizIdentidade = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        int[][] matrizNaoIdentidade = {
            {1, 0, 0},
            {0, 5, 0},
            {0, 0, 1}
        };
        
        System.out.println("--- Verificando a Primeira Matriz ---");
        exibirMatriz(matrizIdentidade);
        if (ehMatrizIdentidade(matrizIdentidade)) {
            System.out.println("A matriz É uma matriz identidade.");
        } 
        else {
            System.out.println("A matriz NÃO É uma matriz identidade.");
        }

        System.out.println("\n\n--- Verificando a Segunda Matriz ---");
        exibirMatriz(matrizNaoIdentidade);
        if (ehMatrizIdentidade(matrizNaoIdentidade)) {
            System.out.println("A matriz É uma matriz identidade.");
        } 
        else {
            System.out.println("A matriz NÃO É uma matriz identidade.");
        }
    }
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("   " + matriz[i][j] + " ");
            }
            System.out.println("   |");
        }
    }
    public static boolean ehMatrizIdentidade(int[][] matriz) {
        int tamanho = matriz.length;
        
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i == j) { 
                    if (matriz[i][j] != 1) {
                        return false;
                    }
                } 
                else { 
                    if (matriz[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}