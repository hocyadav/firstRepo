
public class VeracodeStringReplace_CWE117 {
public static void main(String[] args) {
	String str = "\\r\\n \r\n for user foobar was successful\\rn";
	String st = "hariom\r\n\\r\\n";
	//String str2 = str.replace("\\r\n", "").replace("\\r", "").replace("\\rn", "").replace("\n", "");
	String st3 = st.replace("\n", "").replace("\\n", "").replace("\r\n", "").replace("\\r\\n", "").replace("\n\r", "").replace("\\n\\r", "");
	//st3 = st3.replace("\r\n", "");
	//st3 = st3.replace("\\r\\n", "");
	System.out.println(st);
	System.out.println(st3);
	//System.out.println(str);
	//System.out.println(str2);
	
    // ensure no CRLF injection into logs for forging records
    //String clean = str.replace('\n', '_').replace('\r', '_');
   // System.out.println(clean);
	
	
}
}
