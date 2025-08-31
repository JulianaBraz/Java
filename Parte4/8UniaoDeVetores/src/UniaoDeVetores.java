import java.util.Random;

public class UniaoDeVetores {

    public static void main(String[] args) {

        final int TAMANHO_VETOR = 5;
        int[] vetor1 = new int[TAMANHO_VETOR];
        int[] vetor2 = new int[TAMANHO_VETOR];
        int[] vetorUniao = new int[TAMANHO_VETOR * 2];

        Random random = new Random();

        for (int i = 0; i < TAMANHO_VETOR; i++) {
            vetor1[i] = random.nextInt(100);
        }
        for (int i = 0; i < TAMANHO_VETOR; i++) {
            vetor2[i] = random.nextInt(100);
        }
        System.out.print("Vetor 1: ");
        exibirVetor(vetor1);
        System.out.print("Vetor 2: ");
        exibirVetor(vetor2);

        for (int i = 0; i < TAMANHO_VETOR; i++) {
            vetorUniao[i] = vetor1[i];
        }
        for (int i = 0; i < TAMANHO_VETOR; i++) {
            vetorUniao[TAMANHO_VETOR + i] = vetor2[i];
        }
        System.out.println("\n--- Resultado da União ---");
        System.out.print("Vetor União: ");
        exibirVetor(vetorUniao);
    }
    public static void exibirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
