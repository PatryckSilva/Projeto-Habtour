package br.com.generation.ProjetoJava;

public class Fumante {

	private int fumoint;
	private String fumador;
	//metodos construtores recebendo os parametros
	Fumante(int fumoint,String fumador){
		this.fumoint  = fumoint;
		this.fumador = fumador;
		System.out.println(this.fumoint);
	}
	//metodos contendo os prints para os usuarios
	
	void verificafuma() {
		if(fumoint == 1) {
				mal();
		}else if (fumoint == 2) {
			parabens();
		}else {
			System.out.println("Você digitou uma opção inválida");
			}
	}
	void mal() {
		System.out.println("maleficios do cigarro");
	}
	void parabens() {
		System.out.println("Parabenização");
	}
	//getter and setters
	public int getFumoint() {
		return fumoint;
	}

	public void setFumoint(int fumoint) {
		this.fumoint = fumoint;
	}

	public String getFumador() {
		return fumador;
	}

	public void setFumador(String fumador) {
		this.fumador = fumador;
	}
	
	
	
	
}
