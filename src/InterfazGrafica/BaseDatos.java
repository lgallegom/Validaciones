package InterfazGrafica;

import java.util.ArrayList;

/**
 * @author SAMUEL Y LAURA
 * @version 1.0
 */

public class BaseDatos {
	
	private ArrayList<ArrayList> administradores = new ArrayList();
	private ArrayList<String> administrador1 = new ArrayList<String>();
	private ArrayList<String> administrador2 = new ArrayList<String>();
	private ArrayList<String> administrador3 = new ArrayList<String>();
	private ArrayList<ArrayList> usuarios = new ArrayList();
	private ArrayList<String> usuario1 = new ArrayList<String>();
	private ArrayList<String> usuario2 = new ArrayList<String>();
	private ArrayList<String> usuario3 = new ArrayList<String>();
	

	public BaseDatos() {
		
		administrador1.add("fredy G");
		administrador1.add("1234 5");
		administrador2.add("samuel");
		administrador2.add("12345");
		administrador3.add("camilo");
		administrador3.add("12345");
		
		usuario1.add("samuel G");
		usuario1.add("12345 6");
		usuario2.add("felipe");
		usuario2.add("123456");
		usuario3.add("katalina");
		usuario3.add("123456");
		
		administradores.add(administrador1);
		administradores.add(administrador2);
		administradores.add(administrador3);
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
	}
	
	public ArrayList<ArrayList> getAdministradores (){
		return administradores;
	}
	
	public ArrayList<ArrayList> getUsuarios (){
		return usuarios;
	}
	
	

}
