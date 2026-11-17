public final class Salesman extends Employee {

    private double comissao = 500.0;

    // O Vendedor calcula o salário somando a comissão:
    @Override
    public double calcularSalario() {
        return this.salary + this.comissao;
    }

}
