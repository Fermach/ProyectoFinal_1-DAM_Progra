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

public class PantallaPrincipal extends JPanel {
	private JTextField textFieldLogin;
	private JTextField textFieldNombre;
	private JTextField textFieldApellidos;
	private JTextField textFieldNacionalidad;
	private JTextField textFieldNivel;
	private JTextField textFieldNombre2;
	private JTextField textFieldTipo;
	private JTextField textFieldRaza;
	private JTextField textFieldSexo;
	private JTextField textFieldLogin2;

	JButton BotonAtras = new JButton("<");
	JButton AņadirBoton = new JButton("A\u00F1adir");
	JButton BorrarBoton = new JButton("Borrar");
	JButton BotonAdelante = new JButton(">");
	/**
	 * Create the panel.
	 */
	public PantallaPrincipal() {
		
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
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		
		JLabel lblNewLabel_2 = new JLabel("Tipo");
		
		JLabel lblNewLabel_3 = new JLabel("Raza");
		
		JLabel lblNewLabel_4 = new JLabel("Sexo");
		
		JLabel lblNewLabel_5 = new JLabel("Login");
		
		textFieldNombre2 = new JTextField();
		textFieldNombre2.setEditable(false);
		textFieldNombre2.setColumns(10);
		
		textFieldTipo = new JTextField();
		textFieldTipo.setEditable(false);
		textFieldTipo.setColumns(10);
		
		textFieldRaza = new JTextField();
		textFieldRaza.setEditable(false);
		textFieldRaza.setColumns(10);
		
		textFieldSexo = new JTextField();
		textFieldSexo.setEditable(false);
		textFieldSexo.setColumns(10);
		
		textFieldLogin2 = new JTextField();
		textFieldLogin2.setEditable(false);
		textFieldLogin2.setColumns(10);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(textFieldNombre2))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addGap(44)
							.addComponent(textFieldTipo))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(textFieldRaza))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_4)
							.addGap(40)
							.addComponent(textFieldSexo))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_5)
							.addGap(18)
							.addComponent(textFieldLogin2)
							.addGap(21)))
					.addGap(38))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textFieldNombre2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(textFieldTipo))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(textFieldRaza))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(textFieldSexo))
					.addGap(30)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(textFieldLogin2))
					.addGap(69))
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblNewLabel = new JLabel("Login");
		
		textFieldLogin = new JTextField();
		textFieldLogin.setEditable(false);
		textFieldLogin.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		
		textFieldNombre = new JTextField();
		textFieldNombre.setEditable(false);
		textFieldNombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		
		textFieldApellidos = new JTextField();
		textFieldApellidos.setEditable(false);
		textFieldApellidos.setColumns(10);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		
		textFieldNacionalidad = new JTextField();
		textFieldNacionalidad.setEditable(false);
		textFieldNacionalidad.setColumns(10);
		
		JLabel lblNivel = new JLabel("Nivel");
		
		textFieldNivel = new JTextField();
		textFieldNivel.setEditable(false);
		textFieldNivel.setColumns(10);
		
		
		BotonAdelante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		BorrarBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(AņadirBoton)
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(24)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNombre)
										.addComponent(lblNewLabel))
									.addGap(35)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(textFieldLogin)
										.addComponent(textFieldNombre)))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNivel)
										.addComponent(lblNacionalidad)
										.addComponent(lblApellidos))
									.addGap(36)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(textFieldApellidos)
										.addComponent(textFieldNacionalidad)
										.addComponent(textFieldNivel))
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGap(5))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(BotonAtras, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(BotonAdelante, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(28)
							.addComponent(BorrarBoton, 0, 71, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textFieldLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre))
					.addGap(14)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldApellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblApellidos))
					.addGap(14)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNacionalidad)
						.addComponent(textFieldNacionalidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldNivel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNivel))
					.addGap(20)
					.addComponent(AņadirBoton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(BotonAtras)
							.addComponent(BotonAdelante))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(BorrarBoton, GroupLayout.PREFERRED_SIZE, 26, Short.MAX_VALUE)
							.addGap(8)))
					.addGap(0))
		);
		panel.setLayout(gl_panel);
		setLayout(groupLayout);

	}
}
