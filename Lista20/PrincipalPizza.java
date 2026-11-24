package Lista20;

public class PrincipalPizza {

	public static void main(String[] args) {
	
		        Pizza pizza1 = new Pizza ();
		        pizza1.sabor = "Frango com Catupiry";
		        pizza1.tamanho = "Tamanho Família";
		        pizza1.bordaRecheada = true;
		        pizza1.preparar();
		        pizza1.assando();
		        pizza1.mostrarInformacoes();

		        Pizza pizza2 = new Pizza ();
		        pizza2.sabor = "Calabresa";
		        pizza2.tamanho = "Média";
		        pizza2.bordaRecheada = false;
		        pizza2.preparar();
		        pizza2.assando();
		        pizza2.mostrarInformacoes();
		   
	


	}

}
