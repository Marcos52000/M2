package clases;

import enums.Tipos;

public class Empleado {
	// atributos
	String nombre;
	double sueldoBruto;
	double sueldoNeto;
	double sueldoBrutoAnual;
	double sueldoNetoAnual;
	Tipos tipo;

	// constructor
	public Empleado(String nombre, double sueldoBruto, double sueldoNeto, double sueldoBrutoAnual,
			double sueldoNetoAnual, Tipos tipo) {
		super();
		this.nombre = nombre;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
		this.sueldoBrutoAnual = sueldoBrutoAnual;
		this.sueldoNetoAnual = sueldoNetoAnual;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		if(this.tipo == Tipos.Volunteer) {
			return "Empleado [nombre=" + nombre + ", sueldoBruto=" + sueldoBruto + ", tipo=" + tipo
					+ "]";
		}else {
			return "Empleado [nombre=" + nombre + ", sueldoBruto=" + sueldoBruto + ", sueldoNeto=" + sueldoNeto
				+ ", sueldoBrutoAnual=" + sueldoBrutoAnual + ", sueldoNetoAnual=" + sueldoNetoAnual + ", tipo=" + tipo
				+ "]";
		}
		
	}

}
