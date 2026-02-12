package br.com.juninho.jbak.service;

import br.com.juninho.jbak.core.ContaBancaria;
import br.com.juninho.jbak.core.Transacao;

public interface ItransacaoService {
	public Transacao efetivarTransferencia(ContaBancaria origem, ContaBancaria destino, Double valor);

}
