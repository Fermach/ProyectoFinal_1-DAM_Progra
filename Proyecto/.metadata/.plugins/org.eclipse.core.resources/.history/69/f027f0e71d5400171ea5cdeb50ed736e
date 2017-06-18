package Modelo.DTO;
/**
 * Modelo de jugador 
 * @author Fermach
 *
 */
public class Jugador {

	String login;
	String nombre;
	String apellidos;
	String nivel;
	String nacionalidad;
	
	/**
	 * 
	 * @param login
	 * @param nombre
	 * @param apellidos
	 * @param nivel
	 * @param nacionalidad
	 */
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
    //sobrescribimos hashcode y equals para compara en funcion
	//al login
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		return result;
	}
    
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		return true;
	}

	
	
	
	
	
	
}
