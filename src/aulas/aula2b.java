package aulas;

public class aula2b {


	public static void main(String[] args) {
	
        // Wrapper para int 
        int parametro1 =Integer.parseInt(args[0]);
        int parametro2 =Integer.parseInt(args[1]);

        System.out.println("Total de casos do coronga: " + (parametro1 + parametro2));
        
        if (parametro1 == parametro2)
            System.out.println("Sao iguais");
        else
            System.out.println("Sao diferentes");
            
        String x = new String("a");
        String y = new String("a");

        if (x == y)
            System.out.println("Sao strings iguais");
        else
            System.out.println("Sao strings diferentes");
            
        if (x.equals(y)) // testar igualdade de objetos
            System.out.println("Sao strings iguais");
        else
            System.out.println("Sao strings diferentes");
            
        // relacionais >, < , >=, ==
        // lógicos AND && ou &, OR || ou |
        // AND 
        // V V =V
        // V F =F
        // F F =F
        // F V =F
        
        if (x.equals(y) && parametro1 != parametro2) {
            System.out.println("tudo verdadeeeeeeee");
        }
        
    }
        
}


