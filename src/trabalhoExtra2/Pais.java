package trabalhoExtra2;

public class Pais {
	public int pop; 	 //populacao
	public int obitos;	 //numeroObitosCovid
	public int casos;    //numeroTotalCasosCovid
	
	//public double taxaMort;
	public double contam;

	public Pais(int pop, int obitos, int casos){
		this.pop = pop;
		this.obitos= obitos;
		this.casos = casos;
		obterTaxaMortalidade(casos, obitos);
		calcularPercentualContaminacao(pop, casos);
	}
	
	public double obterTaxaMortalidade(double casos, double obitos) {
		return (obitos*100) / casos;
	}
	
	public double calcularPercentualContaminacao(double pop, double casos) {
		return contam = (casos*100) / pop;
	}
	
	public void mostrarEstatisticas() {
		System.out.println("1 - Popula��o: " +pop);
		System.out.println("2 - Casos: " +casos);
		System.out.println("3 - �bitos: " +obitos);
		System.out.printf("4 - A taxa de mortalidade neste pa�s � de %.2f%S ! ",
				this.obterTaxaMortalidade(casos, obitos), "%");
		System.out.printf("\n5 - O percentual de contamina��o � de %.2f%S",
				contam, "%\n\n");
	}

}
/* Comment professor:
 �timo trabalho.

Em vez de:
public double obterTaxaMortalidade(double casos, double obitos) {
return taxaMort = (obitos*100) / casos;
}

Era melhor:
public double obterTaxaMortalidade(double casos, double obitos) {
return (obitos*100) / casos;
}

N�o era necess�rio criar, por exemplo, a atributo taxaMort.
� apenas uma orienta��o. Teu c�digo n�o est� incorreto.

Parab�ns pelo empenho e por mais um trabalho conclu�do. Keep pushing!*/