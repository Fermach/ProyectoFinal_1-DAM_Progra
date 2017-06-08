package Modelo.DTO;

public class Jugador {

	String login;
	String nombre;
	String apellidos;
	String nivel;
	String nacionalidad;
	
	public Jugador(String login, String nombre, String apellidos, String nivel, String nacionalidad) {
	    this.login=login;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nivel= nivel;
		this.nacionalidad=nacionalidad;
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
				+ ", nacionalidad=" + nacionalidad + "]"+"\n";
	}
	
	
	
	
	
	
}
