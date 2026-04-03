public class CartaoJuridico implements Cartao {
    @Override
    public String emitir() {
        return "Cartão corporativo para Pessoa Jurídica emitido.";
    }
}