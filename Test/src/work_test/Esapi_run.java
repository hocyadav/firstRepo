package work_test;
import org.owasp.esapi.ESAPI;
public class Esapi_run {
	public static void main(String[] args) {
		System.out.println(encodeLogVar("variable\r"));
	}
	
	public static String encodeLogVar(String message) {
	    message = message.replace( '\n' ,  '_' ).replace( '\r' , '_' )
	      .replace( '\t' , '_' );
	    //message = ESAPI.encoder().encodeForHTML( message );
	    return message;
	}
}
