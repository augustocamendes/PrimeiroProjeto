import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        // 1. Entrada de dados (usamos nextDouble para permitir casas decimais)
        System.out.println("Informe seu peso em kg (ex: 70,5):");
        double peso = scanner.nextDouble();
        System.out.println("Informe sua altura em metros (ex: 1,75):");
        double altura = scanner.nextDouble();
        // 2. Cálculo do IMC
        double imc = peso / (altura * altura);
        // Mostra o valor calculado com duas casas decimais
        System.out.printf("Seu IMC é: %.2f\n", imc);
        // 3. Classificação com if e else if
        if (imc <= 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Classificação: Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Classificação: Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Classificação: Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Classificação: Obesidade Grau II (Severa)");
        } else {
            System.out.println("Classificação: Obesidade III (Mórbida)");
        }
        scanner.close();
    }
}
