import java.util.Scanner;

public class ContaParesImpares {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       int par = 0, impar = 0, n;

        System.out.println("\nDigite 10 números.");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            n = scanner.nextInt();

            if (n % 2 == 0) {
                par++; 
            } 
            else {
                impar++; 
            }
        }
        System.out.println("\n--- Resultado ---");
        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números ímpares: " + impar);

        scanner.close();
    }
}