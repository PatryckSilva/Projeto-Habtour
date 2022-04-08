package br.com.generation.ProjetoJava;

import java.util.Scanner;

public class Pesquisaa {
	
	//verifica fumar
			private int fumoint;
			void verificafuma(int resposta1) {
				this.fumoint = resposta1;
				}
			//resposta para quem fuma
					void respostafumo() {
						if(fumoint == 1) {
							malfumo();
					}else if (fumoint == 2) {
						parabensfumo();
					}
					}
			
			//verifica  beber
			private int latas;
			private int mlsdes;
			private int taca;
			void verificabebe() {
				
					Scanner input = new Scanner(System.in);
					System.out.println("Você costuma beber bebidas alcoolicas? Digite '1' para sim e '2' para não: ");
					int bebe = input.nextInt();
							 if (bebe == 1) {

					//recebendo se a pessoa bebe ou nao
					System.out.println();//criando objeto para classe Alcool
					System.out.println("Quantas latas de cerveja por semana? ");
					int latas1 = input.nextInt();
					this.latas = latas1;
					System.out.println();
					
					System.out.println("Quantos MLs de destilado? ");
					int mlsdes1 = input.nextInt();
					this.mlsdes = mlsdes1;
					System.out.println();
					
					System.out.println("Quantas taças de vinho? ");
					int taca1 = input.nextInt();
					this.taca = taca1;
					System.out.println();
					
					
					}else {
						
					}
						input.close();
			
			}
			//resposta para quem bebe
					void respostabebe() {
						if(latas > 1) {
							latas = latas - 1;
							System.out.println("Voce esta bebendo "+ latas + " a mais de cerveja, o ideal é tanto...");
						}else if(latas < 1 && latas >0) {
							System.out.println("voce esta na media do ideal para beber cerveja, mas nao se deixe levar");
						}else {
						System.out.println("que bom que voce nao bebe cerveja, continue assim");
						}
						if(mlsdes > 30){
							mlsdes = mlsdes - 30;
							System.out.println("Voce esta bebendo " + mlsdes+ " a mais de destilado, o ideal é tanto...");
						}else if(mlsdes <30 && mlsdes > 0){
							System.out.println("voce esta na media do ideal para beber destilado, mas nao se deixe levar");
						}else {
							System.out.println("que bom que voce nao bebe destilado, continue assim");
						}
						if(taca > 1) {
							taca = taca-1;
							System.out.println("Voce esta bebendo "+ taca + " a mais de vinho,o ideal é tanto...");
						}else if(taca <1 && taca >0) {
							System.out.println("voce esta na media do ideal para beber vinho, mas nao se deixe levar");
						}else {
							System.out.println("que bom que voce nao bebe vinho, continue assim");
						}
					}
			
					private int horasr;
					private int redetrab;
			//verfica redes
					void verificaedes() {
						Scanner input = new Scanner(System.in);
						System.out.println("Quantas horas por dia voce fica nas redes sociais? ");
						this.horasr = input.nextInt();
						System.out.println("É por trabalho ou lazer?(1- lazer/ 2- trabalho)");
						this.redetrab = input.nextInt();
						input.close();
					}

			//resposta redes
			
					void respostaredes() {
						if(redetrab == 1) {
							if(horasr == 0 ) {
								System.out.println("Pelo visto voce n usa redes sociais, os riscos a sua sauda sao bem altos");
							}else if(horasr > 1 && horasr < 3) {
								System.out.println("Voce esta no tempo ideal de uso, vc nao sera tao prejudicado...");
							}else if(horasr > 3 && horasr <7) {
								System.out.println("Voce esta em estado de alerta, tome cuidado, pela quantidade de horas vc pode ser mt prejudicado");
							}else if(horasr>7) {
								int exchorasr = horasr -7;
								System.out.println("Tome muito cuidado, voce esta se prejudicando muito e deve seguir as recomendacoes do programa e vc esta " +exchorasr+ " hora acima do ideal");
							}
						}else if(redetrab ==2) {
							System.out.println("Sabendo que vc usa todo esse tempo por conta do trabalho sabemos que nao tem muito o q fazer, mas tente evitar ao maximo ficar todo esse tempo nas redes sociais e tente seguir nossas recomendacoes");
						}
					}
			
			//verifica jogos
			private int horasj;
			private int jogostrab;
				void verificarjogos() {
					Scanner input = new Scanner(System.in);
					System.out.println("Quantas horas por dia vc passa jogando jogos eletronicos: ");
					this.horasj = input.nextInt();
					System.out.println("É por trabalho ou lazer? 1- lazer/2-trabalho");
					this.jogostrab = input.nextInt();
					input.close();
				}
				
				//resposta jogos
				void respostajogos() {
					if(jogostrab == 1) {
						if(horasj == 0) {
							System.out.println("parece q vc nao joga, portanto nao tera nenhum risco a saude em relacao a isso");
						}else if(horasj >2 ) {
							int exchorasj = horasj-2;
							System.out.println("cuidado, o ideal é 2 horas por dia e vc esta: " + exchorasj);
						}else {
							System.out.println("parece que o tempo que vc joga esta na media ideal, continue assim");
						}
					}
				}
			
			
			
			
			

			
			//mal fumo
			void malfumo() {
				System.out.println("maleficios do cigarro");
			}
			void parabensfumo() {
				System.out.println("Parabenização");
			}

			//mal bebe
			
}
