import java.util.Scanner;

public class VogalOuConsoante {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = scanner.next().toLowerCase().charAt(0);

        boolean vogal;

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                vogal = true;
                break;
            default:
                vogal = false;
                break;
        }
        if (vogal) {
            System.out.println("A letra '" + letra + "' é uma vogal.");
        } 
        else {
            if (letra >= 'a' && letra <= 'z') {
                System.out.println("A letra " + letra + "é uma consoante.");
            } 
            else {
                System.out.println("O " + letra + " não é uma letra do alfabeto.");
            }
        }

        scanner.close();
    }
}