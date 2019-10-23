
public class String_null {

	public static void main(String[] args) {
		String id = null;

	        String tempTableName = null;
	        if(null != id && !"".equals(id))
	            tempTableName = "ARTT_" + id;

	        System.out.println(tempTableName);
		
	}

}
