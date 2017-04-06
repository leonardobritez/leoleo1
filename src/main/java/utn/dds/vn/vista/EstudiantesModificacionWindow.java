package utn.dds.vn.vista;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import utn.dds.vn.clases.Estudiante;
import utn.dds.vn.http.comunication.ControladorJson;
import utn.dds.vn.http.comunication.EstudianteConexion;
import utn.dds.vn.modelviews.EstudianteModelView;

@SuppressWarnings("serial")
public class EstudiantesModificacionWindow extends SimpleWindow<EstudianteModelView>{

	public EstudiantesModificacionWindow(WindowOwner parent, EstudianteModelView estudiante) {
		super(parent, estudiante);
	}

	@Override
	protected void addActions(Panel actionsPanel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		this.setTitle("Sist. Notas");
		new Label(mainPanel).setText("Datos estudiantiles");
		Panel columnas = new Panel(mainPanel);
		columnas.setLayout(new ColumnLayout(2));
		new Label(columnas).setText("Nombre:");
		new TextBox(columnas).bindValueToProperty("nombre");
		new Label(columnas).setText("Apellido:");
		new TextBox(columnas).bindValueToProperty("apellido");
		new Label(columnas).setText("Legajo:");
		new TextBox(columnas).bindValueToProperty("legajo");
		new Label(columnas).setText("GitUser:");
		new TextBox(columnas).bindValueToProperty("gitHubUser");
		new Button(columnas).setCaption("Confirmar").onClick(()->this.modificacionConfirmada());
		new Button(columnas).setCaption("Cerrar").onClick(()->this.close());
	}

	private void modificacionConfirmada() {
		//String datosNuevos = new ControladorJson().toJson(this.getModelObject());
		//new EstudianteConexion().actualizarDatosEstudiantiles(this.getModelObject().getToken(),datosNuevos);
		this.close();
	}


}
