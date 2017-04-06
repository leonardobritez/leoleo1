package utn.dds.vn.main;

import utn.dds.vn.clases.Estudiante;
import utn.dds.vn.modelviews.EstudianteModelView;
import utn.dds.vn.vista.EstudianteWindow;

public class Main {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EstudianteWindow(new EstudianteModelView(new Estudiante())).startApplication();
	}

}
