package StudyGroup.repasoJavaFundamentos.segundaParte;

public class Alumno extends Persona{

	private double definitiva = 2.95;
	
	public Alumno(int edad) {
		super(edad);
		super.getEdad();
		super.apellido = "Perez";
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + ",Alumno [definitiva=" + definitiva + "]";
	}
}
