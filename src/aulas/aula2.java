package aulas;

public class aula2 {
    
    public static void main(String[] args) {
        
        String nomeCliente = "Marcelo Pacote";
        String[] produtos = {"bermuda", "camisa", "mascara", "capa"};
        String produto = "bermuda";
        String mensagem;
        
        double preco = 100.0;
        double imposto = 1.10;
        int quantidade = 3;
        double total;
        
        boolean existeEstoque = true;
        
        if (existeEstoque) { //ja eh true! nao precisa if () == true;
            mensagem = nomeCliente + " quer comprar " + produtos.length + " " + produto+"!!!";//produtos.length
            
            System.out.println(mensagem);
            
            total = preco * quantidade * imposto;
            
            System.out.println("O custo total eh de R$ "+ total + "!");
        }
        else{
            System.out.println("item indisponivel");
        }
        
        System.out.println(produtos[0]); //bermuda
    }
}
