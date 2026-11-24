package Lista20;

public class Filme {
	
	String titulo;
    String genero;
    int duracao; 

    public Filme(String tituloFilme, String generoFilme, int duracaoFilme) {
        titulo = tituloFilme;
        genero = generoFilme;
        duracao = duracaoFilme;
    }

    public void assistir() {
        System.out.println("Assistindo " + titulo + "...");
    }

    public void mostrarInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Gênero: " + genero);
        System.out.println("Duração: " + duracao + " minutos");
        System.out.println("-------------------------");
    }

}
