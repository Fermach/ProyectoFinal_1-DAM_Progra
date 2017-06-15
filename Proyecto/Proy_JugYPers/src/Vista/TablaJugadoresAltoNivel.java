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
    String[] titulos ={"Login", "Nombre", "Apellidos", "Nivel", "Nacionalidad"};
	String fila[] = new String[5] ;
	
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


	JButton buttonAtrasJugAtoNiv = new JButton("<<");


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
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(buttonAtrasJugAtoNiv, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(6)
					.addComponent(buttonAtrasJugAtoNiv)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		setLayout(groupLayout);
        
		
        
      
	}
		
	}


