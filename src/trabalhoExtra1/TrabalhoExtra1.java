package trabalhoExtra1;

public class TrabalhoExtra1 {

public static void main(String[] dias) {
	
	String[] diasEscritos = {"Domingo", "Segunda-feira", "Ter�a-feira", "Quarta-feira",
			"Quinta-feira", "Sexta-feira", "S�bado"};
	String maiorDia = null;
	int maior = 0;
	
	for (int i=0; i < dias.length; i++) {
		System.out.println("N�mero de casos de " + diasEscritos[i]+ ": " +dias[i]+ " casos");
		if(Integer.parseInt(dias[i]) > maior) {
			maior = Integer.parseInt(dias[i]);
			maiorDia = diasEscritos[i];
			}
		}
	
	System.out.println("\nO dia com mais casos foi "+maiorDia+", com o total de " +maior+ " casos.");
	
	if (Integer.parseInt(dias[0]) > Integer.parseInt(dias[6]))
		System.out.println("\nHouve DIMINUI��O no n�mero de casos! percentual de "+ 
	(Integer.parseInt(dias[0]) - Integer.parseInt(dias[6]))*100 / (Integer.parseInt(dias[0]))+"%");
	else
		System.out.println("\nHouve AUMENTO no n�mero de casos! Percentual de "+ 
	(Integer.parseInt(dias[6]) - Integer.parseInt(dias[0]))*100 / (Integer.parseInt(dias[0]))+"%");
	}
} 
