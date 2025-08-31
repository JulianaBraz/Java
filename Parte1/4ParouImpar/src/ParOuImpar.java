import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.print("Digite um número inteiro para descobrir se ele é Ímpar ou Par: ");
        n = scanner.nextInt();

        if (n % 2 != 0) {
            System.out.println("\nO número " + n + " é ÍMPAR");
        } 
        else {
            System.out.println("\nO número " + n + " é PAR");
        }
        
        scanner.close();
    }
}