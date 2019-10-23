package lcod;

import java.util.ArrayList;
import java.util.List;
//https://photos.google.com/album/AF1QipMrf3GkCrmjgUJwAiDMOM2OhJw65ZXCbIeRR-NR/photo/AF1QipMN0Obods72g5Ls441tTnldvXpJ3MvuzqrGxtxg

class Stack_class{
	//array list - for storing data
	List<Integer> data;// only reference no space..coz no new keyword..
	
	//new object - declare a space 
	public Stack_class(){
		data = new ArrayList<>();
	}

	public void push(int i) {//simply we are adding data in collection
		data.add(i);
	}

	public int top() {//output last inserted data - i.e. last data in array, index = size -1 
		
		return data.get(data.size()-1);
	}

	public boolean pop() { //delete last element in array
		//if empty
		if(data.isEmpty()) {
			return false;
		}
		data.remove(data.size() - 1);
		return true;
	}
	
	public boolean isEmpty() {
		return data.isEmpty();
	}
	
	
}

public class MyStack {
	public static void main(String[] args) {
		Stack_class stackObj = new Stack_class();
		stackObj.push(1);//ctrl + 1 : eclipse shotcut quick fix
		System.out.println(stackObj.top());
		stackObj.push(0);
		System.out.println(stackObj.top());
		System.out.println(stackObj.pop());
		System.out.println(stackObj.pop());
		System.out.println(stackObj.pop());
	}
}


