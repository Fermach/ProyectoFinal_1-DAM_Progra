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

public class DAO implements IDAO {

	private Connection conex= Conexion.getInstance();
	private Statement state;
	private PreparedStatement pre;
	
	
	//MAIN PARA PRUEBAS
	public static void main(String[] args) {
		
		
		
	}
	
	
	
	@Override
	public List<Personaje> listaPersonajes() {
		// TODO Auto-generated method stub
		List<Personaje> listaPersonajes = new ArrayList<>();
		String sql = "SELECT * FROM Personajes ORDER BY nombre";
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

	@Override
	public List<Jugador> listaJugadores() {
		// TODO Auto-generated method stub
		List<Jugador> listaJugadores = new ArrayList<>();
		String sql = "SELECT * FROM Jugadores ORDER BY login";
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
				listaJugadores.add(jugador);
			}
		} catch (SQLException e) {
			System.out.println("Error en la lectura de la BD");
		}
		return listaJugadores;
	}

	@Override
	public List<Personaje> listaGuerreros() {
		// TODO Auto-generated method stub
		List<Personaje> listaGuerreros = new ArrayList<>();
		String sql = "SELECT * FROM mostrar_guerreros ORDER BY nombre";
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

	@Override
	public List<Personaje> listaMagos() {
		// TODO Auto-generated method stub
		List<Personaje> listaMagos = new ArrayList<>();
		String sql = "SELECT * FROM mostrar_magos ORDER BY nombre";
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

	@Override
	public List<Personaje> listaPicaros() {
		// TODO Auto-generated method stub
		List<Personaje> listaPicaros = new ArrayList<>();
		String sql = "SELECT * FROM mostrar_picaros ORDER BY nombre";
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

	@Override
	public List<Jugador> jugadoresNivelAlto() {
		// TODO Auto-generated method stub
		List<Jugador> listaJugadoresAvanzados = new ArrayList<>();
		String sql = "SELECT * FROM mostrar_jugadores_con_mas_nivel ORDER BY login";
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

	@Override
	public boolean a�adirJugador(Jugador j) {
		boolean exito = false;
		
		String sql = "INSERT INTO Jugadores VALUES (?, ? , ?, ?, ?)";
		try {
			pre = conex.prepareStatement(sql);
			pre.setString(1, j.getLogin());
			pre.setString(2, j.getNombre());
			pre.setString(3, j.getApellidos());
			pre.setString(4, j.getNivel());
			pre.setString(5, j.getNacionalidad());

			int resultado = pre.executeUpdate();
			if (resultado != 0)
				exito = true;
		} catch (SQLException e) {
			System.out.println("Error en la insercci�n de datos de la BD");

		}
		return exito;
	}

	@Override
	public boolean borrarJugador(Jugador j) {
		// delete from user where login = "1";
			boolean exito = false;
			String sql = "DELETE FROM Jugadores WHERE login = ?";
			try {
				pre = conex.prepareStatement(sql);
				pre.setString(1, j.getLogin());
				int resultado = pre.executeUpdate();
				if (resultado != 0)
					exito = true;
			} catch (SQLException e) {
				System.out.println("Error en el borrado de datos de la BD");

			}
			return exito;
	}

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

	@Override
	public boolean a�adirPersonaje(Personaje p) {
      
		boolean exito = false;
		
		String sql = "INSERT INTO Personajes VALUES (?, ? , ?, ?, ?)";
		try {
			pre = conex.prepareStatement(sql);
			pre.setString(1, p.getNombre());
			pre.setString(2, p.getLogin());
			pre.setString(3, p.getTipo());
			pre.setString(4, p.getRaza());
			pre.setString(5, p.getSexo());

			int resultado = pre.executeUpdate();
			if (resultado != 0)
				exito = true;
		} catch (SQLException e) {
			System.out.println("Error en la insercci�n de datos de la BD");

		}
		return exito;
	}

	@Override
	public boolean borrarPersonaje(Personaje p) {
		// TODO Auto-generated method stub
		boolean exito = false;
		String sql = "DELETE FROM Personajes WHERE nombre = ?";
		try {
			pre = conex.prepareStatement(sql);
			pre.setString(1, p.getNombre());
			int resultado = pre.executeUpdate();
			if (resultado != 0)
				exito = true;
		} catch (SQLException e) {
			
			System.out.println("Error en el borrado de datos de la BD");

		}
		return exito;
		
	}

	@Override
	public List<JugadorAntiguo> jugadoresAntiguos() {
		// TODO Auto-generated method stub
				List<JugadorAntiguo> listaJugadoresAntiguos = new ArrayList<>();
				String sql = "SELECT * FROM historial ORDER BY login";
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

}
