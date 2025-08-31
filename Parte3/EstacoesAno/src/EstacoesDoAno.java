import java.util.Scanner;

public class EstacoesDoAno {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número do mês (1 a 12):");
        int mes = scanner.nextInt();

        switch (mes) {
            case 12:
            case 1:
            case 2:
                System.out.println("A estação é: Verão");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("A estação é: Outono");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("A estação é: Inverno");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("A estação é: Primavera");
                break;
            default:
                System.out.println("Mês inválido. Por favor, digite um número entre 1 e 12.");
                break;
        }

        scanner.close();
    }
}