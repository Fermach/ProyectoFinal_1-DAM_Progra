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
        
		String[] titulos ={ "Nombre", "Login" ,"Tipo", "Raza", "Sexo"};
		String fila[] = new String[5];
		
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        
      //Recorro la lista de la base de datos y añado cada personaje al modelo
        for (Personaje p : dao.listaPersonajes()) {
        	
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
