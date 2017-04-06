package utn.dds.vn.modelviews;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.uqbar.commons.utils.Observable;

import utn.dds.vn.clases.Tarea;

@Observable
public class TareasModelView {
	
	private List<Tarea> tareas;
	private Tarea tareaElegida;
	private String descripcion;
	
	public TareasModelView(List<Tarea> hw) {
		this.tareas = hw;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.tareaElegida.setDescripcion(descripcion);
	}
	public Tarea getTareaElegida() {
		return tareaElegida;
	}
	public void setTareaElegida(Tarea tareaElegia) {
		this.descripcion = tareaElegia.getDescripcion();
		this.tareaElegida = tareaElegia;
	}
	public List<Tarea> getTareas() {
		return tareas;
	}
	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}
	public List<NotaModelView> getNotas() {
		if(this.tareaElegida != null)
			return this.tareaElegida.getNotas().stream().map(nota -> new NotaModelView(nota)).collect(Collectors.toList());
		else 
			return new ArrayList<NotaModelView>();
	}
	
}
