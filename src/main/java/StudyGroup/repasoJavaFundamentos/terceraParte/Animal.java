package StudyGroup.repasoJavaFundamentos.terceraParte;

public class Animal {

	/**
	 * Modificadores de acceso:
	 * 
	 * Permisividad que se le otorga a un ente externo para acceder a un atributo de
	 * una clase.
	 * 
	 * Poliformismo:
	 * 
	 * El hecho de poder realizar un tarea con n diferentes soluciones.
	 */

	private int id; // El mas restrictivo, solo se puede ser accedido por su misma clase.
	String nombre;// Las clases que estan dentro del paquete.
	protected String apellido;// Mismo que default, y las que extends de ella.
	public String fechaNacimineto;// todos pueden acceder a el.
	volatile String nroPersonas;// Threads safe
	transient boolean isTrue;//

	/**
	 * El overriding se usa con @Override
	 * 
	 * @param birthDay
	 * @return
	 */
	public int calcularId(int birthDay) {
		return birthDay + 15;
	}

	/**
	 * Instance of: procedimiento que permite identificar si un objeto pertenece a
	 * una clase o no.
	 */
	public boolean isString(Object nombre) {
		if (nombre instanceof String) {
			return true;
		}
		return false;
	}

	/**
	 * Casting: 1. Metodo directo -- riesgosa 2. Wrapper
	 */
	public void practicaCasting(double primaFraccionada, String poFactor) {
		int primaNeta = (int) primaFraccionada; // forma 1.
		char primero = (char) poFactor.charAt(0); // forma 1.
		double poFactorCast = Double.parseDouble(poFactor); // form 2 "dada2.5" sacaria NumberFormatException

		System.out.println(primaNeta);
		System.out.println(primero);
		System.out.println(poFactorCast);
	}

	/**
	 * Object -- equals, hash y toString
	 * 
	 * toString: sino esta implementado super o padre: la referencia 
	 * en memoria: (0x22121F).
	 * Si lo esta, es decir @Override
	 * 
	 * hash: calcula un numero hash con el cual se determina el valor 
	 * de la suma de todos sus atributos.
	 * 
	 * Equals: se puede comparar a traves del equals o del hashcode
	 */
	
	@Override
	public String toString() {
		return "Animal [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimineto="
				+ fechaNacimineto + ", nroPersonas=" + nroPersonas + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((fechaNacimineto == null) ? 0 : fechaNacimineto.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((nroPersonas == null) ? 0 : nroPersonas.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.hashCode() == obj.hashCode())
			return true;
		return false;
	}

	
	
}
