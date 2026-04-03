public class FabricaPessoaFisica implements FabricaAbstrata {
    @Override
    public Contrato createContrato() {
        return new ContratoFisico();
    }

    @Override
    public Cartao createCartao() {
        return new CartaoFisico();
    }
}