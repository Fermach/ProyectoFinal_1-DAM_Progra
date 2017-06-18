package Vista;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

import Modelo.DAO.DAO;
import Modelo.DTO.Personaje;
/**
 * JTable de los personajes que son guerreros
 * @author Fermach
 * @version 1.0.
 */
public class TablaGuerreros extends JPanel {
	private JTable table;
    DAO dao= new DAO();
    JButton btnNewButtonAtrasGuerreros = new JButton("<<");
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

	public JButton getBtnNewButtonAtrasGuerreros() {
		return btnNewButtonAtrasGuerreros;
	}

	public void setBtnNewButtonAtrasGuerreros(JButton btnNewButtonAtrasGuerreros) {
		this.btnNewButtonAtrasGuerreros = btnNewButtonAtrasGuerreros;
	}

	/**
	 * Create the panel.
	 */
	public TablaGuerreros() {

     
		
		JScrollPane scrollPane = new JScrollPane();
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButtonAtrasGuerreros, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButtonAtrasGuerreros)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		setLayout(groupLayout);
        
		
        
      
	}
}
