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
import Modelo.DTO.Jugador;
import Modelo.DTO.Personaje;

public class TablaJugadoresAltoNivel extends JPanel {

	private JTable table;
    DAO dao= new DAO();
    
	JButton buttonAtrasJugAtoNiv = new JButton("<");


	public JButton getButtonAtrasJugAtoNiv() {
		return buttonAtrasJugAtoNiv;
	}


	public void setButtonAtrasJugAtoNiv(JButton buttonAtrasJugAtoNiv) {
		this.buttonAtrasJugAtoNiv = buttonAtrasJugAtoNiv;
	}


	/**
	 * Create the panel.
	 */
	public TablaJugadoresAltoNivel() {
		
		JScrollPane scrollPane = new JScrollPane();
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(buttonAtrasJugAtoNiv, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(369))
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 410, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(23, Short.MAX_VALUE)
					.addComponent(buttonAtrasJugAtoNiv)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		setLayout(groupLayout);
        
		String[] titulos ={"Login", "Nombre", "Apellidos", "Nivel", "Nacionalidad"};
		String fila[] = new String[5] ;
		
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        
      //Recorro la lista de la base de datos y a�ado cada personaje al modelo
        for (Jugador j : dao.listaJugadores()) {
        	
        	fila[0] = j.getLogin();
        	fila[1] = j.getNombre();
        	fila[2] = j.getApellidos();
        	fila[3] = j.getNivel();
        	fila[4] = j.getNacionalidad();
			modelo.addRow(fila);
		}
        
        //aplico el modelo
        table.setModel(modelo);
	}
		
	}


