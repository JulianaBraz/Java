import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, mediaNotas;

        System.out.print("Digite a 1ª nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a 2ª nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Digite a 3ª nota: ");
        nota3 = scanner.nextDouble();

        System.out.print("Digite a 4ª nota: ");
        nota4 = scanner.nextDouble();

        mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);
        String mediaFormatada = df.format(mediaNotas);

        System.out.println("\nA média das notas é igual a: " + mediaFormatada);

        scanner.close();
    }
}
