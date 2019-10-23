
public class StringReplace {

	public static void main(String[] args) {
		String poolid = "\\r\\n\r\n\\r\\n\r\r\r\\rhariom...";
		// "\r\n\\r\\nhariom\\r.."
		// "\\r\\n\r\n\\r\\n\r\r\r\\rhariom..."
		if (poolid == null) {
	    	poolid = "";
	    }
		System.out.println(poolid);
		poolid = poolid.replace("\\r", "").replace("\\n", "").replace("\r", "").replace("\n", "");
		System.out.println("finale :"+poolid);
	}
	
}
