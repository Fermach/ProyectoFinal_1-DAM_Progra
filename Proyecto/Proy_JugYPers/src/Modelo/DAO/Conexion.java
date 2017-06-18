package Modelo.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.sqlite.SQLiteConfig;

/**
 * Establece una conexion Singletone para que
 * solo pueda existir una conexion a la bd
 * @author Fermach
 * @version 1.0.
 */
public class Conexion {

private static Connection conexion = null;
	
	private Conexion(){
		SQLiteConfig config = new SQLiteConfig();
		config.enforceForeignKeys(true);
		
		try {
			Class.forName("org.sqlite.JDBC");
			try {
				conexion = DriverManager.
						getConnection("jdbc:sqlite:BD/bd_jugYpers", config.toProperties());
			} catch (SQLException e) {
				System.out.println("Error al acceso de la BD");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc no encotrador");
		}
	}
	/**
	 * Creamos la conexion de forma unica
	 * @return conexion
	 */
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
