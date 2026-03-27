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
	
	Producto prod1 = new Producto(1,"cafe",5000);
	Producto prod2 = new Producto(2,"proteina",2000);
	System.out.println("-----producto con descuento aplicado-----");
	
	prod1.aplicarDescuento(10);
	prod2.aplicarDescuento(20);
	
	System.out.println(prod1);
	System.out.println(prod2);

	Cuenta c1 = new Cuenta("Antony",2000);
	Cuenta c2 = new Cuenta("juan",3450);
	Cuenta c3 = new Cuenta("Lucia",2345);
	Cuenta c4 = new Cuenta("	Claudia",340);
	System.out.println("-----Historial-----");
	
	c1.retirar(1500.0);
	c2.depositar(300);
	c3.retirar(3000);
	c4.depositar(10000.04);
	
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
}
	
}
