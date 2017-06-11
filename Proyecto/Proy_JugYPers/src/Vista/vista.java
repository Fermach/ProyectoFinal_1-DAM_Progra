package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class vista extends JFrame {

	private JPanel contentPane;
	JMenuItem mntmNewMenuMostrarJugadores = new JMenuItem("Mostrar Jugadores");
	JMenuItem mntmNewMenuJAltoNivel = new JMenuItem("Mostrar Jugadores alto nivel");
	JMenuItem mntmNewMenuPersonajes = new JMenuItem("Mostrar Personajes");
	JMenuItem mntmListaDeGuerreros = new JMenuItem("Lista de Guerreros");
	JMenuItem mntmListaDeMagos = new JMenuItem("Lista de Magos");
	JMenuItem mntmListaDePicaros = new JMenuItem("Lista de Picaros");
	JMenuItem mntmJugadoresAntiguos = new JMenuItem("Jugadores Antiguos");
	
	public JMenuItem getMntmNewMenuMostrarJugadores() {
		return mntmNewMenuMostrarJugadores;
	}

	public void setMntmNewMenuMostrarJugadores(JMenuItem mntmNewMenuMostrarJugadores) {
		this.mntmNewMenuMostrarJugadores = mntmNewMenuMostrarJugadores;
	}

	public JMenuItem getMntmNewMenuJAltoNivel() {
		return mntmNewMenuJAltoNivel;
	}

	public void setMntmNewMenuJAltoNivel(JMenuItem mntmNewMenuJAltoNivel) {
		this.mntmNewMenuJAltoNivel = mntmNewMenuJAltoNivel;
	}

	public JMenuItem getMntmNewMenuPersonajes() {
		return mntmNewMenuPersonajes;
	}

	public void setMntmNewMenuPersonajes(JMenuItem mntmNewMenuPersonajes) {
		this.mntmNewMenuPersonajes = mntmNewMenuPersonajes;
	}

	public JMenuItem getMntmListaDeGuerreros() {
		return mntmListaDeGuerreros;
	}

	public void setMntmListaDeGuerreros(JMenuItem mntmListaDeGuerreros) {
		this.mntmListaDeGuerreros = mntmListaDeGuerreros;
	}

	public JMenuItem getMntmListaDeMagos() {
		return mntmListaDeMagos;
	}

	public void setMntmListaDeMagos(JMenuItem mntmListaDeMagos) {
		this.mntmListaDeMagos = mntmListaDeMagos;
	}

	public JMenuItem getMntmListaDePicaros() {
		return mntmListaDePicaros;
	}

	public void setMntmListaDePicaros(JMenuItem mntmListaDePicaros) {
		this.mntmListaDePicaros = mntmListaDePicaros;
	}

	public JMenuItem getMntmJugadoresAntiguos() {
		return mntmJugadoresAntiguos;
	}

	public void setMntmJugadoresAntiguos(JMenuItem mntmJugadoresAntiguos) {
		this.mntmJugadoresAntiguos = mntmJugadoresAntiguos;
	}

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vista frame = new vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 340);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuJugadores = new JMenu("Jugadores");
		menuBar.add(menuJugadores);
		
		
		menuJugadores.add(mntmNewMenuMostrarJugadores);
		
		
		menuJugadores.add(mntmNewMenuJAltoNivel);
		
		JMenu menuPersonajes = new JMenu("Personajes");
		menuBar.add(menuPersonajes);
		
		
		menuPersonajes.add(mntmNewMenuPersonajes);
		
		
		menuPersonajes.add(mntmListaDeGuerreros);
		
		
		menuPersonajes.add(mntmListaDeMagos);
		
		menuPersonajes.add(mntmListaDePicaros);
		
		JMenu menuHistorial = new JMenu("Historial");
		menuBar.add(menuHistorial);
		
		
		menuHistorial.add(mntmJugadoresAntiguos);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		PantallaPrincipal panel = new PantallaPrincipal();
		contentPane.add(panel, BorderLayout.CENTER);
		
		//TablaJugadores Tjugadores = new TablaJugadores();
	    //contentPane.add(Tjugadores, BorderLayout.CENTER);
		
		//TablaPersonajes Tpersonajes = new TablaPersonajes();
	    //contentPane.add(Tpersonajes, BorderLayout.CENTER);
	     
		//TablaGuerreros Tguerreros= new TablaGuerreros();
	    //contentPane.add(Tguerreros, BorderLayout.CENTER);
		
		//TablaHistorial Thistorial = new TablaHistorial();
	    //contentPane.add(Thistorial, BorderLayout.CENTER);
	}

}