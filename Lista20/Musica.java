package Lista20;

public class Musica {
	
	 String titulo;
	    String artista;
	    double duracao;
	    
	    public Musica(String tituloMusica, String artistaMusica, double duracaoMusica) {
	        titulo = tituloMusica;
	        artista = artistaMusica;
	        duracao = duracaoMusica;
	    }
	    
	    public void tocar() {
	        System.out.println("Tocando " + titulo + " de " + artista + "...");
	    }

	    public void pausar() {
	        System.out.println("Música pausada");
	    }

	    public void mostrarDetalhes() {
	        System.out.println("Título: " + titulo);
	        System.out.println("Artista: " + artista);
	        System.out.println("Duração: " + duracao + " minutos");
	        System.out.println("-------------------------");
	    }
	}


