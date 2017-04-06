package utn.dds.vn.clases;

import org.codehaus.jackson.annotate.JsonProperty;

public class Nota {
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("value")
	private String valor;
	@JsonProperty("created_at")
	private String alta;
	@JsonProperty("updated_at")
	private String modificacion;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getAlta() {
		return alta;
	}
	public void setAlta(String alta) {
		this.alta = alta;
	}
	public String getModificacion() {
		return modificacion;
	}
	public void setModificacion(String modificacion) {
		this.modificacion = modificacion;
	}
	
	
}
