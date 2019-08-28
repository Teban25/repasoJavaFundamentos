package StudyGroup.repasoJavaFundamentos.primeraParte;

public class PasoPorReferenciaValor {
	
	/**
	 * Cuando el parametro es un dato primitvo, Java da la sensacion
	 * de funcionar como paso por valor, pues la variable que se paso como parametro
	 * no cambia su valor.
	 * @param a
	 * @return
	 */
	public int sumarConstante(int a) {
		return a = a +25;
	}
	
	/**
	 * Cuando es un Objeto Java funciona como paso por refencia,
	 * es decir, da la sensacion de que el objeto que se pasa
	 * en el parametro si se modifica, sin embargo, lo que se modifica
	 * son los valores de ese objeto en la memoria Stack
	 * @param valor
	 * @return
	 */
	public ObjetoSuma sumaConstante2(ObjetoSuma valor) {
		valor.setA(25);
		valor.setNombre("Gonzalo");
		return valor;
	} 
}
