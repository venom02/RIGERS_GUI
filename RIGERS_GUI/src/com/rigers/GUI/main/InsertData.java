package com.rigers.GUI.main;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.custom.TableTree;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.widgets.Control;

public class InsertData {
	private static class ContentProvider implements IStructuredContentProvider {
		public Object[] getElements(Object inputElement) {
			return new Object[0];
		}
		public void dispose() {
		}
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}
	}

	protected Shell shlRigers;
	private Text txtAsd;
	private Text text;
	private Table table;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InsertData window = new InsertData();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlRigers.open();
		shlRigers.layout();
		while (!shlRigers.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlRigers = new Shell();
		shlRigers.setMinimumSize(new Point(700, 200));
		shlRigers.setSize(717, 552);
		shlRigers.setText("RIGERS");
		shlRigers.setLayout(new FillLayout(SWT.VERTICAL));
		
		Menu menu_1 = new Menu(shlRigers, SWT.BAR);
		shlRigers.setMenuBar(menu_1);
		
		MenuItem mntmNewSubmenu = new MenuItem(menu_1, SWT.CASCADE);
		mntmNewSubmenu.setText("File");
		
		Menu menu_2 = new Menu(mntmNewSubmenu);
		mntmNewSubmenu.setMenu(menu_2);
		
		MenuItem mntmNewItem_1 = new MenuItem(menu_2, SWT.NONE);
		mntmNewItem_1.setText("Connect...");
		
		new MenuItem(menu_2, SWT.SEPARATOR);
		
		MenuItem mntmNewItem_2 = new MenuItem(menu_2, SWT.NONE);
		mntmNewItem_2.setText("Quit");
		
		TabFolder tabFolder = new TabFolder(shlRigers, SWT.NONE);
		
		TabItem tbtmViewData = new TabItem(tabFolder, SWT.NONE);
		tbtmViewData.setToolTipText("");
		tbtmViewData.setText("Inserimento Letture");
		
		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tbtmViewData.setControl(composite_1);
		GridLayout gl_composite_1 = new GridLayout(1, false);
		gl_composite_1.marginWidth = 1;
		gl_composite_1.horizontalSpacing = 1;
		gl_composite_1.verticalSpacing = 1;
		gl_composite_1.marginHeight = 1;
		composite_1.setLayout(gl_composite_1);
		
		Group grpCompartimento = new Group(composite_1, SWT.NONE);
		grpCompartimento.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpCompartimento.setText("Compartimento");
		grpCompartimento.setLayout(new GridLayout(7, false));
		
		Label lblId = new Label(grpCompartimento, SWT.NONE);
		lblId.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblId.setText("ID");
		
		Spinner spinner = new Spinner(grpCompartimento, SWT.BORDER);
		GridData gd_spinner = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_spinner.widthHint = 20;
		spinner.setLayoutData(gd_spinner);
		
		Label lblNome = new Label(grpCompartimento, SWT.NONE);
		lblNome.setText("Nome");
		
		txtAsd = new Text(grpCompartimento, SWT.BORDER);
		GridData gd_txtAsd = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_txtAsd.widthHint = 225;
		txtAsd.setLayoutData(gd_txtAsd);
		new Label(grpCompartimento, SWT.NONE);
		
		Label lblNewLabel = new Label(grpCompartimento, SWT.NONE);
		lblNewLabel.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GREEN));
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true, false, 1, 1));
		lblNewLabel.setText("OK");
		
		Button btnInsert = new Button(grpCompartimento, SWT.NONE);
		btnInsert.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		btnInsert.setText("INSERT");
		
		Group grpEdificio_1 = new Group(composite_1, SWT.NONE);
		grpEdificio_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpEdificio_1.setText("Edificio");
		grpEdificio_1.setLayout(new GridLayout(8, false));
		
		Label lblId_1 = new Label(grpEdificio_1, SWT.NONE);
		lblId_1.setText("ID");
		
		Spinner spinner_1 = new Spinner(grpEdificio_1, SWT.BORDER);
		
		Label lblCompartimento = new Label(grpEdificio_1, SWT.NONE);
		lblCompartimento.setText("Compartimento");
		
		Combo combo = new Combo(grpEdificio_1, SWT.NONE);
		combo.setItems(new String[] {"Comp1", "Comp2", "Comp3"});
		
		Label lblIndirizzo = new Label(grpEdificio_1, SWT.NONE);
		lblIndirizzo.setText("Indirizzo");
		
		text = new Text(grpEdificio_1, SWT.BORDER);
		GridData gd_text = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_text.widthHint = 240;
		text.setLayoutData(gd_text);
		
		Label lblOk = new Label(grpEdificio_1, SWT.NONE);
		lblOk.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true, false, 1, 1));
		lblOk.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_GREEN));
		lblOk.setText("OK");
		
		Button btnInsert_1 = new Button(grpEdificio_1, SWT.NONE);
		btnInsert_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		btnInsert_1.setText("INSERT");
		
		Group grpLettura = new Group(composite_1, SWT.NONE);
		grpLettura.setLayout(new GridLayout(6, false));
		grpLettura.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		grpLettura.setText("Lettura");
		
		Label lblEdificio_1 = new Label(grpLettura, SWT.NONE);
		lblEdificio_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblEdificio_1.setText("Compartimento");
		
		Combo combo_4 = new Combo(grpLettura, SWT.NONE);
		combo_4.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Label lblEdificio_2 = new Label(grpLettura, SWT.NONE);
		lblEdificio_2.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblEdificio_2.setText("Edificio");
		
		Combo combo_5 = new Combo(grpLettura, SWT.NONE);
		combo_5.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Label lblDispositivo_1 = new Label(grpLettura, SWT.NONE);
		lblDispositivo_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDispositivo_1.setText("Dispositivo");
		
		Combo combo_6 = new Combo(grpLettura, SWT.NONE);
		combo_6.setItems(new String[] {"Meter Acqua", "Meter Elettrico", "Meter Gas", "Meter Termie", "Meter Ripartitore Calore", "Meter Sonde"});
		combo_6.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		combo_6.setText("Meter Acqua\r\n");
		
		Label lblData = new Label(grpLettura, SWT.NONE);
		lblData.setText("Data:");
		
		DateTime dateTime_2 = new DateTime(grpLettura, SWT.BORDER);
		new Label(grpLettura, SWT.NONE);
		new Label(grpLettura, SWT.NONE);
		new Label(grpLettura, SWT.NONE);
		new Label(grpLettura, SWT.NONE);
		
		Composite composite_3 = new Composite(composite_1, SWT.NONE);
		composite_3.setLayout(new StackLayout());
		composite_3.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		Composite blankcomp = new Composite(composite_3, SWT.NONE);
		
		Group grpMeterAcqua = new Group(composite_3, SWT.NONE);
		grpMeterAcqua.setText("Meter Acqua");
		
		Group grpMeterLuce = new Group(composite_3, SWT.NONE);
		grpMeterLuce.setText("Meter Elettrico");
		
		Group grpMeterRipartitoreCaldaia = new Group(composite_3, SWT.NONE);
		grpMeterRipartitoreCaldaia.setText("Meter Ripartitore Caldaia");
		
		Group grpMeterGas = new Group(composite_3, SWT.NONE);
		grpMeterGas.setText("Meter Gas");
		
		Group grpMeterSonde = new Group(composite_3, SWT.NONE);
		grpMeterSonde.setText("Meter Sonde");
		
		Group grpMeterTermie = new Group(composite_3, SWT.NONE);
		grpMeterTermie.setText("Meter Termie");
		composite_3.setTabList(new Control[]{grpMeterAcqua, grpMeterLuce, grpMeterGas, grpMeterTermie, grpMeterRipartitoreCaldaia, grpMeterSonde});
		
		
		TabItem tbtmViewData_1 = new TabItem(tabFolder, SWT.NONE);
		tbtmViewData_1.setText("Mostra Letture");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		tbtmViewData_1.setControl(composite);
		composite.setLayout(new GridLayout(1, false));
		
		Group grpFilters = new Group(composite, SWT.NONE);
		grpFilters.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		grpFilters.setText("Filtri");
		grpFilters.setLayout(new GridLayout(5, false));
		
		Label lblComp = new Label(grpFilters, SWT.NONE);
		lblComp.setText("Compartimento");
		
		Label lblEdificio = new Label(grpFilters, SWT.NONE);
		lblEdificio.setText("Edificio");
		
		Label lblDispositivo = new Label(grpFilters, SWT.NONE);
		lblDispositivo.setText("Dispositivo");
		
		Label lblDa = new Label(grpFilters, SWT.NONE);
		lblDa.setText("Da:");
		
		Label lblA = new Label(grpFilters, SWT.NONE);
		GridData gd_lblA = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblA.widthHint = 26;
		lblA.setLayoutData(gd_lblA);
		lblA.setText("A:");
		
		Combo comboComp = new Combo(grpFilters, SWT.NONE);
		comboComp.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Combo comboEdif = new Combo(grpFilters, SWT.NONE);
		comboEdif.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Combo comboDisp = new Combo(grpFilters, SWT.NONE);
		comboDisp.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		DateTime dateTimeFrom = new DateTime(grpFilters, SWT.BORDER);
		
		DateTime dateTimeTo = new DateTime(grpFilters, SWT.BORDER);
		new Label(grpFilters, SWT.NONE);
		new Label(grpFilters, SWT.NONE);
		new Label(grpFilters, SWT.NONE);
		
			
			Button btnReset = new Button(grpFilters, SWT.NONE);
			GridData gd_btnReset = new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1);
			gd_btnReset.minimumWidth = 100;
			btnReset.setLayoutData(gd_btnReset);
			btnReset.setText("RESET");
		
		Button btnGo = new Button(grpFilters, SWT.NONE);
		btnGo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnGo.setText("GO");
		
		Group grpResults = new Group(composite, SWT.NONE);
		grpResults.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		grpResults.setText("Risultati");
		grpResults.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Composite composite_4 = new Composite(grpResults, SWT.NONE);
		composite_4.setLayout(new TableColumnLayout());
		
		TableViewer tableViewer = new TableViewer(composite_4, SWT.BORDER | SWT.FULL_SELECTION);
		tableViewer.setColumnProperties(new String[] {});
		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		Composite composite_2 = new Composite(tabFolder, SWT.NONE);

	}
}
