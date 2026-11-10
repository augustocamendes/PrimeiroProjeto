import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite um número para ver a tabuada:");
        int numero = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        scanner.close();
    }
}

