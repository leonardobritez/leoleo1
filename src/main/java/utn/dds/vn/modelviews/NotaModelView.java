package utn.dds.vn.modelviews;

import org.uqbar.commons.utils.Observable;

import utn.dds.vn.clases.Nota;

@Observable
public class NotaModelView {
	private Nota tareaNota;
	
	public NotaModelView(Nota nota) {
		this.tareaNota = nota;
	}
	
	public Integer getId() {
		return tareaNota.getId();
	}
	public void setId(Integer id) {
		this.tareaNota.setId(id);
	}
	public String getValor() {
		return tareaNota.getValor();
	}
	public void setValor(String valor) {
		this.tareaNota.setValor(valor);
	}
	public String getAlta() {
		return tareaNota.getAlta();
	}
	public void setAlta(String alta) {
		this.tareaNota.setAlta(alta);
	}
	public String getModificacion() {
		return tareaNota.getModificacion();
	}
	public void setModificacion(String modificacion) {
		this.tareaNota.setModificacion(modificacion);
	}
	
}
