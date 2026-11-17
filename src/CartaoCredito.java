public class CartaoCredito implements MeioPagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " cobrado na fatura do Cartão de Crédito! 💳");
    }

}
