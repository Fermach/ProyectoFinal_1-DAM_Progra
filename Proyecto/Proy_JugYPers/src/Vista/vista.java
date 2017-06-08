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
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Mostrar Jugadores");
		menuJugadores.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Mostrar Jugadores alto nivel");
		menuJugadores.add(mntmNewMenuItem_1);
		
		JMenu menuPersonajes = new JMenu("Personajes");
		menuBar.add(menuPersonajes);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Mostrar");
		menuPersonajes.add(mntmNewMenuItem_2);
		
		JMenu menuHistorial = new JMenu("Historial");
		menuBar.add(menuHistorial);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		PanelPrincipal panel = new PanelPrincipal();
		contentPane.add(panel, BorderLayout.CENTER);
		
		
		
	}

}
