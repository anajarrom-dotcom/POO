package Encapsulacion;

public class Calculadora {

	private double a;
	private double b;
	
	public Calculadora(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public double sumar() {
		return a + b;
	}
	public double restar() {
		return a - b;
	}
	public double multiplicar() {
		return a * b;
	}
	public double dividir() {
		if (b == 0) {
			System.out.println("No se puede dividir entre 0");
		}
		return a / b;
	}
	@Override
	public String toString() {
		return " a=" + a + " b=" + b + " suma =" + sumar() + " restar =" + restar()
				+ " multiplicar =" + multiplicar() + " dividir =" + dividir() ;
	}
	
}
