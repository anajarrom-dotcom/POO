package Encapsulacion;

import Main.java.Persona;

public class Main {

	public static void main(String[] args) {
		
		Persona prs1 = new Persona("Antony","Najarro",20);
		Persona prs2 = new Persona("David","Lopez",23);
		Persona prs3 = new Persona("Fernanda","Aguilar",60);
			System.out.println("-----------Personas-----------");
		prs1.Mostrar();
		prs2.Mostrar();
		prs3.Mostrar();
	}
	
}
