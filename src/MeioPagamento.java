@FunctionalInterface
public interface MeioPagamento {

    // 1. O método obrigatório:
    void processarPagamento(double valor);

    // 2. O DEFAULT: usa o ajudante privado nos bastidores
    default void emitirRecibo() {
        carimbarRecibo(); // chama o ajudante privado!
        System.out.println("Recibo padrão gerado com sucesso! 🧾");
    }

    // 3. O PRIVATE: ajudante interno dos bastidores (ninguém de fora vê)
    private void carimbarRecibo() {
        System.out.println("[Autenticação de Segurança: OK]");
    }

    // 4. O STATIC: ferramenta que chamamos direto pelo nome da interface
    static void exibirRegrasBancarias() {
        System.out.println("Regra: Pagamentos após as 22h são processados no dia seguinte.");
    }

}
