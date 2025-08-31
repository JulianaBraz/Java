import java.util.Scanner;

public class NMaisOuMenos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n1;

        System.out.print("Digite um número: ");
        n1 = scanner.nextInt();

       
        if (n1 > 0) {
            System.out.println("\nO número " + n1 + " é Positivo!");
        } 
        else if (n1 == 0){
            System.out.println("\nO número " + n1 + " é Zero!");
        }
        else {
            System.out.println("\nO número " + n1 + " é Negativo");
        }
        scanner.close();
    }
}