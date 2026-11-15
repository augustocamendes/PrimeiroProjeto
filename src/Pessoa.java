public class Pessoa {

    String nome;
    private int idade;

    void falar() {
        System.out.println("Olá! Meu nome é " + nome + " e eu tenho " + idade + " anos.");
    }

    public void setIdade(int novaIdade) {
        if (novaIdade > 0) {
            this.idade = novaIdade;
        } else {
            System.out.println("Erro: A idade não pode ser zero ou negativa!");
        }
    } // <-- Repare neste fecha-chaves que encerra o setIdade!

    public int getIdade() {
        return this.idade;
    } // <-- Encerra o getIdade

} // <-- Encerra a classe Pessoa
