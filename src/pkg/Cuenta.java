package pkg;

public class Cuenta {

	String numero;
	String titular;
	Double saldo;
	
	public Cuenta(double saldo, String numero) {
		this.saldo=saldo;
		this.numero=numero;
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
		saldo=saldo+i;
		System.out.println("Saldo de " + saldo);
	}
	
	public void retirar(Double i) {
		if((saldo-i)>=(-500)) {
			saldo=saldo-i;
			System.out.println("Saldo de " + saldo);
		}				
		else
			System.out.println("Fondos insuficientes (saldo "+ saldo +"€) en la cuenta "+ numero+ " para el integro de "+ i );
	}
}
