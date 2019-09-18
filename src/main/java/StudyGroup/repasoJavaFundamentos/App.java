package StudyGroup.repasoJavaFundamentos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import StudyGroup.repasoJavaFundamentos.primeraParte.ObjetoSuma;
import StudyGroup.repasoJavaFundamentos.primeraParte.PasoPorReferenciaValor;
import StudyGroup.repasoJavaFundamentos.segundaParte.Paises;
import StudyGroup.repasoJavaFundamentos.segundaParte.Persona;

public class App {
	private static int cantidad = 0;

	public static void main(String[] args) {

		/******** Primera parte ********/
		int a = 10;
		Integer b = 11;
		ObjetoSuma objetoSuma = new ObjetoSuma(10, "Pepe");

		boolean valueA = a > 11 ? true : false;
		String resultado = a > 11 && a < 20 ? "A es mayor a 11" : "A es menor a 11";
		// System.out.println(++a); // a = a + 1; // a = 11
		// System.out.println(a++); // a = 11; a = a + 1;
		// System.out.println(a);
		/*
		 * Probando inmutabilidad de objetos
		 * */
		String hola = new String("Hola pepe");
		hola = "Chao amor";
		hola.concat(", volvete serio!!");
		
		System.out.println(hola);

		int[] arrayInt = new int[] { 1, 2, 3, 4 };
		int[] arrayInt2 = new int[] { 1, 2, 3, 4 };

		primero: for (int i = 0; i < arrayInt.length; i++) {
			condicional: for (int j = 0; j < arrayInt2.length; j++) {
				// ---
				if (j == 2)
					break primero;
				// ---
			}
		}

		PasoPorReferenciaValor pasoPorReferenciaValor = new PasoPorReferenciaValor();
		int valor = pasoPorReferenciaValor.sumarConstante(a);
		ObjetoSuma valor2 = pasoPorReferenciaValor.sumaConstante2(objetoSuma);

		System.out.println(a);
		System.out.println(b);
		System.out.println(objetoSuma.getNombre());
		System.out.println(objetoSuma.getA());
		/************************** Fin primera parte ***************************/
		/***** SEGUNDA PARTE**/
		Persona persona1 = new Persona(16);
		Persona persona2 = new Persona(16);
		System.out.println("contador persona: " + Persona.getContador());
		/***** FINDE SEGUNDA PARTE**/
		
		/***********TERCERA PÁRTE*******************************************/
		recorrerArreglo(1,2,3,4,5,7,5,4,5,2);
		recorrerArreglo(10, arrayInt, arrayInt2);
		
		System.out.println(Paises.COLOMBIA);
		System.out.println(Paises.PUERTO_RICO.segundCiudad());
		System.out.println(Paises.COLOMBIA.segundCiudad());
		
		// Explicacion y uso con expecion para MAP del forEach
		Set<Integer> ids = new HashSet<>();
		ids.add(1);
		ids.add(2);
		
		List<Integer> ids2 = Arrays.asList(1,2,3,4,5,6);
		Map<Integer, Integer> ids3 = new HashMap<>();
		ids3.put(1, 1);
		ids3.put(2, 2);
		
		for (Integer id : ids2) {
			System.out.println("Probando forEach con List: " + id);
		}
		
		for (Integer id : ids) {
			System.out.println("Probando forEach con Set: " + id);
		}
		
		for (Entry<Integer, Integer> id : ids3.entrySet()) {
			System.out.println("Probando forEach especial para Map"
					+ id.getKey() + ":" + id.getValue());
		}
		
		//Concepto de Autoboxing y unboxing
		Integer boxing1 = 10;
		int atomico2 = 25;
		int atomico1 = boxing1;
		boxing1 = atomico2;
		
		double poFactorCast = Double.parseDouble("dada2.5"); //form 2 

		/*****TERCERA PÁRTE**/
	}
	
	private static void recorrerArreglo(int size, int edad, int... datos) {
		for (int i = 0; i < datos.length; i++) {
			
		}
	}
	
	private static void recorrerArreglo(int size, int[]... datos) {
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				
			}
		}
	}

	private static void sumarCantidad() {
		int unidad = 1;
		cantidad++;
	}
}
