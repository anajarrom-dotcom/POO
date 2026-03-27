package Encapsulacion;

import Encapsulacion.Persona;

public class Main {

	public static void main(String[] args) {
		
		Persona prs1 = new Persona("Antony","Najarro",20);
		Persona prs2 = new Persona("David","Lopez",23);
		Persona prs3 = new Persona("Fernanda","Aguilar",60);
			System.out.println("-----------Personas-----------");
		prs1.Mostrar();
		prs2.Mostrar();
		prs3.Mostrar();
	
	Rectangulo rect1 = new Rectangulo(5,3);
	Rectangulo rect2 = new Rectangulo(6,2);
	System.out.println("-----Rectangulo con el area mas grande-----");
	
	
	if (rect1.area() > rect2.area()) {
		System.out.println("El rectangulo uno" + " " + rect1.area()); }
		else {
			System.out.println("El rectangulo dos" +  " " + rect2.area());
}
	
}
}
