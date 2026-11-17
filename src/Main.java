public class Main {
    public static void main(String[] args) {

        // 1. Criando o Gerente:
        Manager gerente = new Manager();
        gerente.setName("Carlos");
        gerente.setSalary(5000.0);

        // 2. Criando o Vendedor:
        Salesman vendedor = new Salesman();
        vendedor.setName("Bia");
        vendedor.setSalary(2000.0);

        // 3. O POLIMORFISMO em ação: chamamos o mesmo método 'calcularSalario()'
        System.out.println("Salário final do Gerente " + gerente.getName() + ": R$ " + gerente.calcularSalario());
        System.out.println("Salário final do Vendedor " + vendedor.getName() + ": R$ " + vendedor.calcularSalario());

        // 4. Teste de curiosidade:
        // Se você tentar descomentar a linha abaixo, o Java nem deixa compilar!
        // Employee e = new Employee(); // ERRO! Employee é abstract e não pode ser instanciada!

    }
}