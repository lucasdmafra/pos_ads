package trabalhoExtra3;

public class Cripto {
	
	public static String criptografar(String arg1, int chave) {
	    String palavraCodificada = "";
	 
	    for (int i = 0; i < arg1.length(); i++)
	    	palavraCodificada += criptografar(arg1.charAt(i), chave);
	    return palavraCodificada;
	}
	 
	public static char criptografar(char charOriginal, int chave) {
	    char charCodificado;
	 
	    if (charOriginal >= 97 && charOriginal <= 122)
	        charCodificado = (char) ((charOriginal - 97 + chave) % 26 + 97);
	    
	    else if (charOriginal >= 65 && charOriginal <= 90)
	    	charCodificado = (char) ((charOriginal - 65 + chave) % 26 + 65);
	    
	    else
	    	charCodificado = charOriginal;
	 
	    return charCodificado;
	}
}
