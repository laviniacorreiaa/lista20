package Lista20;

public class PrincipalFilme {

	public static void main(String[] args) {


		Filme filme1 = new Filme("Interestelar", "Ficção Científica", 169);
        Filme filme2 = new Filme("O Poderoso Chefão", "Drama", 175);
        Filme filme3 = new Filme("Toy Story", "Animação", 81);

        filme1.mostrarInformacoes();
        filme1.assistir();
        System.out.println();

        filme2.mostrarInformacoes();
        filme2.assistir();
        System.out.println();

        filme3.mostrarInformacoes();
        filme3.assistir();
    }

	}
