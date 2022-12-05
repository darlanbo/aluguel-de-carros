package model;

import util.Contador;

public abstract class Pessoa {
	
	protected Integer id;
	
	protected String nome;
	protected String cpf;
	protected String senha;
	protected String endereco;
	
	
	
	public Pessoa(String nome, String cpf, String senha, String endereco) {
		this.id = Contador.proximo();
		
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.endereco = endereco;
	}
	
	
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getSenha() {
		return senha;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
}
