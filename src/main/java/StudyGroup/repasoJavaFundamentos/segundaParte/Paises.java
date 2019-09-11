package StudyGroup.repasoJavaFundamentos.segundaParte;

public enum Paises {

	COLOMBIA("BOGOTA","MEDELLIN"),
	PUERTO_RICO("SAN JUAN");
	
	private String capital;
	private String segundCiudad;
	
	private Paises(String capital, String segundCiudad){
		this.capital = capital;
		this.segundCiudad = segundCiudad;
	}
	
	private Paises(String capital) {
		this.capital = capital;
	}
	
	public String capital() {
		return this.capital;
	}
	
	public String segundCiudad() {
		return this.segundCiudad;
	}

}
