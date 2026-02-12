package br.com.juninho.jbank.testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.juninho.jbak.core.ContaBancaria;
import br.com.juninho.jbak.core.Transacao;
import br.com.juninho.jbak.exception.ContaNotFoundException;
import br.com.juninho.jbak.exception.SaldoInsuficienteException;
import br.com.juninho.jbak.service.ItransacaoService;
import br.com.juninho.jbak.service.TransacaoServiceImpl;

class TransferenciaTest {
    private ContaBancaria contaOrigemValida;
    private ContaBancaria contaDestinoValida;
    private ItransacaoService transacaoService;
    
    @BeforeEach 
    public void setup() {
    	transacaoService = new TransacaoServiceImpl();
    	contaOrigemValida = new ContaBancaria(1234,1,"juninho", 1000.0);
    	contaDestinoValida = new ContaBancaria(1234,1,"Elen", 500.0);
    	
    }
	@Test
	void fluxoDoCasoDeUsoNormal() {
		Transacao tr = transacaoService.efetivarTransferencia(contaOrigemValida, contaDestinoValida, 100.0);
		assertTrue(tr.getNatureza().equals("TRANSF") &&
				tr.getContaOrigem().getSaldo() == 900.0 &&
				tr.getContaDestino().getSaldo() == 600.0);
	}
   @Test
   void fluxoAlternativo1_ContaInvalida() {
	   assertThrows(ContaNotFoundException.class, () ->{
	   Transacao tr = transacaoService.efetivarTransferencia(contaOrigemValida, null, 100.0);
	   });
   }
   @Test
   void fluxoAlternativo2_SaldoInsuficiente() {
	   assertThrows(SaldoInsuficienteException.class, ()->{
	   Transacao tr = transacaoService.efetivarTransferencia(contaOrigemValida, contaDestinoValida, 2000.00);
	   });
   }
}
