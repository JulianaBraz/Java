import java.util.Scanner;

public class NMaior {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1, n2;

        System.out.print("Digite o 1º número: ");
        n1 = scanner.nextInt();

        System.out.print("Digite o 2º número: ");
        n2 = scanner.nextInt();

        
        if (n1 > n2) {
            System.out.println("\nO número " + n1 + " é maior que o número " + n2);
        } 
        else {
            System.out.println("\nO número " + n2 + " é maior que o número " + n1);
        }
        scanner.close();
    }
}
