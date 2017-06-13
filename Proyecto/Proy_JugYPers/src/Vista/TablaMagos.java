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

public class TablaMagos extends JPanel {
	private JTable table;
    DAO dao= new DAO();
    
    JButton buttonAtrasMagos = new JButton("<");
    

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
						.addGap(29)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(buttonAtrasMagos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGap(370))
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 411, GroupLayout.PREFERRED_SIZE))
						.addContainerGap())
			);
			groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.TRAILING)
					.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap(24, Short.MAX_VALUE)
						.addComponent(buttonAtrasMagos)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
			);
			
			table = new JTable();
			scrollPane.setViewportView(table);
			setLayout(groupLayout);
	        
			String[] titulos ={ "Nombre", "Login" ,"Tipo", "Raza", "Sexo"};
			String fila[] = new String[5];
			
	        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
	        
	      //Recorro la lista de la base de datos y añado cada personaje al modelo
	        for (Personaje p : dao.listaMagos()) {
	        	
	        	fila[0] = p.getNombre();
	        	fila[1] = p.getLogin();
	        	fila[2] = p.getTipo();
	        	fila[3] = p.getRaza();
	        	fila[4] = p.getSexo();
				modelo.addRow(fila);
			}
	        
	        //aplico el modelo
	        table.setModel(modelo);
	}

}
