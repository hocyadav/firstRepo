import org.owasp.esapi.ESAPI;

public class EsapiRunner1 {

	public static void main(String[] args) {

		String message = "\\ntest string.. ..";
		String  message2 = message.replace( '\n' ,  '_' ).replace( '\r' , '_' ).replace( '\t' , '_' );
		//message2 = ESAPI.encoder().encodeForHTML(message);
		message2 = ESAPI.encoder().encodeForXML(message);
		System.out.println(message);
		//System.out.println(message2);
	}

}
