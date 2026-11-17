public abstract sealed class Employee permits Manager, Salesman {

    protected String name;
    protected double salary;

    // Método abstrato: a mãe OBRIGA todo filho a calcular o salário do seu próprio jeito!
    public abstract double calcularSalario();

    // Getters e Setters básicos:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    // Versão 1 da sobrecarga (só os dias):
    public void solicitarFolga(int dias) {
        System.out.println(this.name + " solicitou " + dias + " dias de folga.");
    }

    // Versão 2 da sobrecarga (dias + motivo):
    public void solicitarFolga(int dias, String motivo) {
        System.out.println(this.name + " solicitou " + dias + " dias de folga pelo motivo: " + motivo);
    }
}
