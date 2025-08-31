import java.util.Scanner;

public class BuscarValorVetor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = {12, 5, 27, 8, 42, 16, 9, 31, 7, 20};
        
        System.out.print("Digite um número para buscar no vetor: ");
        int numeroBuscado = scanner.nextInt();
        int posicaoEncontrada = -1;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numeroBuscado) {
                posicaoEncontrada = i;
                break; 
            }
        }
        if (posicaoEncontrada != -1) {
            System.out.println("O número " + numeroBuscado + " foi encontrado na posição " + posicaoEncontrada + " do vetor.");
        } 
        else {
            System.out.println("O número " + numeroBuscado + " não foi encontrado no vetor.");
        }

        scanner.close();
    }
}