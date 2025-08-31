import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double n1, n2, resultado;
    char operador;

    System.out.println("Digite o 1° número: ");
        n1 = scanner.nextDouble();

        System.out.println("Digite o operador (+, -, *, /): ");
        operador = scanner.next().charAt(0);

        System.out.println("Digite o 2° número: ");
        n2 = scanner.nextDouble();

        resultado = switch (operador) {

            case '+' -> n1 + n2;
            case '-' -> n1 - n2;
            case '*' -> n1 * n2;
            case '/' -> n1 / n2;
            default -> {
                System.out.println("Erro: Operador inválido.");
                yield Double.NaN;
            }
        };

       if (!Double.isNaN(resultado)) {
            System.out.println("Resultado: " + resultado);
        }
        scanner.close();
    }
}