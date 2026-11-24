package Lista20;

public class Banco {
	
	String titularConta;
    double saldoInicial;
  
    public Banco(String titular, double saldo) {
        titular = titularConta;
        saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldoInicial = saldoInicial + valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
    }

    public void sacar(double valor) {
        if (valor <= saldoInicial) {
            saldoInicial = saldoInicial - valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para saque!");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Titular: " + titularConta);
        System.out.println("Saldo atual: R$ " + saldoInicial);
        System.out.println("-------------------------");
    }

}
