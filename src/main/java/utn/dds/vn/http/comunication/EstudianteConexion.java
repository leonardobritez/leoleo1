package utn.dds.vn.http.comunication;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

public class EstudianteConexion {

	private Client cliente;
	public static final String SERVICIO_NOTAS = "http://notitas.herokuapp.com";
	public static final String PATH_STUDENT_DATA = "student";
	public static final String PATH_STUDENT_NOTES = PATH_STUDENT_DATA + "/assignments";
	
	public EstudianteConexion() {
		this.cliente = Client.create();
	}
	
	public ClientResponse obtenerDatosEstudiante(String token) {
		return this.obtenerDatosSegunPath(PATH_STUDENT_DATA, token);
	}
	
	public ClientResponse obtenerNotasEstudiante(String token) {
		return this.obtenerDatosSegunPath(PATH_STUDENT_NOTES, token);
	}
	
	public ClientResponse obtenerDatosSegunPath(String path, String token) {
		ClientResponse datosEstudiante  = cliente
			.resource(SERVICIO_NOTAS)
			.path(path)
			.header("Authorization", "Bearer " + token)
			.get(ClientResponse.class);
		datosEstudiante.getProperties();
		return datosEstudiante;
	}
	
	
	
	
}
