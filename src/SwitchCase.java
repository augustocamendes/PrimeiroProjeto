import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        // 1. Mostra o menu de opções na tela
        System.out.println("=== ATENDIMENTO ===");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Fazer Pix");
        System.out.println("3 - Falar com Atendente");
        System.out.println("Escolha uma opção:");

        // 2. Lê o número que o usuário digitou
        int opcao = scanner.nextInt();

        // 3. O switch escolhe o caminho de acordo com o número
        switch (opcao) {
            case 1:
                System.out.println("Seu saldo é R$ 1.500,00");
                break; // Para a execução aqui
            case 2:
                System.out.println("Área do Pix selecionada.");
                break;
            case 3:
                System.out.println("Encaminhando para um atendente...");
                break;
            default:
                System.out.println("Opção inválida! Digite 1, 2 ou 3.");
        }
        scanner.close();
    }
}