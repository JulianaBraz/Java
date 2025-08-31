import java.util.Scanner;

public class LoginSimples {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String usuario = "admin";
        String senha = "senha123";

        String usuarioDigitado;
        String senhaDigitada;

        System.out.print("Digite o nome de usuário: ");
        usuarioDigitado = scanner.nextLine();

        System.out.print("Digite a senha: ");
        senhaDigitada = scanner.nextLine();

        if (usuarioDigitado.equals(usuario) && senhaDigitada.equals(senha)) {
            System.out.println("\nLogin bem-sucedido! Bem-vindo(a), " + usuario);
        } 
        else {
            System.out.println("\nNome de usuário ou senha incorretos. Tente novamente.");
        }

        scanner.close();
    }
}