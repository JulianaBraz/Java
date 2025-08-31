import java.util.Random;

public class ContarParesVetor {

    public static void main(String[] args) {
        
        final int TAMANHO = 10;
        int[] vetor = new int[TAMANHO];
   
        Random random = new Random();
        int contadorPares = 0;

        for (int i = 0; i < TAMANHO; i++) {
            vetor[i] = random.nextInt(100) + 1;
        }
        System.out.println("Vetor gerado:");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < TAMANHO; i++) {
            if (vetor[i] % 2 == 0) {
                contadorPares++;
            }
        }
        
        System.out.println("\nTotal de números pares no vetor: " + contadorPares);
    }
}