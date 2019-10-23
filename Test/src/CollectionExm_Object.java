import java.util.ArrayList;
import java.util.List;

public class CollectionExm_Object {

	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		//Object obj = null;
		l1.add((String) null);
		System.out.println(l1);

	}
}
