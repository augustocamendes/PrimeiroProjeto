import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        // 1. Entrada dos números
        System.out.println("Digite o primeiro número (menor):");
        int primeiro = scanner.nextInt();
        System.out.println("Digite o segundo número (maior):");
        int segundo = scanner.nextInt();
        // 2. Escolha: 1 para Par ou 2 para Ímpar
        System.out.println("O que você deseja ver? Digite 1 para PAR ou 2 para ÍMPAR:");
        int escolha = scanner.nextInt();
        System.out.println("--- RESULTADO EM ORDEM DECRESCENTE ---");
        // 3. O FOR começa no maior ('segundo') e vai descendo (i--) até o menor ('primeiro')
        for (int i = segundo; i >= primeiro; i--) {
            if (escolha == 1) { // Usuário quer PAR
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            } else if (escolha == 2) { // Usuário quer ÍMPAR
                if (i % 2 != 0) {
                    System.out.println(i);
                }
            } else {
                System.out.println("Opção de escolha inválida!");
                break;
            }
        }
        scanner.close();
    }
}
