public class Main {
    public static void main(String[] args) {

        // 1. Criando as pessoas
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Augusto";
        pessoa1.setIdade(-50); // Tentando colocar a idade inválida

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Maria";
        pessoa2.setIdade(30);  // Idade válida

        // 2. Mandando falar
        pessoa1.falar();
        pessoa2.falar();

        // 3. Consultando com getIdade()
        int idadeDaMaria = pessoa2.getIdade();
        System.out.println("Idade consultada da Maria: " + idadeDaMaria);

        // 4. Testando a condição
        if (pessoa2.getIdade() >= 18) {
            System.out.println(pessoa2.nome + " é maior de idade!");
        }

    } // <-- Só fecha o main AQUI no final de tudo!
} // <-- Fecha a classe Main