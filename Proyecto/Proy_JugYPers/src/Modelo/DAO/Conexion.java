package Modelo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

private static Connection conexion = null;
	
	private Conexion(){
		
		try {
			Class.forName("org.sqlite.JDBC");
			try {
				conexion = DriverManager.
						getConnection("jdbc:sqlite:BD/bd_jugadoresYpers");
			} catch (SQLException e) {
				System.out.println("Error al acceso de la BD");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc no encotrador");
		}
	}
	//creamos la conexion de forma unica
	public static Connection getInstance(){
		if (conexion == null){
			new Conexion();
			System.out.println("Se ha creado una nueva conexion");
		}
		return conexion;
		
	}
	public static void main(String[] args) {
		Conexion.getInstance();
	}
}
