import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a, b, soma;

        System.out.print("Digite o primeiro número: ");
        a = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        b = scanner.nextDouble();

        soma = a + b;

        System.out.println("\nA soma dos números é igual a: " + soma);


        scanner.close();
    }
}
