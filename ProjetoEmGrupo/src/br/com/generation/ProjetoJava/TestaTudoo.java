package br.com.generation.ProjetoJava;

import java.util.Scanner;

public class TestaTudoo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("=============================================================");
		System.out.println("====                                                      ===");
		System.out.println("====                                                      ===");
		System.out.println("====         		SEJA BEM VINDE!!!                 	  ===");
		System.out.println("====         		   <Habtour/>                     	  ===");
		System.out.println("====                                                      ===");
		System.out.println("====                                                      ===");
		System.out.println("=============================================================");
		
		System.out.println();
		
		System.out.println("Digite o nome: ");
		String n = input.nextLine();
		System.out.println("Digite a idade: ");
		int i = input.nextInt();
		
		//criando objeto com os parametros do método construtor Usuario()
		Usuario u1 = new Usuario(n, i);
		
		//indo para a primeira pergunta
		System.out.println("Vamos para a primeira pegunta: ");
		
		//perguntando se fuma
		System.out.println(u1.getNome() + ", você fuma?(Digite 1 para sim, e digite 2 para não.) ");
		int fumoint = input.nextInt();
		
		//criando objeto para classe Fumante
		Pesquisaa f1 = new Pesquisaa();
		
			f1.verificafuma(fumoint);
			
		//indo para a segunda pergunta
			System.out.println("Vamos para a segunda pergunta...");
			
		//criando objeto para bebe
			Pesquisaa b1 = new Pesquisaa();
		//puxando metodo verificabebe()
			b1.verificabebe();
		
		//indo para a terceira pegunta
		System.out.println("Vamos para a terceira pergunta...");
			
		//criando objeto para rede social
		Pesquisaa r1 = new Pesquisaa();
		
		//puxando metodo verificarede()
		r1.verificaedes();
	
		
		
		//printando as respostas para o usuario
		
input.close();
}
		
	}


