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
		System.out.println("1 - População: " +pop);
		System.out.println("2 - Casos: " +casos);
		System.out.println("3 - Óbitos: " +obitos);
		System.out.printf("4 - A taxa de mortalidade neste país é de %.2f%S ! ",
				this.obterTaxaMortalidade(casos, obitos), "%");
		System.out.printf("\n5 - O percentual de contaminação é de %.2f%S",
				contam, "%\n\n");
	}

}
/* Comment professor:
 Ótimo trabalho.

Em vez de:
public double obterTaxaMortalidade(double casos, double obitos) {
return taxaMort = (obitos*100) / casos;
}

Era melhor:
public double obterTaxaMortalidade(double casos, double obitos) {
return (obitos*100) / casos;
}

Não era necessário criar, por exemplo, a atributo taxaMort.
É apenas uma orientação. Teu código não está incorreto.

Parabéns pelo empenho e por mais um trabalho concluído. Keep pushing!*/