import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MediaParaAprovacao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, mediaNotas;

        System.out.print("Digite a 1ª nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite a 2ª nota: ");
        nota2 = scanner.nextDouble();

        mediaNotas = (nota1 + nota2) / 2;

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);
        String mediaFormatada = df.format(mediaNotas);

        System.out.println("\nA média das notas é igual a: " + mediaFormatada);
        
        if (mediaNotas >= 7.0) {
            System.out.println("\nVocê foi Aprovado!");
        } 
        else {
            System.out.println("\nVocê foi Reprovado!");
        }
        scanner.close();
    }
}