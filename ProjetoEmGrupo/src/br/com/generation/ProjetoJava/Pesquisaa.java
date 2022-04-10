package br.com.generation.ProjetoJava;

public class Pesquisaa {
	
	//verifica fumar
			private int fumoint;
			private double gastofumo;
			void verificafuma(int _fumoint, double _gastofumo) {
				this.fumoint = _fumoint;
				this.gastofumo = _gastofumo;
				}
			//resposta para quem fuma
					void respostafumo() {
						if(fumoint == 1) {
							malfumo();
					}else if (fumoint == 2) {
						parabensfumo();
					}else {
						System.out.println("Voce digitou uma opcao inválida por isso nao fizemos a verificacao(fumo)");
					}
					}
			
			//verifica  beber
			private int latas;
			private int mlsdes;
			private int taca;
			void verificabebe(int _latas, int _mlsdes,int _taca) {	
					//recebendo se a pessoa bebe ou nao
					this.latas = _latas;
					this.mlsdes = _mlsdes;
					this.taca = _taca;		
			}
			//resposta para quem bebe
					void respostabebe() {
						
						if(latas > 1) {
							latas = latas - 1;
							System.out.println("Voce esta bebendo "+ latas + " latas a mais de cerveja, o ideal é tanto...");
						}else if(latas <= 1 && latas >0) {
							System.out.println("voce esta na media do ideal para beber cerveja, mas nao se deixe levar");
						}
						if(mlsdes > 30){
							mlsdes = mlsdes - 30;
							System.out.println("Voce esta bebendo " + mlsdes+ " MLs a mais de destilado, o ideal é tanto...");
						}else if(mlsdes <=30 && mlsdes > 0){
							System.out.println("voce esta na media do ideal para beber destilado, mas nao se deixe levar");
						}
						if(taca > 1) {
							taca = taca-1;
							System.out.println("Voce esta bebendo "+ taca + " Taças a mais de vinho,o ideal é tanto...");
						}else if(taca <=1 && taca >0) {
							System.out.println("voce esta na media do ideal para beber vinho, mas nao se deixe levar");
						}
					}
			
					private int horasr;
					private int redetrab;
			//verfica redes
					void verificaedes(int _horasr,int _redetrab) {
						this.horasr = _horasr;
						this.redetrab = _redetrab;
					}
			//resposta redes
					void respostaredes() {
						if(redetrab == 1) {
							if(horasr == 0 ) {
								System.out.println("Feedback Sobre as redes sociais");
								System.out.println("Pelo visto voce n usa redes sociais, os riscos a sua saude portanto nao ha riscos a sua saude em relacao a isso (Redes sociais)");
							}else if(horasr > 1 && horasr < 3) {
								System.out.println("Feedback Sobre as redes sociais");
								System.out.println("Voce esta no tempo ideal de uso, vc nao sera tao prejudicado...");
							}else if(horasr > 3 && horasr <7) {
								System.out.println("Feedback Sobre as redes sociais");
								System.out.println("Voce esta em estado de alerta, tome cuidado, pela quantidade de horas vc pode ser mt prejudicado(redes sociais");
							}else if(horasr>7) {
								int exchorasr = horasr -7;
								System.out.println("Feedback Sobre as redes sociais");
								System.out.println("Tome muito cuidado, voce esta se prejudicando muito e deve seguir as recomendacoes do programa e vc esta " +exchorasr+ " hora acima do ideal (Redes sociais)");
							}
						}else if(redetrab ==2) {
							if(horasr > 3 && horasr <7) {
								System.out.println("Sabemos que voce esta trabalhando, mas vc esta estado de alerta, tome cuidado, pela quantidade de horas vc pode ser mt prejudicado(redes sociais");
							}else if(horasr>7) {
								int exchorasr = horasr -7;
								System.out.println("Feedback Sobre as redes sociais");
								System.out.println("Tome muito cuidado,sabemos que é por causa do trabalho mas voce esta se prejudicando muito e deve seguir as recomendacoes do programa e vc esta " +exchorasr+ " hora acima do ideal (Redes sociais)");
							}
						}else {
							System.out.println("parece q vc digitou uma opcao inválida, portanto nao fizemos a verificacao(redes)");
						}
					}
			
			//verifica jogos
			private int horasj;
			private int jogostrab;
				void verificarjogos(int _horasj, int _jogostrab) {
					this.horasj=_horasj;
					this.jogostrab=_jogostrab;
				}
				
				//resposta jogos
				void respostajogos() {
					if(jogostrab == 1) {
						if(horasj == 0) {
							System.out.println("Feedback Sobre jogos");
							System.out.println("parece q vc nao joga, portanto nao tera nenhum risco a saude em relacao a isso");
						}else if(horasj >2 ) {
							int exchorasj = horasj-2;
							System.out.println("Feedback Sobre jogos");
							System.out.println("cuidado, o ideal é 2 horas por dia e vc esta: " + exchorasj+ " a mais");
						}else {
							System.out.println("Feedback Sobre jogos");
							System.out.println("parece que o tempo que vc joga esta na media ideal, continue assim");
						}
					}else if(jogostrab ==2) {
						if(horasj == 0) {
							System.out.println("Feedback Sobre jogos");
							System.out.println("parece q vc nao joga, portanto nao tera nenhum risco a saude em relacao a isso");
						}else if(horasj >2 ) {
							int exchorasj = horasj-2;
							System.out.println("Feedback Sobre jogos");
							System.out.println("Sabemos que voce trabalha com isso, mas cuidado, o ideal é 2 horas por dia e vc esta: " + exchorasj+ " a mais");
						}else {
							System.out.println("Feedback Sobre jogos");
							System.out.println("parece que o tempo que vc joga esta na media ideal mesmo trabalhando com isso, continue assim");
						}
					}else {
						System.out.println("Parece que voce digitou uma opcao inválida, portanto fizemos a verificacao(jogos)");
					}
				}
			
			//mal fumo
			void malfumo() {
				System.out.println("Feedback sobre Cigarro");
				System.out.println("É bom repensar aquele cigarro diário se você quer melhorar o seu sistema imunológico. Segundo o INCA, o tabagismo surge como um dos inimigos das defesas do corpo e propicia aos fumantes uma chance bem maior de adoecer quando comparados aos não-fumantes. Não importa sua idade, parar de fumar sempre vale a pena. Parar aumenta a expectativa e a qualidade de vida.\r\n"
						+ "Os benefícios podem ser percebidos em qualquer faixa etária, mas quanto mais cedo o fumante parar, mais saúde ele terá, como reforça o Ministério da Saúde.");
				this.gastofumo = this.gastofumo *365;
				System.out.println("Essa é a quantia por ano gasta em cigarros: " + this.gastofumo);
			}
			void parabensfumo() {
				System.out.println("Feedback sobre cigarro");
				System.out.println("Continue assim, você evitará inúmeros riscos a sua saúde e é importante lembrar que o tabaco causa não apenas câncer, mas uma série de outras doenças crônicas que também podem levar à morte, como doenças cardiovasculares, respiratórias, enfisemas, bronquite crônica.");
			}

			//mal bebe
			
}
