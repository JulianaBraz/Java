import java.util.Scanner;

public class MediaVetor {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantas notas você deseja inserir? ");
        int quantidade = scanner.nextInt();
        
        double[] notas = new double[quantidade];
        
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            notas[i] = scanner.nextDouble();
        }
        double mediaDasNotas = calcularMedia(notas);
        System.out.printf("\nA média das notas é: %.2f%n", mediaDasNotas);
        scanner.close();
    }
    public static double calcularMedia(double[] vetor) {

        if (vetor.length == 0) {
            return 0.0;
        }
        double soma = 0.0;
        for (double elemento : vetor) {
            soma += elemento;
        }
        return soma / vetor.length;
    }
}