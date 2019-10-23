import java.util.Scanner;

public class ScannerClassObject {
	public static void main(String[] arg) {
		Scanner scObj = new Scanner(System.in);
		System.out.println("input name, id, marks,M/F");
		String name = scObj.nextLine();//take string as input
		int id = scObj.nextInt();//take int as input
		double dd = scObj.nextDouble();
		char cr = scObj.next().charAt(0);//read single char from user input and dont take other values
		System.out.println(name);
		System.out.println(id);
		System.out.println(dd);
		System.out.println(cr);
		
	}
}
