package br.com.generation.ProjetoJava;

import java.util.Scanner;

public class Pesquisa {
	
//pesquisa sobre fumar
	private int fumoint;
	//metodos contendo os prints para os usuarios
	
	void verificafuma(int resposta1) {
		this.fumoint = resposta1;
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
	
	
	//pesquisa sobre beber
	
	private int bebe;
	void verificabebe(int resposta2) {
		this.bebe = resposta2;
		Scanner input = new Scanner (System.in);
		if(bebe == 1) {
			System.out.println("que tipo de bebida você mais gosta?(digite 1- Destilado/Digite 2-Vinho/Digite 3- Cerveja). ");
			int tipobebida = input.nextInt();
			if(tipobebida == 1) {
				System.out.println("voce bebe destilado");
			}
			else if(tipobebida == 2) {
				System.out.println("Voce bebe vinho");
				}
			else if(tipobebida == 3) {
				System.out.println("Voce bebe cerveja");
			}
		}else if(bebe == 2) {
			System.out.println("Parabenizacao");
		}
		input.close();
	}

}
