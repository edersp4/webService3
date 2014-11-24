package br.com.fiap.entity;

import java.math.BigInteger;

public class Cliente {
	private BigInteger codigo;
	private String nome;
	private String endereco;
	private String telefone;
	private String situacao;
	public BigInteger getCodigo() {
		return codigo;
	}
	public void setCodigo(BigInteger codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	
}
