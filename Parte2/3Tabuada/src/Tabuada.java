import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n, resultado, i;

        System.out.println("Digite um número para ver sua tabuada: ");
        n = scanner.nextInt();

        for (i = 1; i <= 10; i++) {
            resultado = n * i;
            System.out.println(n + " X " + i + " = " + resultado);
        }
       
        scanner.close();
    }
}