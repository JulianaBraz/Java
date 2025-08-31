import java.util.Scanner;

public class MaiorMenorNumero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        double maior = Double.NEGATIVE_INFINITY, menor = Double.POSITIVE_INFINITY, n;

        System.out.println("Digite uma série de números para encontrar o maior e o menor.");
        System.out.println("Digite 0 para encerrar e ver os resultados.");
        
        do {
            System.out.print("Digite um número: ");
            n = scanner.nextDouble();

            if (n == 0) {
                break;
            }
            if (n > maior) {
                maior = n;
            }
            if (n < menor) {
                menor = n;
            }

        } 
        while (true); 

        if (maior == Double.NEGATIVE_INFINITY) {
            System.out.println("\nNenhum número foi digitado além de 0.");
        } 
        else {
            System.out.println("\n--- Resultado ---");
            System.out.println("O maior número digitado foi: " + maior);
            System.out.println("O menor número digitado foi: " + menor);
        }
        scanner.close();
    }
}