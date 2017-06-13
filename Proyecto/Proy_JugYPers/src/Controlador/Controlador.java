package Controlador;

import java.util.Collections;
import java.util.List;

import Modelo.DAO.*;
import Vista.*;
import Modelo.DTO.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;


public class Controlador implements ActionListener {
	private Vista vista;
	private DAO dao;
	private List<Jugador> listaJugador;
	private List<Personaje> listaPersonajes;
	private static int contador = 0;



	public Controlador(Vista vista, DAO dao) {
		this.vista = vista;
		this.dao  = dao;
		actionListener(this);
		listaJugador = dao.listaJugadores();
		listaPersonajes = dao.listaPersonajes();
		mostrarJugador(0);
		mostrarPersonaje(0);
	}



	//respuesta a los eventos de la vista
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
	   if (e.getActionCommand().equals("borrar")){
		   dao.borrarJugador(recogerJugador());
		   dao.borrarPersonaje(recogerPersonaje());
		   mostrarJugador(contador++);
		   mostrarPersonaje(contador++);
		   
	   }
       if (e.getActionCommand().equals("Nuevo")){
		   habilitarTextField();
		   vista.getPantallaPrincipal().getTextFieldLogin2().setText("");
		   
	   }
       if (e.getActionCommand().equals("+")){
		 //  System.out.println("entra el if");
		     dao.a�adirJugador(recogerJugador());
		     dao.a�adirPersonaje(recogerPersonaje());  
		     System.out.println("Jugador y Personajes a�adidos");
		     deshabilitarTextField();
		     mostrarJugador(contador++);
			 mostrarPersonaje(contador++);
	   }
       if(e.getActionCommand().equals("Mostrar Jugadores")){
    	   
    	 
    	   
       }
       
       
       
       }
       
 
	
	//registro los eventos de la vista
	public void actionListener(ActionListener escuchador){
		vista.getPantallaPrincipal().getBotonAtras().addActionListener(escuchador);
		vista.getPantallaPrincipal().getBotonAdelante().addActionListener(escuchador);
		vista.getPantallaPrincipal().getBorrarBoton().addActionListener(escuchador);
		vista.getPantallaPrincipal().getA�adirBoton().addActionListener(escuchador);
		vista.getMntmNewMenuMostrarJugadores().addActionListener(escuchador);
		vista.getMntmJugadoresAntiguos().addActionListener(escuchador);
		vista.getMntmNewMenuPersonajes().addActionListener(escuchador);
		vista.getMntmListaDeGuerreros().addActionListener(escuchador);
		vista.getMntmListaDeMagos().addActionListener(escuchador);
		vista.getMntmListaDePicaros().addActionListener(escuchador);
		vista.getMntmJugadoresAntiguos().addActionListener(escuchador);
		vista.getTpersonajes().getButtonAtrasPersonajes().addActionListener(escuchador);
		vista.getTjugadores().getButtonAtrasJugadores().addActionListener(escuchador);
		vista.getThistorial().getButtonAtrasHistorial().addActionListener(escuchador);
		vista.getTguerreros().getBtnNewButtonAtrasGuerreros().addActionListener(escuchador);
		vista.getTmagos().getButtonAtrasMagos().addActionListener(escuchador);
		vista.getTpicaros().getButtonVolverPicaros().addActionListener(escuchador);
		vista.getTjugnivAlto().getButtonAtrasJugAtoNiv().addActionListener(escuchador);
		
		
		
	}
	
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
	
	//recogemos los datos del jugador
	private Jugador recogerJugador(){
		Jugador jugador=null;
		
		String login = vista.getPantallaPrincipal().getTextFieldLogin().getText();
		String nombre = vista.getPantallaPrincipal().getTextFieldNombre().getText();
		String apellidos = vista.getPantallaPrincipal().getTextFieldApellidos().getText();
		String nivel = vista.getPantallaPrincipal().getTextFieldNivel().getText();
		String nacionalidad = vista.getPantallaPrincipal().getTextFieldNacionalidad().getText();
		jugador = new Jugador(login, nombre, apellidos, nivel, nacionalidad);
		return jugador;
	}
	
	//recojemos los datos del personaje
	private Personaje recogerPersonaje(){
		Personaje personaje =null;
		
		String nombre = vista.getPantallaPrincipal().getTextFieldNombre2().getText();
		String login = vista.getPantallaPrincipal().getTextFieldLogin().getText();
		String tipo = vista.getPantallaPrincipal().getTextFieldTipo().getText();
		String raza = vista.getPantallaPrincipal().getTextFieldRaza().getText();
		String sexo = vista.getPantallaPrincipal().getTextFieldSexo().getText();
		
		//a la hora de introducir un personaje, recoge los datos introducidos.
		//PERO RECOGE el LOGIN DEL JUGADOR, YA QUE DEBEN SER IGUALES
		personaje = new Personaje(nombre, login, tipo, raza, sexo);
		return personaje;
	}
}