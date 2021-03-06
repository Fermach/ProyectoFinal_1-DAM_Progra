package Modelo.DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Modelo.DTO.Jugador;
import Modelo.DTO.JugadorAntiguo;
import Modelo.DTO.Personaje;
/**
 * Conjunto de metodos que acceden a la base de datos para hacer 
 * consultas, acuaizaciones y borrados de esta.
 * @author Fermach
 * @version 1.0.
 */
public class DAO implements IDAO {

	/**
	 * IMPORTANTE!!
	 * 
	 * Muchos de estos metodos presentes en el DAO no estan 
	 * siendo utilizados en esta versi�n del proyecto
	 * 
	 */
	
	private Connection conex= Conexion.getInstance();
	private Statement state;
	private PreparedStatement pre;
	String sql ;
	
	//MAIN PARA PRUEBAS
	public static void main(String[] args) {
		DAO dao = new DAO();
		
		//Jugador j =new Jugador("ka6", "Perepe", "Ramirez", "alto", "ES");
		//Personaje p =new Personaje("kaimmn", "ka6", "mago", "elfo", "M");
		//System.out.println(dao.listaPersonajes());
		//System.out.println(dao.listaGuerreros());
	    //dao.a�adirJugador(new Jugador("kfff", "Perepe", "Ramirez", "alto", "ES"));
	    //dao.a�adirPersonaje(new Personaje("kaimmn", "kfff", "mago", "elfo", "M"));
        // System.out.println(dao.jugadoresAntiguos());
	    //dao.borrarJugador(j);
	    //dao.borrarPersonaje(p);
	    //System.out.println(dao.listaJugadores());
	    // System.out.println(dao.listaPersonajes());
	}
	
	
	/**
	 * @return Lista de personajes del la BD-
	 */
	@Override
	public List<Personaje> listaPersonajes() {
		// TODO Auto-generated method stub
		List<Personaje> listaPersonajes = new ArrayList<>();
		sql= "SELECT * FROM personajes ORDER BY login";
		try {
		    state =conex.createStatement();
		    ResultSet resulset = state.executeQuery(sql);
			while(resulset.next()){
				String nombre = resulset.getString("nombre");
				String login = resulset.getString("login");
				String tipo = resulset.getString("tipo");
				String raza = resulset.getString("raza");
				String sexo = resulset.getString("sexo");

				Personaje personaje = new Personaje(nombre, login, tipo, raza, sexo);
				listaPersonajes.add(personaje);
			}
		} catch (SQLException e) {
			System.out.println("Error en la lectura de la BD");
		}
		return listaPersonajes;
	}

	/**
	 * @return Lista de jugadores de la BD
	 */
	@Override
	public List<Jugador> listaJugadores() {
		// TODO Auto-generated method stub
		List<Jugador> listaJugadores = new ArrayList<>();
	sql = "select * from jugadores order by login";
		try {
		    state =conex.createStatement();
		    ResultSet resulset = state.executeQuery(sql);
			while(resulset.next()){
				String login = resulset.getString("login");
				String nombre = resulset.getString("nombre");
				String apellidos = resulset.getString("apellidos");
				String nivel = resulset.getString("nivel");
				String nacionalidad = resulset.getString("nacionalidad");
				

				Jugador jugador = new Jugador( login, nombre, apellidos, nivel, nacionalidad);
				listaJugadores.add(jugador);
			}
		} catch (SQLException e) {
			System.out.println("Error en la lectura de la BD");
		}
		return listaJugadores;
	}

	/**
	 * @return Lista de guerreros de la BD
	 */
	@Override
	public List<Personaje> listaGuerreros() {
		// TODO Auto-generated method stub
		List<Personaje> listaGuerreros = new ArrayList<>();
	    sql = "SELECT * FROM mostrar_guerreros ORDER BY nombre";
		try {
		    state =conex.createStatement();
		    ResultSet resulset = state.executeQuery(sql);
			while(resulset.next()){
				String nombre = resulset.getString("nombre");
				String login = resulset.getString("login");
				String tipo = resulset.getString("tipo");
				String raza = resulset.getString("raza");
				String sexo = resulset.getString("sexo");

				Personaje personaje = new Personaje(nombre, login, tipo, raza, sexo);
				listaGuerreros.add(personaje);
			}
		} catch (SQLException e) {
			System.out.println("Error en la lectura de la BD");
		}
		return listaGuerreros;
	}
    
