package br.com.generation.ProjetoJava;

public class Usuario {

	//atributos
			private String nome;
			
			
			//metodo construtor para receber os dados do usuario
			Usuario(String nome){
				this.nome = nome;
			
			}
			
			//getter and setters

			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}


}
