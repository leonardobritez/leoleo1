package utn.dds.vn.main;

import utn.dds.vn.clases.Estudiante;
import utn.dds.vn.vista.EstudianteWindow;
import utn.dds.vn.vista.TokenDialog;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EstudianteWindow(new Estudiante()).startApplication();
	}

}
