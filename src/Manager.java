// Toda classe filha de uma classe 'sealed' precisa ter a palavra 'final'
public final class Manager extends Employee {

    private double bonus = 2000.0;

    // O Gerente calcula o salário somando o bônus:
    @Override
    public double calcularSalario() {
        return this.salary + this.bonus;
    }

}
