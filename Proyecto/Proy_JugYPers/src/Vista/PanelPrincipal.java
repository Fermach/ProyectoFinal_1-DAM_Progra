package Vista;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelPrincipal extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public PanelPrincipal() {
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Jugadores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Personaje", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
					.addGap(5))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
					.addGap(9))
		);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 198, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 257, Short.MAX_VALUE)
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblNewLabel = new JLabel("Login");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblNivel = new JLabel("Nivel");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JButton BotonAtras = new JButton("<");
		
		JButton BotonAdelante = new JButton(">");
		BotonAdelante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton AņadirBoton = new JButton("A\u00F1adir");
		
		JButton BorrarBoton = new JButton("Borrar");
		BorrarBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(BotonAtras, GroupLayout.PREFERRED_SIZE, 18, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(BotonAdelante, GroupLayout.PREFERRED_SIZE, 18, Short.MAX_VALUE)
									.addGap(28)
									.addComponent(BorrarBoton, 0, 48, Short.MAX_VALUE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(24)
											.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblNombre)
												.addComponent(lblNewLabel))
											.addGap(35)
											.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
												.addComponent(textField)
												.addComponent(textField_1)))
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblNivel)
												.addComponent(lblNacionalidad)
												.addComponent(lblApellidos))
											.addGap(36)
											.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
												.addComponent(textField_2)
												.addComponent(textField_3)
												.addComponent(textField_4))
											.addPreferredGap(ComponentPlacement.RELATED)))
									.addGap(5))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(119)
							.addComponent(AņadirBoton, GroupLayout.PREFERRED_SIZE, 78, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1)
						.addComponent(lblNombre))
					.addGap(14)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2)
						.addComponent(lblApellidos))
					.addGap(14)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNacionalidad)
						.addComponent(textField_3))
					.addGap(14)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_4)
						.addComponent(lblNivel))
					.addGap(28)
					.addComponent(AņadirBoton, GroupLayout.PREFERRED_SIZE, 4, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(BotonAtras)
							.addComponent(BotonAdelante))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(BorrarBoton, GroupLayout.PREFERRED_SIZE, 15, Short.MAX_VALUE)
							.addGap(8)))
					.addGap(0))
		);
		panel.setLayout(gl_panel);
		setLayout(groupLayout);

	}
}
