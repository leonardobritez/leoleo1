package utn.dds.vn.vista;

import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;

import utn.dds.vn.clases.Estudiante;
import utn.dds.vn.clases.Tareas;

@SuppressWarnings("serial")
public class TareasWindow extends SimpleWindow<Estudiante> {

	public TareasWindow(WindowOwner parent, Estudiante estudiante) {
		super(parent, estudiante);
	}

	@Override
	protected void addActions(Panel actionsPanel) {
		// TODO Auto-generated method stub
	}

	@Override
	protected void createFormPanel(Panel mainPanel) {
		mainPanel.setLayout(new HorizontalLayout());
		this.setTitle("Sist. Notas");
		Table<Tareas> table = new Table<Tareas>(mainPanel, Tareas.class);
		table.bindItemsToProperty("asignaciones");
		this.getModelObject().inicializarTareas();
		Column<Tareas> columnaTitulo = new Column<Tareas>(table);
		columnaTitulo.setTitle("Titulo");
		columnaTitulo.setFixedSize(100);
		columnaTitulo.bindContentsToProperty("nombre");
		Column<Tareas> columnaDescripcion = new Column<Tareas>(table);
		columnaDescripcion.setTitle("Descripcion");
		columnaDescripcion.bindContentsToProperty("descripcion");
		columnaDescripcion.setFixedSize(250);
		table.setHeight(300);
		table.setWidth(600);
	}

}
