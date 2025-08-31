import java.util.Scanner;

public class ConversorMoeda {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double moedaReal, moedaDollar = 0.18, conversao;

        System.out.print("\nInforme quanto você quer converter de Real para Dollar: ");
        moedaReal = scanner.nextDouble();

        conversao = moedaReal * moedaDollar;

        System.out.printf("\nO valor R$%.2f Reais, foi convertido para US$%.2f Dólares%n", moedaReal, conversao);

        scanner.close();
    }
}
