package br.com.generation.ProjetoJava;

import java.util.Scanner;

public class TestaTudo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//fazendo Scanner para preencher os atributos da classe usuario
		System.out.println("Olá,digite seu nome: ");
		String n = input.nextLine();
		System.out.println("agora digite sua idade: ");
		int i = input.nextInt();
		
		//criando objeto com os parametros do método construtor Usuario()
		Usuario u1 = new Usuario(n, i);
		System.out.println(u1.idade);
		System.out.println(u1.nome);
		
		//fazendo a primeira verificacao de se é fumante ou nao
		
		System.out.println("Vamos para a primeira pegunta: "+u1.nome + ", você fuma?(Digite 1 para sim, e digite 2 para não.) ");
		int f = input.nextInt();
		String fuma ="É fumante";
		//criando objeto para classe Fumante
		Fumante f1 = new Fumante(f,fuma);
		
		if(f1.fumoint == 1) {
			f1.mal();
			//fazendo verificacao se o metodo construtor funciona e salvando se ou nao viciado
			 System.out.println(f1.fumador);
		}else if (f1.fumoint == 2) {
			f1.parabens();
		}else {
			System.out.println("Você digitou uma opção inválida");
		}
		
		//recebendo se a pessoa fuma ou nao
		System.out.println("Agora a segunda pergunta " + u1.nome+", voce bebe? (Digite 1 para sim, e digite 2 para não.)");
		int b = input.nextInt();
		// criando objeto para classe Alcool
		Alcool a1 = new Alcool(b);
		
		if(a1.bebe == 1) {
			System.out.println("que tipo de bebida você mais gosta?(digite 1- Destilado/Digite 2-Vinho/Digite 3- Cerveja). ");
			int tipobebida = input.nextInt();
			System.out.println(tipobebida);
		}
		
		
		
		
		
		
	
	
	
	
	
		
		
	}

}
