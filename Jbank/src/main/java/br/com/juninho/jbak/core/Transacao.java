package br.com.juninho.jbak.core;

public class Transacao {
	
	private String uuid;
	private String natureza;
	private ContaBancaria contaOrigem;
	private ContaBancaria contaDestino;
	private Double valor;
	public Transacao(String uuid, String natureza, ContaBancaria contaOrigem, ContaBancaria contaDestino,
			Double valor) {
		super();
		this.uuid = uuid;
		this.natureza = natureza;
		this.contaOrigem = contaOrigem;
		this.contaDestino = contaDestino;
		this.valor = valor;
	}
	public String getNatureza() {
		return natureza;
	}
	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}
	public Transacao() {
		super();
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	public ContaBancaria getContaOrigem() {
		return contaOrigem;
	}
	public void setContaOrigem(ContaBancaria contaOrigem) {
		this.contaOrigem = contaOrigem;
	}
	public ContaBancaria getContaDestino() {
		return contaDestino;
	}
	public void setContaDestino(ContaBancaria contaDestino) {
		this.contaDestino = contaDestino;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "Transacao [uuid=" + uuid + ", natureza=" + natureza + ", contaOrigem=" + contaOrigem + ", contaDestino="
				+ contaDestino + ", valor=" + valor + "]";
	}
	

}
