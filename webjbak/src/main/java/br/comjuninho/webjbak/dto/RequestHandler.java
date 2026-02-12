package br.comjuninho.webjbak.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.com.juninho.jbak.core.ContaBancaria;
import br.com.juninho.jbak.core.Transacao;
import br.com.juninho.jbak.service.ItransacaoService;
import br.com.juninho.jbak.service.TransacaoServiceImpl;
import br.comjuninho.webjbak.entity.ContaEntity;
import br.comjuninho.webjbak.entity.TransacaoEntity;
import br.comjuninho.webjbak.inputoutputport.ContaConverter;
import br.comjuninho.webjbak.inputoutputport.TransacaoConverter;
import br.comjuninho.webjbak.repo.ContaEntityRepo;
import br.comjuninho.webjbak.repo.TransacaoEntityRepo;
@Service
public class RequestHandler {
	
	
	@Autowired
	private ContaEntityRepo contaRepo;
	
	@Autowired
	private TransacaoEntityRepo transRepo;
	
	
	
	public Transacao efetuarTransferencia(TransferenciaDTO dados) throws RuntimeException {
		
		ContaEntity ctOrigem = contaRepo.findById(dados.contaOrigem()).orElse(null);
		ContaEntity ctDestino = contaRepo.findById(dados.contaDestino()).orElse(null);
		
		ContaBancaria origem = ContaConverter.fromEntityToConta(ctOrigem);
		ContaBancaria destino = ContaConverter.fromEntityToConta(ctDestino);
		// usando regras de negocio
		
		ItransacaoService service = new TransacaoServiceImpl();
		Transacao transacao = service.efetivarTransferencia(origem, destino, dados.valor());
		
		ctOrigem = ContaConverter.fromContatoEntity(transacao.getContaOrigem());
		ctDestino = ContaConverter.fromContatoEntity(transacao.getContaDestino());
		TransacaoEntity trEntity = TransacaoConverter.fromTransacaoToEntity(transacao);
		
		contaRepo.save(ctOrigem);
		contaRepo.save(ctDestino);
		transRepo.save(trEntity);
		
		return transacao;
		
		}

}
