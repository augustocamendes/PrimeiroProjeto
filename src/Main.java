public class Main {
    public static void main(String[] args) {

        // 1. Criando a primeira pessoa (usando a palavra 'new' para dar vida a ela)
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Augusto";
        pessoa1.idade = 25;

        // 2. Criando uma segunda pessoa a partir do mesmo molde
        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Maria";
        pessoa2.idade = 30;

        // 3. Mandando cada uma executar a sua própria ação
        pessoa1.falar();
        pessoa2.falar();

    }
}