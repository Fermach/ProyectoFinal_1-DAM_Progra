package Modelo.DTO;

public class JugadorAntiguo extends Jugador {

	String fecha_baja;
	
	public JugadorAntiguo(String nombre, String apellidos, String nacionalidad, String login, String nivel, String fecha_baja) {
		super(nombre, apellidos, nacionalidad, login, nivel);
        this.fecha_baja=fecha_baja;
}

	public String getFecha_baja() {
		return fecha_baja;
	}

	public void setFecha_baja(String fecha_baja) {
		this.fecha_baja = fecha_baja;
	}

	@Override
	public String toString() {
		return "JugadorAntiguo [fecha_baja=" + fecha_baja + ", login=" + login + ", nivel=" + nivel + ", nombre="
				+ nombre + ", apellidos=" + apellidos + ", nacionalidad=" + nacionalidad + "]"+"\n";
	}

}
