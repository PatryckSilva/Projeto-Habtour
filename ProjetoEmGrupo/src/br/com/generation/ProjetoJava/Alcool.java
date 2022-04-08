package br.com.generation.ProjetoJava;

import java.util.Scanner;

public class Alcool {

	int bebe;
	double horas;
	
	Alcool(int  b){
		bebe = b;
		
	}
	
	void verificabebe() {
		Scanner input = new Scanner (System.in);
		if(bebe == 1) {
			System.out.println("que tipo de bebida você mais gosta?(digite 1- Destilado/Digite 2-Vinho/Digite 3- Cerveja). ");
			int tipobebida = input.nextInt();
			if(tipobebida == 1) {
				System.out.println("voce bebe destilado");
			}
			else if(tipobebida == 2) {
				System.out.println("Voce bebe destilado");
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
