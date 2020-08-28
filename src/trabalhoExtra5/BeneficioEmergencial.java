package trabalhoExtra5;

public class BeneficioEmergencial {

	public static void main(String[] args) {
		
		double salario = Double.parseDouble(args[0]);
	    String nome = args[1];
	    
	    System.out.printf("Salario atual: R$ %.02f\n",salario);
	    System.out.println("Nome: "+nome+"\n");
	    
	    System.out.printf("Valor a ser pago pelo governo: R$ %.02f ",Calculo.calcularBeneficio(salario));
	    System.out.printf("\nData do pagamento: %s",Calculo.obterData(nome));
	    }
}
