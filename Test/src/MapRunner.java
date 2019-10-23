import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String st = "T This is my string This";
		Map<Character, Integer> map = new HashMap<>();
		//get all char from string
		char[] ch = st.toCharArray();
		for(char c:ch) {
			//get the char from map
			//if present increment
			//if not initialize with 1
			Integer i = map.get(c);
			if(i == null)
				map.put(c, 1);
			else
				map.put(c, i+1);
			
		}
		System.out.println(map);
		
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		String[] st2 = st.split(" ");
		
		for(String s:st2) {
			Integer j = map2.get(s);
			if(j == null)
				map2.put(s, 1);
			else
				map2.put(s, j+1);
		}
		System.out.println(map2);
	}

}
