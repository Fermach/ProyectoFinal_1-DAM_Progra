package Controlador;

import java.util.Collections;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import Modelo.DAO.*;
import Vista.*;
import Modelo.DTO.*;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

/**
 * Este es el controlador de la aplicacion, el cual sirve para 
 * controlar nuestra vista y sus botones
 * @author Fermach
 * @version 1.0.
 * 
 */
 public class Controlador implements ActionListener {
	 private Vista vista;
	 private DAO dao;
	 private List<Jugador> listaJugador;
	 private List<Personaje> listaPersonajes;
	 private static int contador = 0;


   /**
    * Constructor del controlador
    * @param vista 
    * @param dao (es el que tiene los metodos para acceder a la bd)
    */
	public Controlador(Vista vista, DAO dao) {
		this.vista = vista;
		this.dao  = dao;
		actionListener(this);
		listaJugador = dao.listaJugadores();
		listaPersonajes = dao.listaPersonajes();
		mostrarJugador(0);
		mostrarPersonaje(0);
	}



	/**
	 * @param ActionEvent
	 * Respuesta a los eventos de la vista
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
	
		if (e.getActionCommand().equals(">")){
            //mostramor el jugador
			contador++;
			if (contador == listaJugador.size())
				contador= 0;
			mostrarJugador(contador);
			//mostramos el personaje asociado a ese jugador
			mostrarPersonaje(contador);
		}
		if (e.getActionCommand().equals("<")){
            //mostramor el jugador
			contador--;
			if (contador == 0)
				contador= listaJugador.size();
			mostrarJugador(contador);
			//mostramos el personaje asociado a ese jugador
			mostrarPersonaje(contador);
		}
	   if (e.getActionCommand().equals("Borrar")){
		   System.out.println("entra el if de borrar");
		 
           if(dao.borrarJugador(recogerJugador())==true){//tambien borra al personaje asociado a ese jugador gracias a la FK
		   listaJugador= dao.listaJugadores();
		   listaPersonajes = dao.listaPersonajes();
           }else{
        	   vista.getContentPane().removeAll();
        	   vista.getContentPane().add(vista.getErrorBorrado(), BorderLayout.CENTER);
        	   vista.repaint();
        	   vista.revalidate();
           }
		   
	   }
       if (e.getActionCommand().equals("Nuevo")){
		   habilitarTextField();
		   vista.getPantallaPrincipal().getTextFieldLogin2().setText("");
		   
	   }
       
       if (e.getActionCommand().equals("+")){
		   if(vista.getPantallaPrincipal().getTextFieldLogin().isEditable() == true) {
		   //Compruebo que el usuario ha pulsado el boton Nuvo antes para habilitar TextFields   	
    	   
		   Jugador ju = recogerJugador();   
		   Personaje pe = recogerPersonaje();
		   
    	   System.out.println("entra el if de +");
    	   System.out.println(ju);
    	   System.out.println(pe);
    	   //Controlo los datos que introduce el usuario
    	   if(ju.getLogin() != null || ju.getLogin() != "" ){
    	   if(ju.getNivel().equals("bajo") || ju.getNivel().equals("medio") || ju.getNivel().equals("alto")){
           if(pe.getTipo().equals("guerrero") || pe.getTipo().equals("mago") || pe.getTipo().equals("picaro")){
           if(pe.getRaza().equals("elfo") || pe.getRaza().equals("caballero_oscuro") || pe.getRaza().equals("nordico") || pe.getRaza().equals("argoniano")){
    	   if(pe.getSexo().equals("M") || pe.getSexo().equals("F")){ 
    	   
		     dao.a�adirJugador(ju);
		     dao.a�adirPersonaje(pe);  
		     listaJugador = dao.listaJugadores();
		     listaPersonajes =dao.listaPersonajes();
		     //System.out.println("Jugador y Personajes a�adidos");
		     deshabilitarTextField();
		   
    	   }else{
    	   System.out.println("Sexo erroneo: debe ser M o F");
    	   vista.getContentPane().removeAll();
    	   vista.getContentPane().add(vista.getErrorInsercion(), BorderLayout.CENTER);
    	   vista.repaint();
    	   vista.revalidate();
    	   deshabilitarTextField();
    	   mostrarJugador(contador++);
    	   mostrarPersonaje(contador++);
    	   }
    	   }else{
    	   System.out.println("Raza erronea: debe ser elfo, caballero_oscuro, nordico o argoniano"); 
           vista.getContentPane().removeAll();
    	   vista.getContentPane().add(vista.getErrorInsercion(), BorderLayout.CENTER);
    	   vista.repaint();
    	   vista.revalidate();
    	   deshabilitarTextField();
    	   mostrarJugador(contador++);
    	   mostrarPersonaje(contador++);
    	   }
           }else{
           System.out.println("Tipo errorneo: debe ser guerrero, mago o picaro"); 
           vista.getContentPane().removeAll();
    	   vista.getContentPane().add(vista.getErrorInsercion(), BorderLayout.CENTER);
    	   vista.repaint();
    	   vista.revalidate();
    	   deshabilitarTextField();
    	   mostrarJugador(contador++);
    	   mostrarPersonaje(contador++);
           }
           }else{
    	   System.out.println("Nivel erroneo: debe ser bajo, medio o alto");
    	   vista.getContentPane().removeAll();
    	   vista.getContentPane().add(vista.getErrorInsercion(), BorderLayout.CENTER);
    	   vista.repaint();
    	   vista.revalidate();
    	   deshabilitarTextField();
    	   mostrarJugador(contador++);
    	   mostrarPersonaje(contador++);
           }
    	   }else{
    	   System.out.println("Login no valido");
    	   vista.getContentPane().removeAll();
    	   vista.getContentPane().add(vista.getErrorInsercion(), BorderLayout.CENTER);
    	   vista.repaint();
    	   vista.revalidate();
    	   deshabilitarTextField();
    	   mostrarJugador(contador++);
    	   mostrarPersonaje(contador++);
    	   }
    	   }else{
			   
			   System.out.println("Debe pulsar \"Nuevo\" antes !!");
		   }  
		     
	   }
       
       if(e.getActionCommand().equals("<<")){
    	   vista.getContentPane().removeAll();
    	   vista.getContentPane().add(vista.getPantallaPrincipal(), BorderLayout.CENTER);
    	   vista.repaint();
    	   vista.revalidate();
       }
       
       if(e.getActionCommand().equals("Mostrar Jugadores")){
    	   actualizarJTableJugadores();
    	   vista.getContentPane().removeAll();
    	   vista.getContentPane().add(vista.getTjugadores(), BorderLayout.CENTER);
    	   vista.repaint();
    	   vista.revalidate();
       }
       if(e.getActionCommand().equals("Mostrar Jugadores con nivel")){
    	   actualizarJTableJugAvanzados();
    	   vista.getContentPane().removeAll();
    	   vista.getContentPane().add(vista.getTjugnivAlto(), BorderLayout.CENTER);
    	   vista.repaint();
    	   vista.revalidate();
       }
       if(e.getActionCommand().equals("Mostrar Personajes")){
    	   actualizarJTablePersonajes();
    	   vista.getContentPane().removeAll();
    	   vista.getContentPane().add(vista.getTpersonajes(), BorderLayout.CENTER);
    	   vista.repaint();
    	   vista.revalidate();
       }
       if(e.getActionCommand().equals("Lista de Guerreros")){
    	   actualizarJTableGuerreros();
    	   vista.getContentPane().removeAll();
    	   vista.getContentPane().add(vista.getTguerreros(), BorderLayout.CENTER);
    	   vista.repaint();
    	   vista.revalidate();
       }
       if(e.getActionCommand().equals("Lista de Magos")){
    	   actualizarJTableMagos();
    	   vista.getContentPane().removeAll();
    	   vista.getContentPane().add(vista.getTmagos(), BorderLayout.CENTER);
    	   vista.repaint();
    	   vista.revalidate();
       }
       if(e.getActionCommand().equals("Lista de Picaros")){
    	   actualizarJTablePicaros();
    	   vista.getContentPane().removeAll();
    	   vista.getContentPane().add(vista.getTpicaros(), BorderLayout.CENTER);
    	   vista.repaint();
    	   vista.revalidate();
       }
       if(e.getActionCommand().equals("Jugadores Antiguos")){
    	   actualizarJTableHistorial();
    	   vista.getContentPane().removeAll();
    	   vista.getContentPane().add(vista.getThistorial(), BorderLayout.CENTER);
    	   vista.repaint();
    	   vista.revalidate();
       }
      
       
       
       }
       
 
	
	/**
	 * Registro los eventos de la vista
	 * @param escuchador
	 */
	public void actionListener(ActionListener escuchador){
		vista.getPantallaPrincipal().getBotonAtras().addActionListener(escuchador);
		vista.getPantallaPrincipal().getBotonAdelante().addActionListener(escuchador);
		vista.getPantallaPrincipal().getButtonmas().addActionListener(escuchador);
		vista.getPantallaPrincipal().getBorrarBoton().addActionListener(escuchador);
		vista.getPantallaPrincipal().getA�adirBoton().addActionListener(escuchador);
		vista.getMntmNewMenuMostrarJugadores().addActionListener(escuchador);
		vista.getMntmJugadoresAntiguos().addActionListener(escuchador);
		vista.getMntmNewMenuPersonajes().addActionListener(escuchador);
		vista.getMntmListaDeGuerreros().addActionListener(escuchador);
		vista.getMntmListaDeMagos().addActionListener(escuchador);
		vista.getMntmListaDePicaros().addActionListener(escuchador);
		vista.getMntmJugadoresAntiguos().addActionListener(escuchador);
		vista.getMntmNewMenuJAltoNivel().addActionListener(escuchador);
		vista.getTpersonajes().getButtonAtrasPersonajes().addActionListener(escuchador);
		vista.getTjugadores().getButtonAtrasJugadores().addActionListener(escuchador);
		vista.getThistorial().getButtonAtrasHistorial().addActionListener(escuchador);
		vista.getTguerreros().getBtnNewButtonAtrasGuerreros().addActionListener(escuchador);
		vista.getTmagos().getButtonAtrasMagos().addActionListener(escuchador);
		vista.getTpicaros().getButtonVolverPicaros().addActionListener(escuchador);
		vista.getTjugnivAlto().getButtonAtrasJugAtoNiv().addActionListener(escuchador);
		vista.getErrorInsercion().getButtonErrorInsercion().addActionListener(escuchador);
		vista.getErrorBorrado().getButtonErrorBorrado().addActionListener(escuchador);
		
	}
	/**
	 * Muestra el jugador de la lista del DAO en nuestra interfaz
	 * @param indice
	 */
	private void mostrarJugador(int indice){
		vista.getPantallaPrincipal().getTextFieldLogin().setText(
				listaJugador.get(indice).getLogin());
		vista.getPantallaPrincipal().getTextFieldNombre().setText(
				listaJugador.get(indice).getNombre());
		vista.getPantallaPrincipal().getTextFieldApellidos().setText(
				listaJugador.get(indice).getApellidos());
		vista.getPantallaPrincipal().getTextFieldNivel().setText(
				listaJugador.get(indice).getNivel());
		vista.getPantallaPrincipal().getTextFieldNacionalidad().setText(
				listaJugador.get(indice).getNacionalidad());
	}
	
	/**
	 * Muestra el jugador de la lista del DAO en nuestra interfaz
	 * @param indice
	 */
	private void mostrarPersonaje(int indice){
		vista.getPantallaPrincipal().getTextFieldNombre2().setText(
				listaPersonajes.get(indice).getNombre());
		vista.getPantallaPrincipal().getTextFieldLogin2().setText(
				listaPersonajes.get(indice).getLogin());
		vista.getPantallaPrincipal().getTextFieldTipo().setText(
				listaPersonajes.get(indice).getTipo());
		vista.getPantallaPrincipal().getTextFieldRaza().setText(
				listaPersonajes.get(indice).getRaza());
		vista.getPantallaPrincipal().getTextFieldSexo().setText(
				listaPersonajes.get(indice).getSexo());
	}

	private void habilitarTextField(){
		vista.getPantallaPrincipal().getTextFieldNombre().setEditable(true);
		vista.getPantallaPrincipal().getTextFieldApellidos().setEditable(true);
		vista.getPantallaPrincipal().getTextFieldLogin().setEditable(true);
		vista.getPantallaPrincipal().getTextFieldNacionalidad().setEditable(true);
		vista.getPantallaPrincipal().getTextFieldNivel().setEditable(true);
		vista.getPantallaPrincipal().getTextFieldNombre2().setEditable(true);
		vista.getPantallaPrincipal().getTextFieldTipo().setEditable(true);
		vista.getPantallaPrincipal().getTextFieldRaza().setEditable(true);
		vista.getPantallaPrincipal().getTextFieldSexo().setEditable(true);
	}
	private void deshabilitarTextField(){
		vista.getPantallaPrincipal().getTextFieldNombre().setEditable(false);
		vista.getPantallaPrincipal().getTextFieldApellidos().setEditable(false);
		vista.getPantallaPrincipal().getTextFieldLogin().setEditable(false);
		vista.getPantallaPrincipal().getTextFieldNacionalidad().setEditable(false);
		vista.getPantallaPrincipal().getTextFieldNivel().setEditable(false);
		vista.getPantallaPrincipal().getTextFieldNombre2().setEditable(false);
		vista.getPantallaPrincipal().getTextFieldTipo().setEditable(false);
		vista.getPantallaPrincipal().getTextFieldRaza().setEditable(false);
		vista.getPantallaPrincipal().getTextFieldSexo().setEditable(false);
	}
	
	/**
	 * Recogemos los datos del jugador introducidos en los TextsFields
	 * @return jugador
	 */
	private Jugador recogerJugador(){
		
		
		String login = vista.getPantallaPrincipal().getTextFieldLogin().getText();
		String nombre = vista.getPantallaPrincipal().getTextFieldNombre().getText();
		String apellidos = vista.getPantallaPrincipal().getTextFieldApellidos().getText();
		String nivel = vista.getPantallaPrincipal().getTextFieldNivel().getText().toLowerCase().trim();
		String nacionalidad = vista.getPantallaPrincipal().getTextFieldNacionalidad().getText();
		
		Jugador jugador = new Jugador(login, nombre, apellidos, nivel, nacionalidad);
		return jugador;
	}
	
	/**
	 * Recogemos los datos del personaje introducidos en los TextsFields
	 * @return personaje
	 */
	private Personaje recogerPersonaje(){
		
		String nombre = vista.getPantallaPrincipal().getTextFieldNombre2().getText();
		String login = vista.getPantallaPrincipal().getTextFieldLogin().getText();
		String tipo = vista.getPantallaPrincipal().getTextFieldTipo().getText().toLowerCase().trim();
		String raza = vista.getPantallaPrincipal().getTextFieldRaza().getText().toLowerCase().trim();
		String sexo = vista.getPantallaPrincipal().getTextFieldSexo().getText().trim();
		
		//a la hora de introducir un personaje, recoge los datos introducidos.
		//PERO RECOGE el LOGIN DEL JUGADOR, YA QUE DEBEN SER IGUALES
		Personaje personaje = new Personaje(nombre, login, tipo, raza, sexo);
		return personaje;
	}
	
	//obtiene el modelo del JTABLE a partir de nuestro DAO
	 public void actualizarJTableHistorial(){
			
		   String filas[] = new String[6] ;
		   String[] titulos ={"Login", "Nombre", "Apellidos", "Nivel", "Nacionalidad", "Fecha"};
		   vista.getThistorial().setModelo(new DefaultTableModel(null, titulos));
	       //Recorro la lista de la base de datos y a�ado cada personaje al modelo
			for (JugadorAntiguo jugador : dao.jugadoresAntiguos()) {
				
				filas[0]= jugador.getLogin();
				filas[1]= jugador.getNombre();
				filas[2]= jugador.getApellidos();
				filas[3]= jugador.getNivel();
				filas[4]= jugador.getNacionalidad();
				filas[5]= jugador.getFecha_baja();
				
				vista.getThistorial().getModelo().addRow(filas);

			}
			
			//le aplico el modelo
			vista.getThistorial().getTable_1().setModel(vista.getThistorial().getModelo());
	}
	public void actualizarJTablePersonajes(){
		
	      String[] titulos ={ "Nombre", "Login" ,"Tipo", "Raza", "Sexo"};
	      String fila[] = new String[5];
		  vista.getTpersonajes().setModelo(new DefaultTableModel(null, titulos));
	      //Recorro la lista de la base de datos y a�ado cada personaje al modelo
			for (Personaje personaje : dao.listaPersonajes()) {
				
				fila[0]= personaje.getNombre();
				fila[1]= personaje.getLogin();
				fila[2]= personaje.getTipo();
				fila[3]= personaje.getRaza();
				fila[4]= personaje.getSexo();
				
				vista.getTpersonajes().getModelo().addRow(fila);

			}
			
			//le aplico el modelo
			vista.getTpersonajes().getTable().setModel(vista.getTpersonajes().getModelo());
	}
	public void actualizarJTableGuerreros(){
			
	      String[] titulos ={ "Nombre", "Login" ,"Tipo", "Raza", "Sexo"};
	      String fila[] = new String[5];
		  vista.getTguerreros().setModelo(new DefaultTableModel(null, titulos));
	      //Recorro la lista de la base de datos y a�ado cada personaje al modelo
			for (Personaje personaje : dao.listaGuerreros()) {
				
				fila[0]= personaje.getNombre();
				fila[1]= personaje.getLogin();
				fila[2]= personaje.getTipo();
				fila[3]= personaje.getRaza();
				fila[4]= personaje.getSexo();
				
				vista.getTguerreros().getModelo().addRow(fila);

			}
			
			//le aplico el modelo
			vista.getTguerreros().getTable().setModel(vista.getTguerreros().getModelo());
	}
	
	public void actualizarJTableMagos(){
			
	      String[] titulos ={ "Nombre", "Login" ,"Tipo", "Raza", "Sexo"};
	      String fila[] = new String[5];
		  vista.getTmagos().setModelo(new DefaultTableModel(null, titulos));
	      //Recorro la lista de la base de datos y a�ado cada personaje al modelo
			for (Personaje personaje : dao.listaMagos()) {
				
				fila[0]= personaje.getNombre();
				fila[1]= personaje.getLogin();
				fila[2]= personaje.getTipo();
				fila[3]= personaje.getRaza();
				fila[4]= personaje.getSexo();
				
				vista.getTmagos().getModelo().addRow(fila);

			}
			
			//le aplico el modelo
			vista.getTmagos().getTable().setModel(vista.getTmagos().getModelo());
	}
    public void actualizarJTablePicaros(){
	
      String[] titulos ={ "Nombre", "Login" ,"Tipo", "Raza", "Sexo"};
      String fila[] = new String[5];
	  vista.getTpicaros().setModelo(new DefaultTableModel(null, titulos));
      //Recorro la lista de la base de datos y a�ado cada personaje al modelo
		for (Personaje personaje : dao.listaPicaros()) {
			
			fila[0]= personaje.getNombre();
			fila[1]= personaje.getLogin();
			fila[2]= personaje.getTipo();
			fila[3]= personaje.getRaza();
			fila[4]= personaje.getSexo();
			
			vista.getTpicaros().getModelo().addRow(fila);

		}
		
		//le aplico el modelo
		vista.getTpicaros().getTable().setModel(vista.getTpicaros().getModelo());
}
    public void actualizarJTableJugAvanzados(){
	
	   String filas[] = new String[5] ;
	   String[] titulos ={"Login", "Nombre", "Apellidos", "Nivel", "Nacionalidad"};
	   vista.getTjugnivAlto().setModelo(new DefaultTableModel(null, titulos));
       //Recorro la lista de la base de datos y a�ado cada personaje al modelo
		 for (Jugador jugador : dao.jugadoresNivelAlto()) {
			
			filas[0]= jugador.getLogin();
			filas[1]= jugador.getNombre();
			filas[2]= jugador.getApellidos();
			filas[3]= jugador.getNivel();
			filas[4]= jugador.getNacionalidad();
			
			vista.getTjugnivAlto().getModelo().addRow(filas);

	    	}
		
		  //le aplico el modelo
		  vista.getTjugnivAlto().getTable().setModel(vista.getTjugnivAlto().getModelo());
}
     public void actualizarJTableJugadores(){
	
	   String filas[] = new String[5] ;
	   String[] titulos ={"Login", "Nombre", "Apellidos", "Nivel", "Nacionalidad"};
	   vista.getTjugadores().setModelo(new DefaultTableModel(null, titulos));
       //Recorro la lista de la base de datos y a�ado cada personaje al modelo
		for (Jugador jugador : dao.listaJugadores()) {
			
			filas[0]= jugador.getLogin();
			filas[1]= jugador.getNombre();
			filas[2]= jugador.getApellidos();
			filas[3]= jugador.getNivel();
			filas[4]= jugador.getNacionalidad();
			
			vista.getTjugadores().getModelo().addRow(filas);

		}
		
		//le aplico el modelo
		vista.getTjugadores().getTable_1().setModel(vista.getTjugadores().getModelo());
}
     
}