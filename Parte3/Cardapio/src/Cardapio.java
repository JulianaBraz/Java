import java.util.Scanner;

public class Cardapio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- CARDÁPIO ---");
            System.out.println("1. Hambúrguer");
            System.out.println("2. Pizza");
            System.out.println("3. Salada");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu Hambúrguer.");
                    break;
                case 2:
                    System.out.println("Você escolheu Pizza.");
                    break;
                case 3:
                    System.out.println("Você escolheu Salada.");
                    break;
                case 4:
                    System.out.println("Até a próxima!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } 
        while (opcao != 4);

        scanner.close();
    }
}
