package br.com.juninho.jbak.service;

import java.util.UUID;

import br.com.juninho.jbak.core.ContaBancaria;
import br.com.juninho.jbak.core.Transacao;
import br.com.juninho.jbak.exception.ContaNotFoundException;
import br.com.juninho.jbak.exception.SaldoInsuficienteException;

public class TransacaoServiceImpl implements ItransacaoService {

	@Override
	public Transacao efetivarTransferencia(ContaBancaria origem, ContaBancaria destino, Double valor) {
		//fluxo normal
		if(origem != null && destino != null) {
			if(origem.getSaldo()>= valor) {
				Transacao tr = new Transacao();
				origem.setSaldo(origem.getSaldo() - valor);
				destino.setSaldo(destino.getSaldo() + valor);
				tr.setNatureza("TRANSF");
				tr.setUuid(UUID.randomUUID().toString());
				tr.setValor(valor);
				tr.setContaOrigem(origem);
				tr.setContaDestino(destino);
				return tr;
			}
			throw new SaldoInsuficienteException("Saldo insuficiente da conga "+ origem.getNumeroConta());
			}
		throw new ContaNotFoundException("Conta inexistente");
		

	}

}
