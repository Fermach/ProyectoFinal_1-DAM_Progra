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
 * JTable de los Personajes que son magos de nuestra BD
 * @author Fermach
 *
 */
public class TablaMagos extends JPanel {
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


	JButton buttonAtrasMagos = new JButton("<<");
    

	public JButton getButtonAtrasMagos() {
		return buttonAtrasMagos;
	}



	public void setButtonAtrasMagos(JButton buttonAtrasMagos) {
		this.buttonAtrasMagos = buttonAtrasMagos;
	}


	/**
	 * Create the panel.
	 */
	public TablaMagos() {
	   
		
			JScrollPane scrollPane = new JScrollPane();
			
			
			GroupLayout groupLayout = new GroupLayout(this);
			groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.TRAILING)
					.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(buttonAtrasMagos, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
							.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
						.addContainerGap())
			);
			groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.TRAILING)
					.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(buttonAtrasMagos)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
			);
			
			table = new JTable();
			scrollPane.setViewportView(table);
			setLayout(groupLayout);
	        
		
	        
	      
	}

}
