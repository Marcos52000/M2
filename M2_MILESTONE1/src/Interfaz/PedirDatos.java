package Interfaz;

import javax.swing.JOptionPane;

import clases.Empleado;
import enums.Tipos;

public class PedirDatos {

	// metodo pedir por pantalla datos del empleado a crear;
	public static Empleado crearEmpleado() {
		try {
			String nombre = JOptionPane.showInputDialog("Introduce el nombre del empleado");
			String tipo = JOptionPane.showInputDialog("Introduce el tipo de empleado: Manager/Boss/Employee/Volunteer");
			Tipos t1 = Tipos.valueOf(tipo);
			double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el sueldo del empleado"));
			double sueldoCalculado = comprobarTipo(t1, sueldo);
			Empleado e1 = new Empleado(nombre, sueldoCalculado, t1);
			return e1;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No has introducido un tipo de empleado valido");
			return null;
		}
		
	}

	// metodo calcular sueldo del empleado dependiendo del tipo de empleado
	public static double comprobarTipo(Tipos tipo, double sueldo) {
		double sueldoCalculado = 0;

		switch (tipo) {
		case Manager:
			sueldoCalculado = sueldo + (sueldo * 0.10);
			break;
		case Boss:
			sueldoCalculado = sueldo + (sueldo * 0.50);
			break;
		case Employee:
			sueldoCalculado = sueldo - (sueldo * 0.15);
			break;
		case Volunteer:
			sueldoCalculado = 0;
			break;
		}

		return sueldoCalculado;
	}

	public static void mostrar() {
		System.out.println(crearEmpleado());
	}

}
