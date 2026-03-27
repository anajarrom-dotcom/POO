package Encapsulacion;

public class Producto {

	private int codigo;
	private String nombre;
	private double precio;
	
	public Producto(int codigo, String nombre, double precio) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public void aplicarDescuento(double porcentaje) {
		
		precio = precio - (precio * porcentaje / 100);
	}

	@Override
	public String toString() {
		return "Producto codigo =" + " " + codigo + " " + " nombre =" + " " + nombre + " " + "precio =" + " " + precio ;
	}
	
}
