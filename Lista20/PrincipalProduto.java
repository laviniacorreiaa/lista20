package Lista20;

public class PrincipalProduto {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Teclado Mecânico", 250.00, 10);
        Produto produto2 = new Produto("Mouse Gamer", 120.00, 5);

        System.out.println("ESTOQUE INICIAL");
        produto1.mostrarInformacoes();
        produto2.mostrarInformacoes();

        System.out.println("REALIZANDO VENDAS");
        produto1.vender(3); 
        produto2.vender(8); 
        System.out.println();

        System.out.println("ESTOQUE ATUALIZADO");
        produto1.mostrarInformacoes();
        produto2.mostrarInformacoes();
    }

	}

