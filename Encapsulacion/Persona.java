package Encapsulacion;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	 
	public void Mostrar() {
		System.out.println("Informacion:" + " Nombre:" + nombre + " Apellido:"  + apellido + " Edad:"  + edad);
	}

}