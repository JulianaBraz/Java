import java.util.Scanner;

public class DiaDaSemana {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        String dia;

        System.out.println("Digite um número de 1 a 7: ");
        
        do{
            System.out.print("Número do dia: ");
            n = scanner.nextInt();

            if (n < 1 || n > 7){
                System.out.println("Número inválido");
            }
        } 
        while (n < 1 || n > 7);

        switch (n){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Dia inválido";
                break;
        }

        System.out.println("O dia de número " + n + " é: " + dia);
        scanner.close();
    }
}
