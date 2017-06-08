package Modelo.DTO;

public class Personaje {

	String nombre;
	String login;
	String tipo;
	String raza;
	String sexo;
	
	

	public Personaje(String nombre, String login, String tipo, String raza, String sexo) {
		super();
		this.nombre = nombre;
		this.login = login;
		this.tipo = tipo;
		this.raza = raza;
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", login=" + login + ", tipo=" + tipo + ", raza=" + raza + ", sexo="
				+ sexo + "]"+"\n";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	

}
