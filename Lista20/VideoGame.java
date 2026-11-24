package Lista20;

public class VideoGame {
	
	String marca;
    String modelo;
    boolean ligado;
    
    public VideoGame(String marcaConsole, String modeloConsole) {
        marca = marcaConsole;
        modelo = modeloConsole;
        ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println("O console está ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("O console foi desligado.");
    }

    public void verificarStatus() {
        if (ligado) {
            System.out.println("Status (" + marca + " " + modelo + "): O console está ligado.");
        } else {
            System.out.println("Status (" + marca + " " + modelo + "): O console está desligado.");
        }
        }}
