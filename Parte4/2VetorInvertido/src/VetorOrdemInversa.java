import java.util.Random;

public class VetorOrdemInversa {

    public static void main(String[] args) {
        
        int[] vetor = new int[10];
        
        Random random = new Random();

        for (int posicao = 0; posicao < 10; posicao++) {
            vetor[posicao] = random.nextInt(100) + 1;
        }
        System.out.println("Vetor na ordem original:");
        for (int posicao = 0; posicao < 10; posicao++) {
            System.out.print(vetor[posicao] + " ");
        }
        System.out.println("\n\nVetor na ordem inversa:");
        for (int posicao = 9; posicao >= 0; posicao--) {
            System.out.print(vetor[posicao] + " ");
        }
        
        System.out.println();
    }
}
