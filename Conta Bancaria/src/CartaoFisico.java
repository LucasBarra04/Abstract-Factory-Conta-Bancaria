public class CartaoFisico implements Cartao {
    @Override
    public String emitir() {
        return "Cartão de débito para Pessoa Física emitido.";
    }
}