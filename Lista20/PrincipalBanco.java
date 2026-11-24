package Lista20;

public class PrincipalBanco {

	public static void main(String[] args) {
		
		 Banco minhaConta = new Banco("Carlos Silva", 500.00);

	        minhaConta.mostrarSaldo();

	        minhaConta.depositar(250.00);
	        minhaConta.mostrarSaldo();

	        minhaConta.sacar(100.00);
	        minhaConta.mostrarSaldo();

	        minhaConta.sacar(800.00);
	        minhaConta.mostrarSaldo();
	    }

}
