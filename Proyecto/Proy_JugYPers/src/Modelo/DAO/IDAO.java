package Modelo.DAO;

import java.util.List;

import Modelo.DTO.Jugador;
import Modelo.DTO.JugadorAntiguo;
import Modelo.DTO.Personaje;
/**
 * Interfaz del DAO
 * @author Fermach
 * @version 1.0.
 */
public interface IDAO {

	List<Personaje> listaPersonajes();
	List<Jugador> listaJugadores();
	List<Personaje> listaGuerreros();
	List<Personaje> listaMagos();
	List<Personaje> listaPicaros();
    List<Jugador> jugadoresNivelAlto();
	List<JugadorAntiguo> jugadoresAntiguos();
    
	boolean existeJugador(Jugador j);
	boolean a�adirJugador(Jugador j);
	boolean borrarJugador(Jugador j);
	
	boolean existePersonaje(Personaje p);
	boolean a�adirPersonaje(Personaje p);
	boolean borrarPersonaje(Personaje p);
	boolean modificarPersonaje(Personaje p);
	
}
