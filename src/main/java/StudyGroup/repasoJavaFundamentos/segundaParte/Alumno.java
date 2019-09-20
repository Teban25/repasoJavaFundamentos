package StudyGroup.repasoJavaFundamentos.segundaParte;

import java.io.Serializable;

/**
 * 
 * @author davidesteban.gomez
 *
 */
public class Alumno extends Persona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3601559827787546218L;
	private double definitiva = 2.95;
	
	/**
	 * Sobrecarga de constructores, tener n constructores con diferentes
	 * parametros
	 * @param edad
	 */
	public Alumno(int edad) {
		super(edad);
		super.getEdad();
		super.apellido = "Perez";
		// TODO Auto-generated constructor stub
	}
	
	public Alumno(double edad) {
		super((int)edad);
		super.getEdad();
		super.apellido = "Perez";
		// TODO Auto-generated constructor stub
	}
	
	public Alumno(int edad, String apellido) {
		super(edad);
		super.getEdad();
		super.apellido = apellido;
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Para la sobrecarga de metodos se pueden n metodos con el mismo nombre
	 * pero con diferente parametros, sin importar el tipo retorno
	 * (es decir, no se puede tener dos metodos con el mismo nombre y parametros
	 * pero diferente retorno, saca error de compilación)
	public int sumarEdadAlumno(int x) {
		return super.getEdad() + x;
	}*/
	
	/**
	 * Metodo que sirve para sumar la....
	 * @param x
	 * @return
	 */
	public double sumarEdadAlumno(int x) {
		return Double.valueOf(super.getEdad()) + Double.valueOf(x);
	}

	@Override
	public String toString() {
		return super.toString() + ",Alumno [definitiva=" + definitiva + "]";
	}
}
