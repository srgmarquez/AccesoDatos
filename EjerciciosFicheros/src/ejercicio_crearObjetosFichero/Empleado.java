package ejercicio_crearObjetosFichero;

import java.io.Serializable;

public class Empleado implements Serializable {
	private String nombre;
	private int sueldo;
	private int año;
	private int antiguedad;

	public Empleado(String nombre, int sueldo, int año, int antiguedad) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.año = año;
		this.antiguedad = antiguedad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", año=" + año + ", antiguedad=" + antiguedad
				+ "]";
	}

}
