package Lista20;

public class PrincipalGato {

	public static void main(String[] args) {
		Gato g1 = new Gato ();
		g1.nome = "Théo";
		g1.idade = 2;
		g1.raca = "Laranjinha";
		g1.comer();
		g1.miar();
		g1.mostrarInformacoes();
		
		Gato g2 = new Gato ();
		g2.nome = "Liona";
		g2.idade = 1;
		g2.raca = "Marrom";
		g2.comer();
		g2.miar();
		g2.mostrarInformacoes();

	}

}
