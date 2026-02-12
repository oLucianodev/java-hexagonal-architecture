package br.comjuninho.webjbak.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="tbl_conta_bancaria")
public class ContaEntity {
	@Id
	@Column(name="numero_conta")
	private Integer numero;
	@Column(name="agenica")
	private Integer agencia;
	@Column(name="nome_titular")
	private String titular;
	@Column(name="saldo")
	private Double saldo;
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
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
	

}
