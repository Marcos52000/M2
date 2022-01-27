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
			double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el sueldo bruto del empleado"));
			String bono = JOptionPane.showInputDialog("Quieres aplicar bono? si/no");
			double sueldoBruto = comprobarTipo(t1, sueldo);
			double sueldoNeto = calcularSueldoNeto(t1, sueldoBruto);
			double sueldoNetoAnual;
			double sueldoBrutoAnual;
			if (bono.equals("si")) {
				sueldoNetoAnual = calcularSueldoNetoAnual(t1, sueldoNeto)
						+ (calcularSueldoNetoAnual(t1, sueldoNeto) * 0.10);
				sueldoBrutoAnual = calcularSueldoBrutoAnual(t1, sueldoBruto)
						+ (calcularSueldoBrutoAnual(t1, sueldoBruto) * 0.10);
			} else {
				sueldoNetoAnual = calcularSueldoNetoAnual(t1, sueldoNeto);
				sueldoBrutoAnual = calcularSueldoBrutoAnual(t1, sueldoBruto);
			}

			Empleado e1 = new Empleado(nombre, sueldoBruto, sueldoNeto, sueldoBrutoAnual, sueldoNetoAnual, t1);
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
			String ayuda = JOptionPane.showInputDialog("El Volunteer tiene ayuda governamental? si/no");
			if (ayuda.equals("si")) {
				sueldoCalculado = 300;
				return sueldoCalculado;
			}else {
				sueldoCalculado = 0;
			}
			
			break;
		}
		return 0;
	}

	public static double calcularSueldoNeto(Tipos tipo, double sueldoBruto) {
		double sueldoCalculadoNeto = 0;
		switch (tipo) {
		case Manager:
			sueldoCalculadoNeto = sueldoBruto - (sueldoBruto * 0.26);
			break;
		case Boss:
			sueldoCalculadoNeto = sueldoBruto - (sueldoBruto * 0.32);
			break;
		case Senior:
			sueldoCalculadoNeto = sueldoBruto - (sueldoBruto * 0.24);
			break;
		case Mid:
			sueldoCalculadoNeto = sueldoBruto - (sueldoBruto * 0.15);
			break;
		case Junior:
			sueldoCalculadoNeto = sueldoBruto - (sueldoBruto * 0.02);
			break;
		case Volunteer:
			sueldoCalculadoNeto = sueldoBruto;
			break;
		}
		return sueldoCalculadoNeto;
	}

	public static double calcularSueldoNetoAnual(Tipos tipo, double sueldoNeto) {
		double sueldoCalculadoNeto = 0;
		switch (tipo) {
		case Manager:
			sueldoCalculadoNeto = sueldoNeto * 12;
			break;
		case Boss:
			sueldoCalculadoNeto = sueldoNeto * 12;
			break;
		case Senior:
			sueldoCalculadoNeto = sueldoNeto * 12;
			break;
		case Mid:
			sueldoCalculadoNeto = sueldoNeto * 12;
			break;
		case Junior:
			sueldoCalculadoNeto = sueldoNeto * 12;
			break;
		case Volunteer:
			sueldoCalculadoNeto = sueldoNeto;
			break;
		}
		return sueldoCalculadoNeto;
	}

	public static double calcularSueldoBrutoAnual(Tipos tipo, double sueldoBruto) {
		double sueldoCalculadoBruto = 0;
		switch (tipo) {
		case Manager:
			sueldoCalculadoBruto = sueldoBruto * 12;
			break;
		case Boss:
			sueldoCalculadoBruto = sueldoBruto * 12;
			break;
		case Senior:
			sueldoCalculadoBruto = sueldoBruto * 12;
			break;
		case Mid:
			sueldoCalculadoBruto = sueldoBruto * 12;
			break;
		case Junior:
			sueldoCalculadoBruto = sueldoBruto * 12;
			break;
		case Volunteer:
			sueldoCalculadoBruto = sueldoBruto;
			break;
		}
		return sueldoCalculadoBruto;
	}

	public static void mostrar() {
		System.out.println(crearEmpleado());
	}

}
