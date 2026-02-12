package br.comjuninho.webjbak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.juninho.jbak.core.Transacao;
import br.comjuninho.webjbak.dto.RequestHandler;
import br.comjuninho.webjbak.dto.TransferenciaDTO;

@RestController
public class TransacaoController {
	@Autowired
	private RequestHandler handler;
	
	@PostMapping("/transferencia")
	public ResponseEntity<String> efetuarTransferencia(@RequestBody TransferenciaDTO dados){
		try {
			Transacao t = handler.efetuarTransferencia(dados);
			return ResponseEntity.ok(t.toString());
			
		}catch(Exception ex) {
			return ResponseEntity.badRequest().body(ex.getMessage());
			
		}
		
		
		
		
	}

}
