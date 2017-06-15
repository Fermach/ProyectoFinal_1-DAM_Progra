package Vista;

import Modelo.DAO.*;
import javax.swing.JPanel;
import javax.swing.JTable;
import Modelo.DTO.Jugador;

import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

public class TablaJugadores extends JPanel {
    
	List<Jugador> listaJugadores= new ArrayList<>();
	
	DAO dao = new DAO();
	private JTable table_1;
	JButton buttonAtrasJugadores = new JButton("<<");
	String[] titulos ={"Login", "Nombre", "Apellidos", "Nivel", "Nacionalidad"};
	String filas[] = new String[5] ;
	
	
    DefaultTableModel modelo= new DefaultTableModel(null, titulos);
	
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

	public JButton getButtonAtrasJugadores() {
		return buttonAtrasJugadores;
	}

	public void setButtonAtrasJugadores(JButton buttonAtrasJugadores) {
		this.buttonAtrasJugadores = buttonAtrasJugadores;
	}

	/**
	 * Create the panel.
	 */
	public TablaJugadores() {
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(buttonAtrasJugadores)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(buttonAtrasJugadores)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)
					.addGap(25))
		);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		setLayout(groupLayout);
		
		
		
	
		

}
}
