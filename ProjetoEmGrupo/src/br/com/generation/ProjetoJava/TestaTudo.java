package br.com.generation.ProjetoJava;

import java.util.Scanner;

public class TestaTudo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//fazendo Scanner para preencher os atributos da classe usuario
		System.out.println("Olá,digite seu nome: ");
		String nome = input.nextLine();
		System.out.println("agora digite sua idade: ");
		int idade = input.nextInt();
		
		//criando objeto com os parametros do método construtor Usuario()
		Usuario u1 = new Usuario(nome, idade);
		//fazendo a primeira verificacao de se é fumante ou nao 
		System.out.println("Vamos para a primeira pegunta: "+u1.getNome() + ", você fuma?(Digite 1 para sim, e digite 2 para não.) ");
		int fumoint = input.nextInt();
		
		//criando objeto para classe Fumante
		Pesquisa f1 = new Pesquisa();
		
		//Chamando metodo de verificacao se o usuario fuma
		f1.verificafuma(fumoint);
		
		//recebendo se a pessoa fuma ou nao
		System.out.println("Agora a segunda pergunta " + u1.getNome()+", voce bebe? (Digite 1 para sim, e digite 2 para não.)");
		int bebe = input.nextInt();
		
		// criando objeto para classe Alcool
			Pesquisa a1 = new Pesquisa();
			
		//chamando metodo de verificacao se bebe
		a1.verificabebe(bebe);
		
	input.close();
		
	}

}
