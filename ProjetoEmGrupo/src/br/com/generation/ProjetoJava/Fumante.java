package br.com.generation.ProjetoJava;

public class Fumante {

	int fumoint;
	String fumador;
	
	
	//metodos construtores recebendo os parametros
	Fumante(int f,String fuma){
		fumoint  = f;
		fumador = fuma;
		System.out.println(fumoint);
	}
	//metodos contendo os prints para os usuarios
	void mal() {
		System.out.println("maleficios do cigarro");
	}
	
	void parabens() {
		System.out.println("Parabenização");
	}
	
	
	
	
}
