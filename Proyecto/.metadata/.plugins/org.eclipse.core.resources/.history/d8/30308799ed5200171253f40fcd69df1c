package Vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import Modelo.DAO.DAO;
import Modelo.DTO.Personaje;

import javax.swing.JTable;

public class TablaPersonajes extends JPanel {
	private JTable table;
    DAO dao= new DAO();
    String[] titulos ={ "Nombre", "Login" ,"Tipo", "Raza", "Sexo"};
	String fila[] = new String[5];
	
    DefaultTableModel modelo = new DefaultTableModel(null, titulos);
    
    public JTable getTable() {
		return table;
	}



	public void setTable(JTable table) {
		this.table = table;
	}



	public DefaultTableModel getModelo() {
		return modelo;
	}



	public void setModelo(DefaultTableModel modelo) {
		this.modelo = modelo;
	}



	JButton buttonAtrasPersonajes = new JButton("<<");
    


	public JButton getButtonAtrasPersonajes() {
		return buttonAtrasPersonajes;
	}



	public void setButtonAtrasPersonajes(JButton buttonAtrasPersonajes) {
		this.buttonAtrasPersonajes = buttonAtrasPersonajes;
	}



	/**
	 * Create the panel.
	 */
	public TablaPersonajes() {
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
						.addComponent(buttonAtrasPersonajes, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(buttonAtrasPersonajes)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		setLayout(groupLayout);
        
		
     
	}

}