	/**
	 * @return Lista de magos de la BD.
	 */
	@Override
	public List<Personaje> listaMagos() {
		// TODO Auto-generated method stub
		List<Personaje> listaMagos = new ArrayList<>();
	    sql = "SELECT * FROM mostrar_magos ORDER BY nombre";
		try {
		    state =conex.createStatement();
		    ResultSet resulset = state.executeQuery(sql);
			while(resulset.next()){
				String nombre = resulset.getString("nombre");
				String login = resulset.getString("login");
				String tipo = resulset.getString("tipo");
				String raza = resulset.getString("raza");
				String sexo = resulset.getString("sexo");

				Personaje personaje = new Personaje(nombre, login, tipo, raza, sexo);
				listaMagos.add(personaje);
			}
		} catch (SQLException e) {
			System.out.println("Error en la lectura de la BD");
		}
		return listaMagos;
	}

	/**
	 * @return Lista de picaros de la BD
	 */
	@Override
	public List<Personaje> listaPicaros() {
		// TODO Auto-generated method stub
		List<Personaje> listaPicaros = new ArrayList<>();
	    sql = "SELECT * FROM mostrar_picaros ORDER BY nombre";
		try {
		    state =conex.createStatement();
		    ResultSet resulset = state.executeQuery(sql);
			while(resulset.next()){
				String nombre = resulset.getString("nombre");
				String login = resulset.getString("login");
				String tipo = resulset.getString("tipo");
				String raza = resulset.getString("raza");
				String sexo = resulset.getString("sexo");

				Personaje personaje = new Personaje(nombre, login, tipo, raza, sexo);
				listaPicaros.add(personaje);
			}
		} catch (SQLException e) {
			System.out.println("Error en la lectura de la BD");
		}
		return listaPicaros;
	}

	/**
	 * @return Lista de jugadores con nivel alto en a BD
	 */
	@Override
	public List<Jugador> jugadoresNivelAlto() {
		// TODO Auto-generated method stub
		List<Jugador> listaJugadoresAvanzados = new ArrayList<>();
		sql = "SELECT * FROM mostrar_jugadores_con_mas_nivel ORDER BY login";
		try {
		    state =conex.createStatement();
		    ResultSet resulset = state.executeQuery(sql);
			while(resulset.next()){
				String login = resulset.getString("login");
	    		String nivel = resulset.getString("nivel");
				String nombre = resulset.getString("nombre");
				String apellidos = resulset.getString("apellidos");
				String nacionalidad = resulset.getString("nacionalidad");
				

				Jugador jugador = new Jugador( login, nivel, nombre, apellidos, nacionalidad);
				listaJugadoresAvanzados.add(jugador);
			}
		} catch (SQLException e) {
			System.out.println("Error en la lectura de la BD");
		}
		return listaJugadoresAvanzados;
	}
    
	/**
	 * Comprueba que un jugador exista o no en la BD
	 * @param Jugador 
	 * @return Boolean de si existe o no
	 */
	@Override
	public boolean existeJugador(Jugador j) {
		// TODO Auto-generated method stub
		List<Jugador> listajugadores= listaJugadores();
		for (Jugador jugador : listajugadores) {
			if(jugador.equals(j)){
				return true;
			}
		}
		
		return false;
	}
    
	/**
	 * A�ade un jugador a la BD
	 * @param Jugador a a�adir
	 * @return Boolean de si se ha a�adido o no
	 */
	@Override
	public boolean a�adirJugador(Jugador j) {
		boolean exito = false;
		
		
		sql = "INSERT INTO jugadores VALUES (?, ?, ?, ?, ?)";
		try {
			pre = conex.prepareStatement(sql);
			pre.setString(1, j.getLogin());
			pre.setString(2, j.getNombre());
			pre.setString(3, j.getApellidos());
			pre.setString(4, j.getNivel());
			pre.setString(5, j.getNacionalidad());

			int resultado = pre.executeUpdate();
			if (resultado != 0){
				exito = true;
			    System.out.println("Jugador a�adido ");
			}
				
		} catch (SQLException e) {
			System.out.println("Error en la insercci�n de datos de la BD");

		}
		
		return exito;
	}

