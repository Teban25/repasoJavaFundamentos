package StudyGroup.repasoJavaFundamentos.terceraParte;


public abstract class BussinesHtml {

	private String urlHtml = "http://fake.com";
	
	public BussinesHtml(String urlHtml) {
		super();
		this.urlHtml = urlHtml;
	}

	abstract void agregarEstilo();
	
	public void borrarContenidoHtml() {
		
	}
}
