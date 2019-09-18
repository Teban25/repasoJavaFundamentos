package StudyGroup.repasoJavaFundamentos.terceraParte;

/**
 * atributos: todo debe ser publico, final y static
 * 
 * metodos: todos deben ser abstractos.
 * 
 * @author davidesteban.gomez
 *
 */
public interface AlmacenarHtml {
	
	String URL_DB = "https://fake.com";
	
	void almacenarHtml(String htmlContent);
	
}
