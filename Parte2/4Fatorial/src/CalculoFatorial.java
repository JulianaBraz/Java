import java.util.Scanner;

public class CalculoFatorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n, calcular = 1, fatorial = 1;
        
        System.out.print("Digite um número: ");
        n = scanner.nextInt();

        while (calcular <= n) {
            fatorial *= calcular;
            calcular +=  1;
        }
        System.out.println("O fatorial de " + n + " é: " + fatorial);
 
        scanner.close();
    }
}