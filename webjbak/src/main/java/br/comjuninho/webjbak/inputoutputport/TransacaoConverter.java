package br.comjuninho.webjbak.inputoutputport;

import br.com.juninho.jbak.core.Transacao;
import br.comjuninho.webjbak.entity.TransacaoEntity;

public class TransacaoConverter {
	
	public static TransacaoEntity fromTransacaoToEntity(Transacao tr) {
		if(tr != null) {
			TransacaoEntity entity = new TransacaoEntity();
			entity.setContaDestino(ContaConverter.fromContatoEntity(tr.getContaDestino()));
			entity.setContaOrigem(ContaConverter.fromContatoEntity(tr.getContaOrigem()));
			entity.setNumeroDocumneto(tr.getUuid());
			entity.setNatureza(tr.getNatureza());
			entity.setValor(tr.getValor());
			return entity;
		}
		return null;
		
	}
	public static Transacao fromEntityToTransacao(TransacaoEntity tr) {
		if(tr != null) {
			Transacao transacao = new Transacao();
			transacao.setNatureza(tr.getNatureza());
			transacao.setUuid(tr.getNumeroDocumneto());
			transacao.setValor(tr.getValor());
			transacao.setContaDestino(ContaConverter.fromEntityToConta(tr.getContaDestino()));
			transacao.setContaOrigem(ContaConverter.fromEntityToConta(tr.getContaOrigem()));
			return transacao;
		}
		return null;
	}

}
