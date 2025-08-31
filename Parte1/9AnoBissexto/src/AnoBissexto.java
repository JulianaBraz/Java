import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ano;

        System.out.print("Digite um ano para verificar se ele é bissexto: ");
        ano = scanner.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("\nO ano " + ano + " é bissexto.");
        } 
        else {
            System.out.println("\nO ano " + ano + " não é bissexto.");
        }
      
        scanner.close();
    }
}