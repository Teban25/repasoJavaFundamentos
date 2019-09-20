package StudyGroup.repasoJavaFundamentos.cuartaParte;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.sql.SQLException;

import org.json.JSONArray;
import org.json.JSONException;

/**
 * 
 * 
 * @author davidesteban.gomez
 *
 */
public class BDException extends RuntimeException/*Exception*/{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3718779483898800178L;

	/*
	 * Ejemplo chekExceptions y uncheckExceptions
	 * Throws se usa para propagar la exception.
	 * Try catch se usa cuando quiero finalizar la propagacion.
	 */
	public void escribir() throws IOException, SQLException, JSONException {
		//CheckException
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		inputStreamReader.read();	
		
		String valores = "akfdadanksnaks";
		if(valores.isEmpty()) {
			throw new SQLException("Enviar");
		}
		
		/*try {*/
			JSONArray json = new JSONArray(valores);
			json.getJSONObject(0);
		/*}catch (JSONException e) {
			
			throw new SQLException("Enviar");
		}*/
		
	}
}
