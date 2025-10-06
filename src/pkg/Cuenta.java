package pkg;

public class Cuenta {

	String numero;
	String titular;
	Double saldo;
	
	public Cuenta(double saldo) {
		this.saldo=saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void ingresar(Double i) {
		saldo=500.0;
	}
	
	public void retirar(Double i) {
		saldo=-500.0;	
	}
}
