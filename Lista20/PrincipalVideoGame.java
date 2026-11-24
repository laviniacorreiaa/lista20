package Lista20;

public class PrincipalVideoGame {

	public static void main(String[] args) {
		
		VideoGame meuConsole = new VideoGame("Sony", "PlayStation 5");

        meuConsole.verificarStatus();
        
        meuConsole.ligar();
        meuConsole.verificarStatus();
        
        meuConsole.desligar();
        meuConsole.verificarStatus();
	}

}
