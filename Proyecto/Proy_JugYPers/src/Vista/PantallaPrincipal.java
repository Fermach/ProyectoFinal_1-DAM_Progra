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
	JButton AņadirBoton = new JButton("Nuevo");
	JButton BorrarBoton = new JButton("Borrar");
	JButton BotonAdelante = new JButton(">");
	JButton buttonmas = new JButton("+");
	
	
	public JTextField getTextFieldLogin() {
		return textFieldLogin;
	}



	public void setTextFieldLogin(JTextField textFieldLogin) {
		this.textFieldLogin = textFieldLogin;
	}



	public JTextField getTextFieldNombre() {
		return textFieldNombre;
	}



	public void setTextFieldNombre(JTextField textFieldNombre) {
		this.textFieldNombre = textFieldNombre;
	}



	public JTextField getTextFieldApellidos() {
		return textFieldApellidos;
	}



	public void setTextFieldApellidos(JTextField textFieldApellidos) {
		this.textFieldApellidos = textFieldApellidos;
	}



	public JTextField getTextFieldNacionalidad() {
		return textFieldNacionalidad;
	}



	public void setTextFieldNacionalidad(JTextField textFieldNacionalidad) {
		this.textFieldNacionalidad = textFieldNacionalidad;
	}



	public JTextField getTextFieldNivel() {
		return textFieldNivel;
	}



	public void setTextFieldNivel(JTextField textFieldNivel) {
		this.textFieldNivel = textFieldNivel;
	}



	public JTextField getTextFieldNombre2() {
		return textFieldNombre2;
	}



	public void setTextFieldNombre2(JTextField textFieldNombre2) {
		this.textFieldNombre2 = textFieldNombre2;
	}



	public JTextField getTextFieldTipo() {
		return textFieldTipo;
	}



	public void setTextFieldTipo(JTextField textFieldTipo) {
		this.textFieldTipo = textFieldTipo;
	}

	
	public JButton getButtonmas() {
		return buttonmas;
	}


	public void setButtonmas(JButton buttonmas) {
		this.buttonmas = buttonmas;
	}

	
	public JTextField getTextFieldRaza() {
		return textFieldRaza;
	}



	public void setTextFieldRaza(JTextField textFieldRaza) {
		this.textFieldRaza = textFieldRaza;
	}



	public JTextField getTextFieldSexo() {
		return textFieldSexo;
	}



	public void setTextFieldSexo(JTextField textFieldSexo) {
		this.textFieldSexo = textFieldSexo;
	}



	public JTextField getTextFieldLogin2() {
		return textFieldLogin2;
	}



	public void setTextFieldLogin2(JTextField textFieldLogin2) {
		this.textFieldLogin2 = textFieldLogin2;
	}



	public JButton getBotonAtras() {
		return BotonAtras;
	}



	public void setBotonAtras(JButton botonAtras) {
		BotonAtras = botonAtras;
	}



	public JButton getAņadirBoton() {
		return AņadirBoton;
	}



	public void setAņadirBoton(JButton aņadirBoton) {
		AņadirBoton = aņadirBoton;
	}



	public JButton getBorrarBoton() {
		return BorrarBoton;
	}



	public void setBorrarBoton(JButton borrarBoton) {
		BorrarBoton = borrarBoton;
	}



	public JButton getBotonAdelante() {
		return BotonAdelante;
	}



	public void setBotonAdelante(JButton botonAdelante) {
		BotonAdelante = botonAdelante;
	}



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
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
					.addGap(30))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
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
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_5)
							.addGap(18)
							.addComponent(textFieldLogin2, 62, 62, 62)
							.addGap(21))
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
									.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
										.addComponent(lblNewLabel_4)
										.addGap(40))
									.addGroup(gl_panel_1.createSequentialGroup()
										.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
										.addGap(30)))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNewLabel_2)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
									.addComponent(textFieldRaza, 74, 74, Short.MAX_VALUE)
									.addComponent(textFieldSexo, 0, 0, Short.MAX_VALUE)
									.addComponent(textFieldNombre2, 0, 0, Short.MAX_VALUE))
								.addComponent(textFieldTipo, 0, 0, Short.MAX_VALUE))))
					.addGap(38))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(25)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldNombre2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textFieldTipo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(textFieldRaza, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(textFieldSexo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(textFieldLogin2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNombre)
										.addComponent(lblNewLabel))
									.addGap(35)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(textFieldLogin, 63, 63, 63)
										.addComponent(textFieldNombre, 63, 63, 63)))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNivel)
										.addComponent(lblNacionalidad)
										.addComponent(lblApellidos))
									.addGap(36)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(textFieldApellidos, 63, 63, 63)
										.addComponent(textFieldNacionalidad, 63, 63, 63)
										.addComponent(textFieldNivel, 63, 63, 63))
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGap(5))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(BotonAtras, GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(BotonAdelante, GroupLayout.PREFERRED_SIZE, 52, Short.MAX_VALUE)
							.addGap(9)
							.addComponent(BorrarBoton))
						.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
							.addGap(37)
							.addComponent(AņadirBoton, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(buttonmas, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)))
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
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(buttonmas)
						.addComponent(AņadirBoton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(BotonAtras)
						.addComponent(BotonAdelante)
						.addComponent(BorrarBoton, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
					.addGap(8))
		);
		panel.setLayout(gl_panel);
		setLayout(groupLayout);

	}



	
}
