import java.util.Scanner;

public class JogoDaVelha {

    private static char[][] tabuleiro = new char[3][3];
    private static char jogadorAtual = 'X';

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean jogoEmAndamento = true;
        int jogadas = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = ' ';
            }
        }

        System.out.println("X-Jogo da Velha-O");

        while (jogoEmAndamento) {
            exibirTabuleiro();
            System.out.println("É a vez do jogador " + jogadorAtual);
            
            int linha, coluna;
            boolean jogadaValida = false;
  
            while (!jogadaValida) {
                System.out.print("Digite a linha (1-3): ");
                linha = scanner.nextInt() - 1;
                System.out.print("Digite a coluna (1-3): ");
                coluna = scanner.nextInt() - 1;

                if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {
                    tabuleiro[linha][coluna] = jogadorAtual;
                    jogadaValida = true;
                } else {
                    System.out.println("Jogada inválida! Por favor, tente novamente.");
                }
            }
            jogadas++;

            if (verificarVencedor()) {
                exibirTabuleiro();
                System.out.println("\nParabéns! O jogador " + jogadorAtual + " venceu!");
                jogoEmAndamento = false;
            } 
            else if (jogadas == 9) {
                exibirTabuleiro();
                System.out.println("\nO jogo terminou em empate!");
                jogoEmAndamento = false;
            }
            else {
                jogadorAtual = (jogadorAtual == 'X') ? 'O' : 'X';
            }
        }
        
        scanner.close();
    }
    private static void exibirTabuleiro() {

        System.out.println("\n-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }
    private static boolean verificarVencedor() {
   
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
                return true; 
            }
            if (tabuleiro[0][i] == jogadorAtual && tabuleiro[1][i] == jogadorAtual && tabuleiro[2][i] == jogadorAtual) {
                return true; 
            }
        }
        if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) {
            return true;
        }
        if (tabuleiro[0][2] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][0] == jogadorAtual) {
            return true; 
        }
        
        return false;
    }
}