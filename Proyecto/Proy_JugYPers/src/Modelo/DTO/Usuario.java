package Modelo.DTO;

public class Usuario {
   String nombre;
   String apellidos;
   String nacionalidad;

  public Usuario(String nombre, String apellidos, String nacionalidad) {
	super();
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.nacionalidad = nacionalidad;
}

  @Override
  public String toString() {
	return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos + ", nacionalidad=" + nacionalidad + "]";
}
	   
   
	
}