	/**
	 * @param Jugador a eliminar
	 * @return Boolean de si el jugador se ha eliminado o no
	 */
	@Override
	public boolean borrarJugador(Jugador j) {
		// delete from user where login = "1";
			boolean exito = false;
			sql = "DELETE FROM jugadores WHERE login = ?";
			try {
				pre = conex.prepareStatement(sql);
				pre.setString(1, j.getLogin());
				int resultado = pre.executeUpdate();
				if (resultado != 0){
					exito = true;
			        System.out.println("Jugador borrado ");
				}
			} catch (SQLException e) {
				System.out.println("Error en el borrado de datos de la BD");

			}
			return exito;
	}
    /**
     * 
     * Comprueba que el personaje exista el la BD
     * @return Boolean de si existe o no
     */
	@Override
	public boolean existePersonaje(Personaje p) {
		// TODO Auto-generated method stub
		List<Personaje> listaPersonajes= listaPersonajes();
		for (Personaje personaje : listaPersonajes) {
			if(personaje.equals(p)){
				return true;
			}
		}
		
		return false;
		
	}
    /**
     * A�ade un personaje a la BD
     * @param Personaje a a�adir
     * @return Boolean de si el personaje se ha a�adido o no
     */
	@Override
	public boolean a�adirPersonaje(Personaje p) {
      
		boolean exito = false;
		
	    sql = "INSERT INTO personajes VALUES (?, ? , ?, ?, ?)";
	    
	    // CONTROLO EL TIPO , LA RAZA , Y EL SEXO
	     
	    	 
		try {
			pre = conex.prepareStatement(sql);
			pre.setString(1, p.getNombre());
			pre.setString(2, p.getLogin());
			pre.setString(3, p.getTipo());
			pre.setString(4, p.getRaza());
			pre.setString(5, p.getSexo());

			int resultado = pre.executeUpdate();
			if (resultado != 0){
				exito = true;
			    System.out.println("personaje a�adido ");
			}
		} catch (SQLException e) {
			System.out.println("Error en la insercci�n de datos de la BD");

		}
	    
		return exito;
	}
    
	/**
	 * Elimina un personaje de la BD
	 * @param Personaje a eliminar
	 * @return Boolean de si se ha eliminado o no
	 */
	@Override
	public boolean borrarPersonaje(Personaje p) {
		// TODO Auto-generated method stub
		boolean exito = false;
		sql = "DELETE FROM personajes WHERE nombre = ?";
		try {
			pre = conex.prepareStatement(sql);
			pre.setString(1, p.getNombre());
			int resultado = pre.executeUpdate();
			if (resultado != 0){
				exito = true;
			    System.out.println("Personaje borrado ");
	
			}
		} catch (SQLException e) {
			
			System.out.println("Error en el borrado de datos de la BD");

		}
		return exito;
		
	}
    
	/**
	 * Obitiene la lista de jugadores antiguos de la BD
	 * @return Lista de jugadores antiguos
	 */
	@Override
	public List<JugadorAntiguo> jugadoresAntiguos() {
		// TODO Auto-generated method stub
				List<JugadorAntiguo> listaJugadoresAntiguos = new ArrayList<>();
			    sql = "SELECT * FROM historial ORDER BY login";
				try {
				    state =conex.createStatement();
				    ResultSet resulset = state.executeQuery(sql);
					while(resulset.next()){
						String login = resulset.getString("login");
						String nivel = resulset.getString("nivel");
						String nombre = resulset.getString("nombre");
						String apellidos = resulset.getString("apellidos");
						String nacionalidad = resulset.getString("nacionalidad");
						String fecha_baja = resulset.getString("fecha_baja");

						JugadorAntiguo jugador = new JugadorAntiguo( login, nivel, nombre, apellidos, nacionalidad,fecha_baja);
						listaJugadoresAntiguos.add(jugador);
					}
				} catch (SQLException e) {
					System.out.println("Error en la lectura de la BD");
				}
				return listaJugadoresAntiguos;
	}


    /**
     * Nos permite modificar un personaje de la BD
     * @param Personaje a modificar
     */
	public boolean modificarPersonaje(Personaje p) {
		// TODO Auto-generated method stub
		boolean exito = false;
		sql = "UPDATE personajes SET nombre = ?, tipo = ?, raza = ?, sexo = ? WHERE login = ?";
		 
	    // CONTROLO EL TIPO , LA RAZA , Y EL SEXO
	    
		try {
			pre = conex.prepareStatement(sql);
			pre.setString(1, p.getNombre());
			pre.setString(2, p.getTipo());
			pre.setString(3, p.getRaza());
			pre.setString(4, p.getSexo());
			pre.setString(5, p.getLogin());

			int resultado = pre.executeUpdate();
			if (resultado != 0)
				exito = true;
		} catch (SQLException e) {
			System.out.println("Error en la actualizaci�n de datos de la BD");

		
	    
	    }
		return exito;
		
	
	}

}
