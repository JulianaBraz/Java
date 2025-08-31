import java.util.Scanner;

public class Primo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se ele é primo: ");
        int n = scanner.nextInt();

        boolean primo = true;

        if (n <= 1) {
            primo = false;
        } 
        else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    primo = false;
                    break; 
                }
            }
        }
        if (primo) {
            System.out.println("O número " + n + " é primo.");
        } 
        else {
            System.out.println("O número " + n + " não é primo.");
        }

        scanner.close();
    }
}