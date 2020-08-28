package trabalhoExtra5;

public class Calculo {
	
	public static double salario;
	public static String nome;
	
	public static double calcularBeneficio(double salario) {
		Calculo.salario = salario;
		if (salario >=1500 && salario < 1750)
			return salario + (salario*0.12);
		if (salario >= 1750 && salario < 2000) 
			return salario + (salario*0.10);
		if (salario >= 2000 && salario < 3000)
			return salario + (salario*0.07);
		if (salario >=3000) 
			return salario + (salario*0.05);
		else
			return salario + (salario*0.15);
	}
	
	public static String obterData(String nome) {
		
		
		Calculo.nome = nome;
		if(nome.charAt(0) == 'A' || nome.charAt(0) == 'B' || nome.charAt(0) == 'C' 
				|| nome.charAt(0) == 'D'|| nome.charAt(0) == 'E')
			nome = "5 de junho";
		else if(nome.charAt(0) == 'F' || nome.charAt(0) == 'G' || nome.charAt(0) == 'H'
				|| nome.charAt(0) == 'I' || nome.charAt(0) == 'J' )
			nome = "6 de junho";
		else if(nome.charAt(0) == 'K' || nome.charAt(0) == 'L' || nome.charAt(0) == 'M'
				|| nome.charAt(0) == 'N' || nome.charAt(0) == 'O')
			nome = "7 de junho";
		else if(nome.charAt(0) == 'P' || nome.charAt(0) == 'Q' || nome.charAt(0) == 'R'
				|| nome.charAt(0) == 'S' || nome.charAt(0) == 'T')
			nome = "8 de junho";
		else
			nome = "9 de junho";
		return nome;
	}
}
