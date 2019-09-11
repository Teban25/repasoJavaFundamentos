package StudyGroup.repasoJavaFundamentos.primeraParte;

public class ObjetoSuma {
	private int a = 0;
	private String nombre;
	
	public ObjetoSuma(int a, String nombre) {
		super();
		this.a = a;
		this.nombre = nombre;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(final String nombre) {
		this.nombre = nombre;
	}
	
}
