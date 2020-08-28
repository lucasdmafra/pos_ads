package trabalhoExtra2;

public class TrabalhoExtra2 {

	public static void main(String[] args) {
		
		Pais Brasil = new Pais(212_385_054, 17983, 147_108); //pop,obitos,casos
		System.out.println("----------Estatísticas do Brasil: ");
		Brasil.mostrarEstatisticas();
		
		Pais Italia = new Pais(60_471_682, 32169, 65129); //pop,obitos,casos
		System.out.println("----------Estatísticas da Itália: ");
		Italia.mostrarEstatisticas();
		
		Pais Canada = new Pais(37_703_672, 5912, 33150); //pop,obitos,casos
		System.out.println("----------Estatísticas do Canadá: ");
		Canada.mostrarEstatisticas();
	}
}
