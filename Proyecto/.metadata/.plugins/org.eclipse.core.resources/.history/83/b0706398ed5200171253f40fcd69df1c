package Vista;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.DefaultTableModel;

import Modelo.DAO.DAO;
import Modelo.DTO.Jugador;
import Modelo.DTO.JugadorAntiguo;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TablaHistorial extends JPanel {
	DAO dao = new DAO();
	private JTable table_1;
	String[] titulos ={"Login", "Nombre", "Apellidos", "Nivel", "Nacionalidad", "Fecha"};
	String filas[] = new String[6] ;
	DefaultTableModel modelo= new DefaultTableModel(null, titulos);
	JButton buttonAtrasHistorial = new JButton("<<");
    
	
	public JTable getTable_1() {
		return table_1;
	}



	public void setTable_1(JTable table_1) {
		this.table_1 = table_1;
	}



	public DefaultTableModel getModelo() {
		return modelo;
	}



	public void setModelo(DefaultTableModel modelo) {
		this.modelo = modelo;
	}



	
	


	public JButton getButtonAtrasHistorial() {
		return buttonAtrasHistorial;
	}



	public void setButtonAtrasHistorial(JButton buttonAtrasHistorial) {
		this.buttonAtrasHistorial = buttonAtrasHistorial;
	}



	/**
	 * Create the panel.
	 */
	public TablaHistorial() {

		JScrollPane scrollPane = new JScrollPane();
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(buttonAtrasHistorial, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(buttonAtrasHistorial)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		setLayout(groupLayout);
		
		
		
		
	}

}
