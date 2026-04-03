public class ContratoJuridico implements Contrato {
    @Override
    public String emitir() {
        return "Contrato de conta para Pessoa Jurídica emitido.";
    }
}