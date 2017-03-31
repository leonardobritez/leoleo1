package utn.dds.vn.vista;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.MainWindow;

import utn.dds.vn.clases.Estudiante;

@SuppressWarnings("serial")
public class EstudianteWindow extends MainWindow<Estudiante> {
	
	public EstudianteWindow(Estudiante estudiante) {
		super(estudiante);
	}
	//Usar este token: 
	/*eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho*/
	
	@Override
	public void createContents(Panel ventana) {
		this.setTitle("Sist. Notas");
		new Label(ventana).setText("Datos estudiantiles");
		Panel columnas = new Panel(ventana);
		columnas.setLayout(new ColumnLayout(2));
		new TokenDialog(this, this.getModelObject()).open();	
		new Label(columnas).setText("Nombre:");
		new Label(columnas).bindValueToProperty("nombre");
		new Label(columnas).setText("Apellido:");
		new Label(columnas).bindValueToProperty("apellido");
		new Label(columnas).setText("Legajo:");
		new Label(columnas).bindValueToProperty("legajo");
		new Label(columnas).setText("GitUser:");
		new Label(columnas).bindValueToProperty("gitHubUser");
		new Button(columnas).setCaption("Ver Notas").onClick(()->this.hacerAlgo());
		new Button(columnas).setCaption("Modificar").onClick(()->this.modificarAlumnoWindowsIniciar());
		new Button(ventana).setCaption("Cerrar").onClick(()->this.close());
	}
	
	public void hacerAlgo(){
		new TareasWindow(this, this.getModelObject()).open();
	}
	
	public void modificarAlumnoWindowsIniciar(){
		Estudiante estu = this.getModelObject().clone();
		new EstudiantesModificacionWindow(this, estu).open();
	}


}
