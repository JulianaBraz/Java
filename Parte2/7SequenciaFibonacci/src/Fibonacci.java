import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Quantos elementos da sequência de Fibonacci deseja calcular?: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println();
        scanner.close();
    }
    public static int fibonacci(int posicao) {

        if (posicao == 1) {
            return 0;
        } 
        else if (posicao == 2) {
            return 1;
        }
        return fibonacci(posicao - 1) + fibonacci(posicao - 2);
    }
}