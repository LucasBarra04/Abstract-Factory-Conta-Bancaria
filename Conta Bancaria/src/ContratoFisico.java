public class ContratoFisico implements Contrato {
    @Override
    public String emitir() {
        return "Contrato de conta para Pessoa Física emitido.";
    }
}