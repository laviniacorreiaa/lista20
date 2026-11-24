package Lista20;

public class Produto {
	
	String nome;
    double preco;
    int estoque;
    public Produto(String nomeProduto, double precoProduto, int estoqueProduto) {
        nome = nomeProduto;
        preco = precoProduto;
        estoque = estoqueProduto;
    }

    public void vender(int quantidade) {
        if (quantidade <= estoque) {
            estoque = estoque - quantidade;
            System.out.println("Venda de " + quantidade + " unidade(s) de " + nome + " realizada com sucesso!");
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }

    public void mostrarInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque atual: " + estoque + " unidade(s)");
        System.out.println("-------------------------");
    }
}

