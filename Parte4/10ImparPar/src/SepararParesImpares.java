import java.util.Scanner;

public class SepararParesImpares {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int TAMANHO = 10;
        
        int[] numeros = new int[TAMANHO];
        int[] pares = new int[TAMANHO];
        int[] impares = new int[TAMANHO];

        int contadorPares = 0, contadorImpares = 0;

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < TAMANHO; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < TAMANHO; i++) {
            if (numeros[i] % 2 == 0) {
                pares[contadorPares] = numeros[i];
                contadorPares++;
            } 
            else {
                impares[contadorImpares] = numeros[i];
                contadorImpares++;
            }
        }
        System.out.println("\n--- Resultado da Separação ---");
        System.out.print("Números pares: ");
        if (contadorPares == 0) {
            System.out.println("Nenhum número par foi digitado.");
        } 
        else {
            for (int i = 0; i < contadorPares; i++) {
                System.out.print(pares[i] + " ");
            }
            System.out.println();
        }
        System.out.print("Números ímpares: ");
        if (contadorImpares == 0) {
            System.out.println("Nenhum número ímpar foi digitado.");
        } else {
            for (int i = 0; i < contadorImpares; i++) {
                System.out.print(impares[i] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}