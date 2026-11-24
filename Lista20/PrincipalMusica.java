package Lista20;

public class PrincipalMusica {

	public static void main(String[] args) {
		
		 Musica musica1 = new Musica("Tempo Perdido", "Legião Urbana", 5.03);
	        Musica musica2 = new Musica("Bohemian Rhapsody", "Queen", 5.55);
	        Musica musica3 = new Musica("Evidências", "Chitãozinho & Xororó", 4.39);
	        
	        musica1.mostrarDetalhes();
	        musica1.tocar();
	        musica1.pausar();
	        System.out.println();

	        musica2.mostrarDetalhes();
	        musica2.tocar();
	        musica2.pausar();
	        System.out.println();

	        musica3.mostrarDetalhes();
	        musica3.tocar();
	        musica3.pausar();

	}

}
