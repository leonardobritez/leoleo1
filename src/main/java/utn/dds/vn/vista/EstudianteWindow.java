package utn.dds.vn.vista;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.commons.model.ObservableUtils;

import utn.dds.vn.modelviews.EstudianteModelView;
import utn.dds.vn.modelviews.TareasModelView;

@SuppressWarnings("serial")
public class EstudianteWindow extends MainWindow<EstudianteModelView> {
	
	public EstudianteWindow(EstudianteModelView estudiante) {
		super(estudiante);
	}
	//Usar este token: 
	/*eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho*/
	
	@Override
	public void createContents(Panel ventana) {
		this.setTitle("Sist. Notas");
		new Label(ventana).setText("Datos estudiantiles").setWidth(300);
		Panel columnas = new Panel(ventana);
		columnas.setLayout(new ColumnLayout(2));
		new TokenDialog(this, this.getModelObject()).open();	
		new Label(columnas).setText("Nombre:");
		new Label(columnas).setWidth(100).bindValueToProperty("nombre");
		new Label(columnas).setText("Apellido:");
		new Label(columnas).setWidth(100).bindValueToProperty("apellido");
		new Label(columnas).setText("Legajo:");
		new Label(columnas).setWidth(100).bindValueToProperty("legajo");
		new Label(columnas).setText("GitUser:");
		new Label(columnas).setWidth(100).bindValueToProperty("gitHubUser");
		new Button(columnas).setCaption("Ver Notas").onClick(()->this.hacerAlgo());
		new Button(columnas).setCaption("Modificar").onClick(()->this.modificarAlumnoWindowsIniciar());
		new Button(ventana).setCaption("Cerrar").onClick(()->this.close());
	}
	
	public void hacerAlgo(){
		this.getModelObject().cargarTareas();
		new TareasWindow(this, new TareasModelView(this.getModelObject().getAsignaciones())).open();
	}
	
	public void modificarAlumnoWindowsIniciar(){
		new EstudianteModificacionWindows(this, this.getModelObject()).open();
		ObservableUtils.firePropertyChanged(this.getModelObject(), "nombre");
		ObservableUtils.firePropertyChanged(this.getModelObject(), "apellido");
		ObservableUtils.firePropertyChanged(this.getModelObject(), "gitHubUser");
	}


}
