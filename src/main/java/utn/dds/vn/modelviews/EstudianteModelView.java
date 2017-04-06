package utn.dds.vn.modelviews;

import java.util.List;

import org.uqbar.commons.utils.Observable;

import utn.dds.vn.clases.Estudiante;
import utn.dds.vn.clases.Tarea;

@Observable
public class EstudianteModelView {

	Estudiante estu;
	
	public EstudianteModelView(Estudiante estudiante) {
		this.estu = estudiante;
	}

	public String getLegajo() {
		return estu.getLegajo();
	}
	public void setLegajo(String legajo) {
		this.estu.setLegajo(legajo);
	}
	public String getNombre() {
		return estu.getNombre();
	}
	public void setNombre(String nombre) {
		this.estu.setNombre(nombre);
	}
	public String getToken() {
		return estu.getToken();
	}
	public void setToken(String token) {
		this.estu.setToken(token);
		this.estu.inicializarConToken();
	}
	public String getApellido() {
		return estu.getApellido();
	}
	public void setApellido(String apellido) {
		this.setApellido(apellido);
	}
	public String getGitHubUser() {
		return estu.getGitHubUser();
	}
	public void setGitHubUser(String gitHubUser) {
		this.setGitHubUser(gitHubUser);
	}
	public List<Tarea> getAsignaciones() {
		return estu.getAsignaciones();
	}
	public void setAsignaciones(List<Tarea> asignaciones) {
		this.estu.setAsignaciones(asignaciones);
	}
	public void cargarTareas() {
		this.estu.inicializarTareas();
	}
}
