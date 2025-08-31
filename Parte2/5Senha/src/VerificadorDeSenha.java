import java.util.Scanner;

public class VerificadorDeSenha {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    
        final String SENHA = "java17";
        String senhaDigitada;

        System.out.println("Sistema de Verificação de Senha");

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextLine();

            if (!senhaDigitada.equals(SENHA)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (!senhaDigitada.equals(SENHA));

        System.out.println("\nSenha correta! Acesso permitido.");

        scanner.close();
    }
}
