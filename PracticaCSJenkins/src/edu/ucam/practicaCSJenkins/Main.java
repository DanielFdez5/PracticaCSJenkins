package edu.ucam.practicaCSJenkins;


import java.util.Scanner;
import edu.ucam.practicaCSJenkins.*;

public class Main {
	
	public static void main (String[] args) {
		String nombre, dni, correo;
		int edad;
		int conteo, conteo2;
		
		//Añadimos usuarios:
		System.out.println("Usuarios añadido/s");
		Datos datos = new Datos("1","dani5Fdez","50619657s","danifdezloz@gmail.com", 23);
		Datos datos2 = new Datos("2","daniloz","50619657s","danifdez@gmail.com", 27);
		Datos.addUsuario(datos);
		Datos.addUsuario(datos2);
		System.out.println();

		System.out.println("Los usuarios listados: ");
		System.out.println();
		Datos.mostrarUsuarios();
		System.out.println();
		
		Datos datos3 = new Datos();
		conteo = datos3.contarUsuarios();
		
		System.out.println("Hay " + conteo + " usuario/s");
		System.out.println();
		
		System.out.println("Borrando usuario");
		Datos.borrarUsuario(datos2.getId());
		
		Datos datos4 = new Datos();
		conteo2 = datos4.contarUsuarios();
		
		System.out.println("Hay " + conteo2 + " usuario/s");
		System.out.println();
		
		System.out.println("Los usuarios listados: ");
		System.out.println();
		Datos.mostrarUsuarios();
		
	}
}