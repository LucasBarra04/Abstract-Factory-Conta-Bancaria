import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    void deveEmitirContratoPessoaFisica() {
        Conta conta = new Conta(new FabricaPessoaFisica());
        String resultado = conta.emitirContrato();
        assertEquals("Contrato de conta para Pessoa Física emitido.", resultado);
    }

    @Test
    void deveEmitirCartaoPessoaFisica() {
        Conta conta = new Conta(new FabricaPessoaFisica());
        String resultado = conta.emitirCartao();
        assertEquals("Cartão de débito para Pessoa Física emitido.", resultado);
    }

    @Test
    void deveEmitirContratoPessoaJuridica() {
        Conta conta = new Conta(new FabricaPessoaJuridica());
        String resultado = conta.emitirContrato();
        assertEquals("Contrato de conta para Pessoa Jurídica emitido.", resultado);
    }

    @Test
    void deveEmitirCartaoPessoaJuridica() {
        Conta conta = new Conta(new FabricaPessoaJuridica());
        String resultado = conta.emitirCartao();
        assertEquals("Cartão corporativo para Pessoa Jurídica emitido.", resultado);
    }
}