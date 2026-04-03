public class FabricaPessoaJuridica implements FabricaAbstrata {
    @Override
    public Contrato createContrato() {
        return new ContratoJuridico();
    }

    @Override
    public Cartao createCartao() {
        return new CartaoJuridico();
    }
}