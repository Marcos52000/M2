package clases;

import enums.Tipos;

public class Empleado {
	//atributos
	String nombre;
	double sueldo;
	Tipos tipo;
	
	//constructor
	public Empleado(String nombre, double sueldo, Tipos tipo) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", tipo=" + tipo + "]";
	}
	
	
	
	
	

}
