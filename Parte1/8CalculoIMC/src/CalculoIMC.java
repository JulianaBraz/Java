import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double peso, altura, imc;

        System.out.print("\nDigite quanto você pesa (em kg): ");
        peso = scanner.nextDouble();

        System.out.print("Digite sua altura (em metros): ");
        altura = scanner.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("\nSeu IMC é de: %.2f\n\n", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso!");
        } 
        else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Normal!");
        } 
        else if (imc > 24.9 && imc <= 30) {
            System.out.println("Sobrepeso!");
        } 
        else {
            System.out.println("Obesidade!");
        }

        scanner.close();
    }
}