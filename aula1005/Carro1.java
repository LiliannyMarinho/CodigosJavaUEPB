package aula1005;

public class Carro1 {
	String marca;
	String modelo;
	int ano;
	String combust;
	public Carro1(){
	
	}
	public Carro1(String marca,String modelo,int ano,String combust){
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.combust = combust;
	}
	//métodos
	public String ligar() {
		return "0";
	}
	public String desligar() {
		return "1";
	}
	public String acelerar() {
		return "0";
	}
	public String frear() {
		return "1";
	}
	//atributos
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCombust() {
		return combust;
	}
	public void setCombust(String combust) {
		this.combust = combust;
	}
}
