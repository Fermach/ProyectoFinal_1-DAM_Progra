package Modelo.DTO;

public class Jugador extends Usuario {

	String login;
	String nivel;
	
	public Jugador(String nombre, String apellidos, String nacionalidad, String login, String nivel) {
		super(nombre, apellidos, nacionalidad);
		this.login = login;
		this.nivel = nivel;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNivel() {
		return nivel;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return "Jugador [login=" + login + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nivel=" + nivel
				+ ", nacionalidad=" + nacionalidad + "]";
	}
	
	
	
	
	
	
}
