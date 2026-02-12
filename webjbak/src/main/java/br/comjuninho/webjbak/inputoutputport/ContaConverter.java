package br.comjuninho.webjbak.inputoutputport;

import br.com.juninho.jbak.core.ContaBancaria;
import br.comjuninho.webjbak.entity.ContaEntity;

public class ContaConverter {
	
	public static ContaEntity fromContatoEntity(ContaBancaria conta) {
		if(conta != null) {
			ContaEntity entity = new ContaEntity();
			entity.setNumero(conta.getNumeroConta());
			entity.setAgencia(conta.getAgencia());
			entity.setTitular(conta.getTitular());
			entity.setSaldo(conta.getSaldo());
			return entity;
		}
		return null;
		
	}
	public static ContaBancaria fromEntityToConta(ContaEntity contaEntity) {
		if(contaEntity != null) {
			ContaBancaria conta = new ContaBancaria();
			conta.setNumeroConta(contaEntity.getNumero());
			conta.setAgencia(contaEntity.getAgencia());
			conta.setTitular(contaEntity.getTitular());
			conta.setSaldo(contaEntity.getSaldo());
			return conta;
		}
		return null;
	}

}
