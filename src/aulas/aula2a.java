package aulas;

public class aula2a {

public static void main(String[] args) {
        
        String nomeCliente = "Marcelo Pacote";
        
        // Declare a String array and initialize it with four elements.
        // Each element represents a different item description ("Shirt", for instance).
        String[] produtos = {"bermuda", "camiseta", "capa", "mascara"};
        
        String mensagem;
        
        // Declare and initialize numeric fields: price (double) tax (double), and quantity (int).
        //Also declare a double called total, but do not initialize it.
        double preco = 100.0;
        double imposto = 1.10;
        //int quantidade = 3; //substituido por produtos.length
        double total;
        
        // Declare a boolean, outOfStock.
        boolean existeEstoque = true;
        
        if (existeEstoque) {
            //Change message to show how many items the customer wants to purchase.
            // – Hint: Use the .length property of your array.
            mensagem = nomeCliente + " deseja comprar " + produtos.length + " produto";

            // Use an if statement to test the quantity of the item:
            // if it is > 1, concatenate an 's' to message so that it indicates multiple items.
            if (produtos.length > 1) {
                mensagem = mensagem + "s.";
            }
            System.out.println(mensagem);

            //2. Create a for loop that iterates through the array of item descriptions, displaying each element.
            //3. Precede the list of elements with the message: "Items purchased:".            
            System.out.println("Item comprados: ");
            for (String produto : produtos) {
                System.out.println (produto);
            }

            // 4. Calculate total by multiplying price * quantity * tax.
            // 5. Print a message showing the total cost (example: "Total cost with tax is: 25.78.").
            total = preco * produtos.length * imposto;
            System.out.println("Custo total com impostos eh: " + total);
        } else {
            System.out.println("Item indisponivel");
        }
        
    }
}