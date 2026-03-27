package Encapsulacion;

public class Fecha {
	
	private int dia;
	private int mes;
	private int año;
	
	
	public Fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	@Override
	public String toString() {
		return " dia =" + dia + ", mes=" + mes + ", año=" + año + ", esValida =" + esValida() ;
	}
	public boolean esValida() {
		return dia >= 1 && dia <= 31 && mes >= 1 && mes <= 31;
	}

}
