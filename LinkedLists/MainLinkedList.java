package LinkedLists;

import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
//		List<Integer> ll = new LinkedList<>();
//		List<Integer> al = new ArrayList<>();
//		ll.add(12);
//		ll.add(2);
//		ll.add(32);
//		ll.add(42);
//		ll.add(62);
//		System.out.println(ll.get(1));
//		getTimeDiff(al);
//		getTimeDiff(ll);
		
		MyLinkedList myLL = new MyLinkedList();
		myLL.add(2);
		myLL.add(56);
		myLL.add(78);
		for (int i = 0; i < 20; i++) {
			myLL.add(i);
		}
		myLL.print();
		try {
			myLL.removeLast();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myLL.print();
		
	}
	
//	static void getTimeDiff(List<Integer> list) {
//		
//		long start = System.currentTimeMillis();
//		for (int i = 0; i < 100000; i++) {
//			list.add(0, i);
//			
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(list.getClass().getName() + " " + (end - start));
//	}

}
