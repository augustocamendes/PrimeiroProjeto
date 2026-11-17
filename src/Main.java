public class Main {
    public static void main(String[] args) {

        // 1. Criando o Pix e testando o processarPagamento e o DEFAULT (com private por trás)
        MeioPagamento pag1 = new Pix();
        pag1.processarPagamento(150.0);
        pag1.emitirRecibo(); // chama o default

        System.out.println("---");

        // 2. Criando o Cartão de Crédito
        MeioPagamento pag2 = new CartaoCredito();
        pag2.processarPagamento(350.0);

        System.out.println("---");

        // 3. Criando o Boleto via LAMBDA
        MeioPagamento boleto = valor -> System.out.println("Boleto de R$ " + valor + " gerado com código de barras! 📄");
        boleto.processarPagamento(500.0);

        System.out.println("---");

        // 4. Testando o método STATIC direto na interface (sem dar new em nada!)
        MeioPagamento.exibirRegrasBancarias();

    }
}