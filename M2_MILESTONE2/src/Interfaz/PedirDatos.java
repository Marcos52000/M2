package Interfaz;

import javax.swing.JOptionPane;

import clases.Empleado;
import enums.Tipos;

public class PedirDatos {

	// metodo pedir por pantalla datos del empleado a crear;
	public static Empleado crearEmpleado() {
		try {
			String nombre = JOptionPane.showInputDialog("Introduce el nombre del empleado");
			String tipo = JOptionPane
					.showInputDialog("Introduce el tipo de empleado: Manager/Boss/Senior/Mid/Junior/Volunteer");
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
			if (sueldoCalculado >= 3000 && sueldoCalculado <= 5000) {
				return sueldoCalculado;
			} else {
				JOptionPane.showMessageDialog(null, "No has introducido un sueldo valido: (3000-5000)");
				System.exit(0);

			}
			break;
		case Boss:
			sueldoCalculado = sueldo + (sueldo * 0.50);
			if (sueldoCalculado >= 8000) {
				return sueldoCalculado;
			} else {
				JOptionPane.showMessageDialog(null, "No has introducido un sueldo valido: (+8000)");
				System.exit(0);
			}
			break;
		case Senior:
			sueldoCalculado = sueldo - (sueldo * 0.05);
			if (sueldoCalculado >= 2700 && sueldoCalculado <= 4000) {
				return sueldoCalculado;
			} else {
				JOptionPane.showMessageDialog(null, "No has introducido un sueldo valido: (2700-4000)");
				System.exit(0);
			}
			break;
		case Mid:
			sueldoCalculado = sueldo - (sueldo * 0.10);
			if (sueldoCalculado >= 1800 && sueldoCalculado <= 2500) {
				return sueldoCalculado;
			} else {
				JOptionPane.showMessageDialog(null, "No has introducido un sueldo valido: (1800-2500)");

			}
			break;
		case Junior:
			sueldoCalculado = sueldo - (sueldo * 0.15);
			if (sueldoCalculado >= 900 && sueldoCalculado <= 1600) {
				return sueldoCalculado;
			} else {
				JOptionPane.showMessageDialog(null, "No has introducido un sueldo valido: (900-1600)");
				System.exit(0);
			}
			break;
		case Volunteer:
			sueldoCalculado = 0;
			break;
		}
		return 0;
	}

	public static void mostrar() {
		System.out.println(crearEmpleado());
	}

}
