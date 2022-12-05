package model;

import util.Contador;

public class Veiculo {

	public enum Segmento{ CARRO, MOTO, CAMINHAO}
	
	private Integer id;
	
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private String ano;
	private Segmento segmento;
	
	
	public Veiculo(Integer id, String marca, String modelo, String placa, String cor, String ano, Segmento segmento) {
		this.id = Contador.proximo();
		
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.ano = ano;
		this.segmento = segmento;
		
		
		
	}
	public Integer getId() {
		return id;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public String getCor() {
		return cor;
	}
	public String getAno() {
		return ano;
	}
	public Segmento getSegmento() {
		return segmento;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public void setSegmento(Segmento segmento) {
		this.segmento = segmento;
	}
	
	
	
}
