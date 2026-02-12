package br.com.juninho.jbak.core;

public class ContaBancaria {
	
	private Integer numeroConta;
	private Integer agencia;
	private String titular;
	private Double saldo;
	public ContaBancaria(Integer numeroConta, Integer agencia, String titular, Double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = saldo;
	}
	public ContaBancaria() {
		super();
	}
	public Integer getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "ContaBancaria [numeroConta=" + numeroConta + ", agencia=" + agencia + ", titular=" + titular
				+ ", saldo=" + saldo + "]";
	}

}
