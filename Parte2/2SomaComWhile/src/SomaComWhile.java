import java.util.Scanner;

public class SomaComWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        double somaTotal = 0, numeroDigitado;

        System.out.println("Digite os números que deseja somar. Digite 0 para encerrar e ver o resultado.");

        do {
            System.out.print("Digite um número: ");
            numeroDigitado = scanner.nextDouble();
            somaTotal += numeroDigitado;   
        } while (numeroDigitado != 0);

        System.out.printf("\nSoma total: %.2f%n", somaTotal);

        scanner.close();
    }
}