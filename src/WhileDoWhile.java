public class WhileDoWhile{
    public static void main(String[] args) {
        // Bateria já começa zerada
        int bateria = 0;

// DO = FAÇA: executa sem perguntar nada na primeira vez
        do {
            System.out.println("Ligando a tela do celular...");

// SÓ AQUI ele faz a pergunta: "A bateria é maior que 0?"
// Como é mentira (vale 0), ele não repete e encerra
        } while (bateria > 0);

        System.out.println("Bateria esgotada! Desligando.");
    }
}
