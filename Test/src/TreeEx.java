import java.util.TreeSet;

public class TreeEx {
	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<Integer>();
		tset.add(1);
		tset.add(22);
		tset.add(34);
		tset.add(45);
		tset.add(3);
		System.out.println(tset);
		System.out.println("floor <= 	: " +tset.floor(22));
		//System.out.println(tset.floor(10));
		System.out.println("lower < 	: " +tset.lower(3));
		System.out.println("ceiling >= 	: "+tset.ceiling(22));
		System.out.println("higher > 	: " +tset.higher(4));
		
		System.out.println(tset.subSet(2, 34));
		System.out.println(tset.subSet(2, true, 34, true));
		
		System.out.println(tset.headSet(4));//before 4
		System.out.println(tset.tailSet(4));//after 4
		
	}

}
