import java.util.Scanner;

public class FatorialFuncao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Fatorial não é definido para números negativos.");
        } 
        else {
            long resultadoFatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + resultadoFatorial);
        }

        scanner.close();
    }
    public static long calcularFatorial(int n) {
        
        if (n == 0 || n == 1) {
            return 1;
        }
        long fatorial = 1;
        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}