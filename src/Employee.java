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

}
