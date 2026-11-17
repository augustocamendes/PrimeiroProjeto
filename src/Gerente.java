public class Gerente extends Funcionario {

    // O Gerente herda 'nome' e 'salario' automaticamente!
    // Aqui usamos o POLIMORFISMO: o Gerente recebe o salário de um jeito especial (+ bônus de R$ 1.000)
    @Override
    void receberSalario() {
        double salarioComBonus = salario + 1000.0;
        System.out.println("Gerente " + nome + " recebeu salário com bônus de R$ " + salarioComBonus + "!");
    }

}
