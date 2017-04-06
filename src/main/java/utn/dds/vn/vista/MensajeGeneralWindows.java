package utn.dds.vn.vista;

import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

@SuppressWarnings("serial")
public class MensajeGeneralWindows extends SimpleWindow<String> {

	public MensajeGeneralWindows(WindowOwner owner, String model) {
		super(owner, model);
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		this.setTitle("Resultado de operacion");
		new Label(mainPanel).setText(this.getModelObject()).setWidth(200);
		new Button(mainPanel).setCaption("Ok.").onClick(()->close());
	}

	@Override
	protected void addActions(Panel actionsPanel) {
		// TODO Auto-generated method stub
		
	}

}
