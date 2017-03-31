package utn.dds.vn.http.comunication;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

public class ControladorJson {
	
	private ObjectMapper maper;
	
	public ControladorJson() {
		this.maper = new ObjectMapper();
	}

	public <T> T obtenerDesdeJson(String json, Class<T> tipo) {
		try {
			return this.maper.readValue(json, tipo);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Error leyendo json", e);
		}
	}
}
