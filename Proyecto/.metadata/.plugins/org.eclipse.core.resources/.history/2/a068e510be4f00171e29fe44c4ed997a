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

public class TablaHistorial extends JPanel {
	DAO dao = new DAO();
	private JTable table_1;
	/**
	 * Create the panel.
	 */
	public TablaHistorial() {
JButton buttonVolverHistorial = new JButton("<");
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(buttonVolverHistorial)
						.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(14, Short.MAX_VALUE)
					.addComponent(buttonVolverHistorial)
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		setLayout(groupLayout);
		
		
		String[] titulos ={"Login", "Nombre", "Apellidos", "Nivel", "Nacionalidad", "fecha"};
		String filas[] = new String[6] ;
		
		
        DefaultTableModel modelo= new DefaultTableModel(null, titulos);
	
		//Recorro la lista de la base de datos y añado cada personaje al modelo
		for (JugadorAntiguo jugador : dao.jugadoresAntiguos()) {
			
			filas[0]= jugador.getLogin();
			filas[1]= jugador.getNombre();
			filas[2]= jugador.getApellidos();
			filas[3]= jugador.getNivel();
			filas[4]= jugador.getNacionalidad();
			filas[5]= jugador.getFecha_baja();
			modelo.addRow(filas);
			
		}
		
		//le aplico el modelo
		table_1.setModel(modelo);
	
	}

}
