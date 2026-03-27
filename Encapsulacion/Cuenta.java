package Encapsulacion;

public class Cuenta {
	private String titular;
	private double saldo;
	
	public Cuenta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
public void depositar(double monto){
	saldo = saldo + monto;
	}

public void retirar(double monto) {
	if (saldo >= monto) {
		saldo = saldo - monto;
	}else {
		System.out.println("Saldo insuficiente");
	}
}
@Override
public String toString() {
	return " Cuenta: titular=" + titular + ", saldo=" + saldo ;
}
}
