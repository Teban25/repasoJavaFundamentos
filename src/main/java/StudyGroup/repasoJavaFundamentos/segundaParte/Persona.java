package StudyGroup.repasoJavaFundamentos.segundaParte;

/**
 * Explicaion de la palabra reservada
 * static, this, null, encapsulamiento
 * 
 * this sirve para acceder a las variables y
 * metodos globales, sin embargo, no es posible usarla
 * dentro de un metodo estatico.
 * 
 * static es a nivel de clase, y la forma de acceder a un
 * atributo o metodo es a traves del nombre de la clase,
 * por ejemplo Persona.nombreAtributo
 * 
 * null se le asigna solamente a tipos de Objectos y no
 * a variables primitivas (pues sacaria error de compilacion),
 * y basicamente define que se elimina la refencia a la memoria Heap
 * 
 * El encapsulamiento define que las buenas practicas son no acceder
 * directamente a los atributos de la clase, sino mediante sus gets and sets.
 * 
 * 
 * @author davidesteban.gomez
 */
public class Persona {
		
	static {
		contador = 15;
	}
	
	{
		contador++;
	}

	private String nombre;
	//private int ejemplo = null; esto seria error
	private int edad;
	private static int contador;
	protected String apellido;
	
	public Persona(int edad) {
		this.edad = sumarEdad(edad);
		Persona.contador = 10;
		Persona.restarEdad();
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int sumarEdad(int edad) {
		return edad + 15;
	}
	
	public static int restarEdad() {
		return contador++;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", apellido=" + apellido + "]";
	}
	
}
