package br.com.generation.ProjetoJava;

import java.util.Scanner;

public class TestaTudoo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		boasvindas();
		
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
		double gastofumo = 0.0;
		if(fumoint == 1) {
			System.out.println(u1.getNome() + ", quanto por dia vc gasta com cigarros?");
			gastofumo = input.nextDouble();
		}
		//criando objeto para classe Fumante
		Pesquisaa f1 = new Pesquisaa();
			f1.verificafuma(fumoint,gastofumo);
		//indo para a segunda pergunta
			System.out.println("Vamos para a segunda pergunta...");
		//perguntando se bebe
			System.out.println("Você costuma beber bebidas alcoolicas? Digite '1' para sim e '2' para não: ");
			int bebe = input.nextInt();
			String naobebe = "";
			//criando objeto para bebe
			Pesquisaa b1 = new Pesquisaa();
			 if (bebe == 1) {
				 System.out.println("Quantas latas de cerveja por semana? ");
				 int latas = input.nextInt();
					System.out.println("Quantos MLs de destilado? ");
					int mlsdes = input.nextInt();
					System.out.println("Quantas taças de vinho? ");
					int taca = input.nextInt();
					//puxando metodo verificabebe()
					b1.verificabebe(latas, mlsdes, taca);
			 }else if(bebe == 2) {
				 
				 naobebe = "parabens, voce nao bebe";
			 }
		//indo para a terceira pegunta
		System.out.println("Vamos para a terceira pergunta...");
		System.out.println("Quantas horas por dia voce fica nas redes sociais? ");
		int horasr = input.nextInt();
		System.out.println("É por trabalho ou lazer? 1- lazer/2-trabalho");
		int redetrab = input.nextInt();
		//criando objeto para rede social
		Pesquisaa r1 = new Pesquisaa();
		//puxando metodo verificarede()
		r1.verificaedes(horasr,redetrab);
		//indo para a quarta pergunta
		System.out.println("Vamos para a quarta pergunta...");
		System.out.println("Quantas horas por dia vc passa jogando jogos eletronicos: ");
		int horasj = input.nextInt();
		System.out.println("É por trabalho ou lazer? 1- lazer/2-trabalho");
		int jogostrab = input.nextInt();
		//criando objeto para jogos
		Pesquisaa j1 = new Pesquisaa();
		//puxando metodo verificajogos()
		j1.verificarjogos(horasj, jogostrab);
		//printando as respostas para o usuario
		f1.respostafumo();
		System.out.println();
		if(bebe ==1) {
			System.out.println("Feedaback sobre beber");
			b1.respostabebe();
		}else if(bebe==2) {
			System.out.println("Feedaback sobre beber");
			System.out.println(naobebe);
		}else {
			System.out.println("Voce digitou uma opcao invalida por isso nao fizemos nenhuma verificacao(beber)");
		}
		System.out.println();
		r1.respostaredes();
		System.out.println();
		j1.respostajogos();
		
input.close();
}
	
	static void boasvindas() {
		System.out.println("=============================================================");
		System.out.println("====                                                      ===");
		System.out.println("====                                                      ===");
		System.out.println("====         		SEJA BEM VINDE!!!             	  ===");
		System.out.println("====         		   <Habtour/>                  	  ===");
		System.out.println("====                                                      ===");
		System.out.println("====                                                      ===");
		System.out.println("=============================================================");
		
		System.out.println();
	}
		
	}





