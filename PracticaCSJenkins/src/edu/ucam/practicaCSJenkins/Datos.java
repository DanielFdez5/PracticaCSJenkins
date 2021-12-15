package edu.ucam.practicaCSJenkins;


import java.util.Enumeration;
import java.util.Hashtable;

public class Datos {
	
	private String nombre;
	private String dni;
	private String correo;
	private int edad;
	private String id;
	
	//Tabla hash para guardar datos
	private static Hashtable<String, Datos> datos = new Hashtable<String, Datos>();
	
	public static void main (String[] args) {
		
	}
	
	public Datos (String id, String nombre, String dni, String correo, int edad) {
		this.setId(id);
		this.setNombre(nombre);
		this.setDni(dni);
		this.setCorreo(correo);
		this.setEdad(edad);
	}
	
	public Datos() {
		
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int contarUsuarios() {
		return datos.size();
	}
	
	public static void addUsuario(Datos datos) {
		Datos.datos.put(datos.getId(), datos);
	}
	
	public static void mostrarUsuarios() {
		Enumeration<String> key = datos.keys();
		while(key.hasMoreElements()) {
			String usuario = key.nextElement();
			System.out.println("Id: " + datos.get(usuario).getId());
			System.out.println("Nombre de usuario: "+ datos.get(usuario).getNombre());
			System.out.println("Correo: "+ datos.get(usuario).getCorreo());
			System.out.println("DNI: "+ datos.get(usuario).getDni());
			System.out.println("Edad: "+ datos.get(usuario).getEdad());
			System.out.println();
		}
	}
	
	public static void borrarUsuario(String id) {
		Datos.datos.remove(id);
	}
	
	public Datos buscarUsuarios(String id) {
		return datos.get(id);
	}
	
	public static boolean buscarUsuario(String id) {
		if(Datos.datos.get(id) != null) {
			System.out.println("True");
			return true;
		}
		else { 
			System.out.println("El resultado obtenido es : False");
			return false;
		}
	}
}
