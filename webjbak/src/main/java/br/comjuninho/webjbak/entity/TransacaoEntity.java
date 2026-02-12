package br.comjuninho.webjbak.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_transacao")
public class TransacaoEntity {
	@Id
	@Column(name="numero_documento")
	private String numeroDocumneto;
	
	@Column(name="natureza_operacao", length = 10)
	private String Natureza;
	
	@Column(name="valor")
	private Double valor;
	
	@ManyToOne
	@JoinColumn(name="numero_conta_origem")
	private ContaEntity contaOrigem;
	
	@ManyToOne
	@JoinColumn(name="numero_conta_destino")
	private ContaEntity contaDestino;
	
	
	public String getNumeroDocumneto() {
		return numeroDocumneto;
	}
	public void setNumeroDocumneto(String numeroDocumneto) {
		this.numeroDocumneto = numeroDocumneto;
	}
	public String getNatureza() {
		return Natureza;
	}
	public void setNatureza(String natureza) {
		Natureza = natureza;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public ContaEntity getContaOrigem() {
		return contaOrigem;
	}
	public void setContaOrigem(ContaEntity contaOrigem) {
		this.contaOrigem = contaOrigem;
	}
	public ContaEntity getContaDestino() {
		return contaDestino;
	}
	public void setContaDestino(ContaEntity contaDestino) {
		this.contaDestino = contaDestino;
	}
	

}
