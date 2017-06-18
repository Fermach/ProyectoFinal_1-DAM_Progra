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
 * JTable de los Personajes que son Picaros de nuestra BD
 * @author Fermach
 *
 */
public class TablaPicaros extends JPanel {
	private JTable table;
    DAO dao= new DAO();
    JButton buttonAtrasPicaros = new JButton("<<");
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



	public JButton getButtonVolverPicaros() {
		return buttonAtrasPicaros;
	}



	public void setButtonVolverPicaros(JButton buttonVolverPicaros) {
		this.buttonAtrasPicaros = buttonVolverPicaros;
	}



	/**
	 * Create the panel.
	 */
	public TablaPicaros() {
	    
		
			JScrollPane scrollPane = new JScrollPane();
			GroupLayout groupLayout = new GroupLayout(this);
			groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(buttonAtrasPicaros, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
						.addContainerGap())
			);
			groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addGap(10)
						.addComponent(buttonAtrasPicaros)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
						.addContainerGap())
			);
			
			table = new JTable();
			scrollPane.setViewportView(table);
			setLayout(groupLayout);
	        
			
	        
	     
	}

}
