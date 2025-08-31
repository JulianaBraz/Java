import java.util.Scanner;

public class CadastroAlunos {

    final static int MAX_ALUNOS = 100;
 
    static String[] nomes = new String[MAX_ALUNOS];
    static double[] notas = new double[MAX_ALUNOS];
    
    static int contadorAlunos = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int opcao;
        
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    listarAlunos();
                    break;
                case 3:
                    exibirMediaTurma();
                    break;
                case 4:
                    exibirMaiorNota();
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
        
        scanner.close();
    }
    public static void exibirMenu() {

        System.out.println("\n--- MENU ---");
        System.out.println("1. Cadastrar Aluno");
        System.out.println("2. Listar Todos os Alunos");
        System.out.println("3. Exibir Média da Turma");
        System.out.println("4. Exibir Aluno com Maior Nota");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }
    public static void cadastrarAluno() 
    {
        if (contadorAlunos < MAX_ALUNOS) {
            System.out.print("Digite o nome do aluno: ");
            nomes[contadorAlunos] = scanner.nextLine();          
            System.out.print("Digite a nota do aluno: ");
            notas[contadorAlunos] = scanner.nextDouble();
            contadorAlunos++;
            System.out.println("Aluno cadastrado com sucesso!");
        } 
        else {
            System.out.println("Cadastro cheio! Não é possível adicionar mais alunos.");
        }
    }
    public static void listarAlunos() {

        if (contadorAlunos == 0) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        System.out.println("\n--- LISTA DE ALUNOS ---");
        for (int i = 0; i < contadorAlunos; i++) {
            System.out.println("Nome: " + nomes[i] + ", Nota: " + notas[i]);
        }
    }
    public static void exibirMediaTurma() {
        
        if (contadorAlunos == 0) {
            System.out.println("Nenhum aluno cadastrado. Média não pode ser calculada.");
            return;
        }
        
        double somaNotas = 0;
        for (int i = 0; i < contadorAlunos; i++) {
            somaNotas += notas[i];
        }
        double media = somaNotas / contadorAlunos;
        System.out.printf("A média da turma é: %.2f%n", media);
    }
    public static void exibirMaiorNota() {

        if (contadorAlunos == 0) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        int indiceMaiorNota = 0;
        for (int i = 1; i < contadorAlunos; i++) {
            if (notas[i] > notas[indiceMaiorNota]) {
                indiceMaiorNota = i;
            }
        }
        System.out.println("\n--- Maior Nota ---");
        System.out.println("Aluno: " + nomes[indiceMaiorNota]);
        System.out.println("Nota: " + notas[indiceMaiorNota]);
    }
}
