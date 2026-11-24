package Lista20;

public class Pizza {
	
	    String sabor;
	    String tamanho;
	    boolean bordaRecheada;

	    public void preparar() {
	        System.out.println("Preparando pizza de " + sabor);
	    }

	    public void assando() {
	        System.out.println("Assando pizza tamanho " + tamanho);
	    }

	    public void mostrarInformacoes() {
	        String borda = bordaRecheada ? "Sim" : "Não";
	        System.out.println("Informações da Pizza");
	        System.out.println("Sabor: " + sabor);
	        System.out.println("Tamanho: " + tamanho);
	        System.out.println("Borda recheada: " + borda);
	        System.out.println();
	    }
	}



