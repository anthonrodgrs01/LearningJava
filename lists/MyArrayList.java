package lists;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList();
		ArrayList<String> vegetables = new ArrayList();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Mango");
		
		vegetables.add("Potato");
		vegetables.add("Tomato");
		vegetables.add("Carrot");
		
		fruits.addAll(vegetables);
		//get(index)
		System.out.println(fruits.get(1));
		//set(index,element)
		fruits.set(1, "Orange");
		fruits.remove(2);
		System.out.println(fruits);
		
		List<String> toRemove = new ArrayList();
		toRemove.add("Apple");
		toRemove.add("Orange");
		fruits.removeAll(toRemove);
		System.out.println(fruits);
		fruits.clear();
		System.out.println(fruits);
		
		Pair<String,Integer> p1 = new Pair("Anthon", 457);
		Pair<Boolean, String> p2 = new Pair(true,"Anthon");
		
		p1.getDescription();
		p2.getDescription();
	}

}
