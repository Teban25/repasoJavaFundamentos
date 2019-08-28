package StudyGroup.repasoJavaFundamentos;

import StudyGroup.repasoJavaFundamentos.primeraParte.ObjetoSuma;
import StudyGroup.repasoJavaFundamentos.primeraParte.PasoPorReferenciaValor;

public class App 
{
	private static int cantidad = 0;
	
    public static void main( String[] args )
    {
    	int a = 10;
    	Integer b = 11;
    	ObjetoSuma objetoSuma = new ObjetoSuma(10, "Pepe");
    	
    	boolean valueA = a > 11 ? true : false;
    	String resultado = a > 11 && a < 20 ? "A es mayor a 11" : "A es menor a 11";
        //System.out.println(++a); // a = a + 1; // a = 11
        //System.out.println(a++); // a = 11; a = a + 1;
        //System.out.println(a);
        
        int [] arrayInt = new int[] {1,2,3,4};
        int [] arrayInt2 = new int[] {1,2,3,4};
        
        primero : for (int i = 0; i < arrayInt.length; i++) {
        	condicional : for (int j = 0; j < arrayInt2.length; j++) {
				//---
				if(j == 2)
					break primero;
				//---
			}
		}
        
        PasoPorReferenciaValor pasoPorReferenciaValor = new PasoPorReferenciaValor();
        int valor = pasoPorReferenciaValor.sumarConstante(a);
        ObjetoSuma valor2 = pasoPorReferenciaValor.sumaConstante2(objetoSuma);
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(objetoSuma.getNombre());
        System.out.println(objetoSuma.getA());
        
    }
    
    private static void sumarCantidad() {
    	int unidad = 1;
    	cantidad++;
    }
}
