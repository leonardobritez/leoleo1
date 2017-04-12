package utn.dds.vn.vista;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import utn.dds.vn.modelviews.EstudianteModelView;

@SuppressWarnings("serial")
public class EstudianteModificacionWindows extends SimpleWindow<EstudianteModelView> {

	public EstudianteModificacionWindows(WindowOwner parent, EstudianteModelView model) {
		super(parent, model);
	}

	@Override
	protected void addActions(Panel actionsPanel) {
	
	}

	@Override
	protected void createFormPanel(Panel ventana) {
		this.setTitle("Sist. Notas");
		new Label(ventana).setText("Datos estudiantiles").setWidth(300);
		Panel columnas = new Panel(ventana);
		columnas.setLayout(new ColumnLayout(2));	
		new Label(columnas).setText("Nombre:");
		new TextBox(columnas).setWidth(100).bindValueToProperty("nombre");
		new Label(columnas).setText("Apellido:");
		new TextBox(columnas).setWidth(100).bindValueToProperty("apellido");
		new Label(columnas).setText("GitUser:");
		new TextBox(columnas).setWidth(100).bindValueToProperty("gitHubUser");
		new Button(columnas).setCaption("Modificar").onClick(()->this.modificarAlumno());
		new Button(columnas).setCaption("Cerrar").onClick(()->this.close());
	}
	
	private void modificarAlumno() {
		this.getModelObject().actualizarDatos();
		this.close();
	}

}
