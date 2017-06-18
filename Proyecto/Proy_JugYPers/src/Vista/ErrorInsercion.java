package Vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
/**
 * Panel de error en la Insercion de la base de datos
 * @author Fermach
 * @version 1.0.
 */
public class ErrorInsercion extends JPanel {

	
	JButton buttonErrorInsercion = new JButton("<<");
	
	public JButton getButtonErrorInsercion() {
		return buttonErrorInsercion;
	}

	public void setButtonErrorInsercion(JButton buttonErrorInsercion) {
		this.buttonErrorInsercion = buttonErrorInsercion;
	}

	/**
	 * Create the panel.
	 */
	public ErrorInsercion() {
		
		JTextPane txtpnErrorEnEl = new JTextPane();
		txtpnErrorEnEl.setForeground(Color.DARK_GRAY);
		txtpnErrorEnEl.setFont(new Font("Source Code Pro Light", Font.BOLD, 13));
		txtpnErrorEnEl.setText("Error en la Insercion de la base de datos.");
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(353, Short.MAX_VALUE)
					.addComponent(buttonErrorInsercion)
					.addGap(48))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(27)
					.addComponent(txtpnErrorEnEl, GroupLayout.PREFERRED_SIZE, 392, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(31, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(119)
					.addComponent(txtpnErrorEnEl, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
					.addComponent(buttonErrorInsercion)
					.addGap(56))
		);
		setLayout(groupLayout);

	}
}
