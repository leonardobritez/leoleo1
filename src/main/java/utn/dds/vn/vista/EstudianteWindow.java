package utn.dds.vn.vista;

import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.MainWindow;

import utn.dds.vn.clases.Estudiante;

public class EstudianteWindow extends MainWindow<Estudiante> {

	public EstudianteWindow(Estudiante estudiante) {
		super(estudiante);

	}

	@Override
	public void createContents(Panel ventana) {
		this.setTitle("Sist. Notas");
		//this.setMinHeight(400);
		new Label(ventana).setText("Datos estudiantiles");
		Panel columnas = new Panel(ventana);
		columnas.setLayout(new ColumnLayout(2));
		new Label(columnas).setText("Nombre:");
		new Label(columnas).setText("Pepe");
		new Label(columnas).setText("Legajo:");
		new Label(columnas).setText("12345689");
		new Label(columnas).setText("GitUser:");
		new Label(columnas).setText("PepedBest");
		new Button(columnas).setCaption("Ver Notas").onClick(()->this.hacerAlgo());
		new Button(columnas).setCaption("Cerrar").onClick(()->this.close());
		
		new TokenDialog(this, this.getModelObject()).open();
	}
	
	public void hacerAlgo(){};

}
