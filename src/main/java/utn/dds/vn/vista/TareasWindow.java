package utn.dds.vn.vista;

import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import utn.dds.vn.modelviews.NotaModelView;
import utn.dds.vn.modelviews.TareasModelView;

@SuppressWarnings("serial")
public class TareasWindow extends SimpleWindow<TareasModelView> {

	public TareasWindow(WindowOwner parent, TareasModelView estudiante) {
		super(parent, estudiante);
	}

	@Override
	protected void addActions(Panel actionsPanel) {
		// TODO Auto-generated method stub
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		this.setTitle("Tareas Info");
		this.setMinHeight(400);
		new Label(mainPanel).setText("Seleccione la tarea:");
		Selector<TareasModelView> comboBoxTareas = new Selector<TareasModelView>(mainPanel);
		comboBoxTareas.bindValueToProperty("tareaElegida");
		comboBoxTareas.bindItemsToProperty("tareas");
		comboBoxTareas.setWidth(500);
		new Label(mainPanel).setText("Informacion:");
		new Label(mainPanel).bindValueToProperty("descripcion");
		
		Table<NotaModelView> table = new Table<NotaModelView>(mainPanel, NotaModelView.class);
		table.setNumberVisibleRows(8);
		table.bindItemsToProperty("notas");
		Column<NotaModelView> columnaTitulo = new Column<NotaModelView>(table);
		columnaTitulo.setTitle("ID");
		columnaTitulo.bindContentsToProperty("id");
		Column<NotaModelView> columnaNota = new Column<NotaModelView>(table);
		columnaNota.setTitle("Nota");
		columnaNota.bindContentsToProperty("valor");
		Column<NotaModelView> columnaAlta = new Column<NotaModelView>(table);
		columnaAlta.setTitle("Alta");
		columnaAlta.bindContentsToProperty("alta");
		Column<NotaModelView> columnaModificacion = new Column<NotaModelView>(table);
		columnaModificacion.setTitle("Modificacion");
		columnaModificacion.bindContentsToProperty("modificacion");
	}

}
