package utn.dds.vn.clases;

import org.uqbar.commons.utils.Observable;

@Observable
public class Estudiante {
	
	private String legajo;
	private String nombre;
	private String token;
	
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	

}
