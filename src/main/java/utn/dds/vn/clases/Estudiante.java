package utn.dds.vn.clases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.ObjectMapper;
import org.uqbar.commons.utils.Observable;

import utn.dds.vn.http.comunication.ControladorJson;
import utn.dds.vn.http.comunication.EstudianteConexion;

@Observable
public class Estudiante {
	
	@JsonProperty("code")
	private String legajo;
	@JsonProperty("first_name")
	private String nombre;
	@JsonProperty("last_name")
	private String apellido;
	@JsonProperty("github_user")
	private String gitHubUser;
	@JsonProperty("assignments")
	private List<Tareas> asignaciones;
	private String token;
	
	public Estudiante() {};
	public Estudiante(String legajo, String nombre, String apellido, String gitHubUser, String token) {
		super();
		this.legajo = legajo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.gitHubUser = gitHubUser;
		this.token= token;
		this.asignaciones = new ArrayList<>();
	}
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getGitHubUser() {
		return gitHubUser;
	}
	public void setGitHubUser(String gitHubUser) {
		this.gitHubUser = gitHubUser;
	}
	public List<Tareas> getAsignaciones() {
		return asignaciones;
	}
	public void setAsignaciones(List<Tareas> asignaciones) {
		this.asignaciones = asignaciones;
	}
	
	public void inicializarConToken() {
		Estudiante temp = new ControladorJson()
				.obtenerDesdeJson(new EstudianteConexion()
											.obtenerDatosEstudiante(token)
											.getEntity(String.class), this.getClass());
		this.apellido = temp.apellido;
		this.nombre = temp.nombre;
		this.legajo = temp.legajo;
		this.gitHubUser = temp.gitHubUser;
	}
	
	public void inicializarTareas() {
		String jsonTareas = new EstudianteConexion().obtenerNotasEstudiante(this.token).getEntity(String.class);
		this.asignaciones = new ControladorJson().obtenerDesdeJson(jsonTareas, this.getClass()).getAsignaciones();
	}
	
	public Estudiante clone(){
		return new Estudiante(legajo, nombre, apellido, gitHubUser,token);
	}

}
