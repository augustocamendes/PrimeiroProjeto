import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Primeiro Número:");
        int primeiroNumero = scanner.nextInt();
        while (true) {
            int proximoNumero = scanner.nextInt();
            if (proximoNumero < primeiroNumero) {
                System.out.println("Número menor que o inicial, ignorado!");
                continue; // pula direto para a próxima repetição
            }
            if (proximoNumero % primeiroNumero != 0) {
                System.out.println("Resto diferente de zero! Fim do programa.");
                break; // quebra o while e encerra o jogo
            }
        }


    }
}
