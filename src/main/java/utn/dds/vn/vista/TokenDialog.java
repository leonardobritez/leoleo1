package utn.dds.vn.vista;


import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.arena.windows.WindowOwner;

import utn.dds.vn.clases.Estudiante;

public class TokenDialog extends Dialog<Estudiante> {

	public TokenDialog(WindowOwner owner, Estudiante model) {
		super(owner, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createContents(Panel mainPanel) {
		this.setMinHeight(200);
		this.setTitle("Sist. Notas");
		new Label(mainPanel).setText("Ingrese Token");
		new TextBox(mainPanel).setWidth(200).bindValueToProperty("token");
		new Button(mainPanel).setCaption("Confirmar").onClick(()->this.close());
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		// TODO Auto-generated method stub
		
	}
	
}
