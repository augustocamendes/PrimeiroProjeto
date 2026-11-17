public class Funcionario {

    // Características que TODO funcionário tem:
    String nome;
    double salario;

    // Ação comum de todo funcionário:
    void receberSalario() {
        System.out.println(nome + " recebeu o salário de R$ " + salario);
    }

}
