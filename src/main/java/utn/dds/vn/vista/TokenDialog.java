package utn.dds.vn.vista;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;

import utn.dds.vn.modelviews.EstudianteModelView;

@SuppressWarnings("serial")
public class TokenDialog extends Dialog<EstudianteModelView> {

	public TokenDialog(WindowOwner owner, EstudianteModelView model) {
		super(owner, model);
	}

	@Override
	public void createContents(Panel mainPanel) {
		this.setMinHeight(200);
		this.setTitle("Sist. Notas");
		new Label(mainPanel).setText("Ingrese Token");
		new TextBox(mainPanel).setWidth(200).bindValueToProperty("token");
		new Button(mainPanel).setCaption("Confirmar").onClick(()->this.cerrar());
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
	}
	
	public void cerrar() {
		this.close();
	}
	
}
