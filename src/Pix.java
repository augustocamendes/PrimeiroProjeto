public class Pix implements MeioPagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado instantaneamente via PIX! ⚡");
    }

}
