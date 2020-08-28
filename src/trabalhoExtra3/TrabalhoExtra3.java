package trabalhoExtra3;

public class TrabalhoExtra3 {

	public static void main(String[] args) {
		
		//1 - verificar palíndromo
		String palavra = args[0];
		String invertida = new StringBuffer(palavra).reverse().toString();
		
		if(palavra.equals(invertida))
			System.out.print("A primeira palavra é um palíndromo!");
		else {
			System.out.print("A primeira palavra não é palíndromo!");
		}
		
		//2 - Codigo César, por padrão 3 posições a frente
		String texto = args[1];
		System.out.println("\nSegunda palavra codificada: " + Cripto.criptografar(texto, 3));

        
	}

}







//Scanner sc = new Scanner(System.in);
//System.out.print("Digite uma palavra: ");
//palavra = sc.nextLine().trim();
//sc.close();


