package utn.dds.vn.clases;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.uqbar.commons.utils.Observable;

@Observable
public class Tareas {
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("title")
	private String nombre;
	@JsonProperty("description")
	private String descripcion;
	@JsonProperty("grades")
	private List<Nota> notas;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<Nota> getNotas() {
		return notas;
	}
	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}
	
	
}
