public class Conta {
    private Contrato contrato;
    private Cartao cartao;

    public Conta(FabricaAbstrata fabrica) {
        this.contrato = fabrica.createContrato();
        this.cartao   = fabrica.createCartao();
    }

    public String emitirContrato() {
        return contrato.emitir();
    }

    public String emitirCartao() {
        return cartao.emitir();
    }
}