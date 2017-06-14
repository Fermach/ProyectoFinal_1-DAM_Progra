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

public class TablaGuerreros extends JPanel {
	private JTable table;
    DAO dao= new DAO();
    JButton btnNewButtonAtrasGuerreros = new JButton("<<");
	
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
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButtonAtrasGuerreros, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButtonAtrasGuerreros)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		setLayout(groupLayout);
        
		String[] titulos ={ "Nombre", "Login" ,"Tipo", "Raza", "Sexo"};
		String fila[] = new String[5];
		
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        
      //Recorro la lista de la base de datos y añado cada personaje al modelo
        for (Personaje p : dao.listaGuerreros()) {
        	
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
