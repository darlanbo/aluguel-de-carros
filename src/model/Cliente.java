package model;

import java.util.List;

public class Cliente extends Pessoa {
	
	public enum TipoPessoa{PJ, PF}
	
	private TipoPessoa tipo;
	
	private List<Veiculo> veiculosAlugados;
	
	
	
	public Cliente(String nome, String cpf, String senha, String endereco) {
		super(nome, cpf, senha, endereco);
		
		this.tipo = tipo;
	}

	
	
	
	public TipoPessoa getTipo() {
		return tipo;
	}

	public List<Veiculo> getVeiculosAlugados() {
		return veiculosAlugados;
	}

	public void setTipo(TipoPessoa tipo) {
		this.tipo = tipo;
	}

	public void setVeiculosAlugados(List<Veiculo> veiculosAlugados) {
		this.veiculosAlugados = veiculosAlugados;
	}
	
	
	
	
}
