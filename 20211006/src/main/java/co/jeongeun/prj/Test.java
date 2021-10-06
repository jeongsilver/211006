package co.jeongeun.prj;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List <String> list= new ArrayList<String>();
		
		list.add("java");
		list.add("Hello");
		list.add("World");
		
		int size= list.size();
		System.out.println("총 객체수:"+size);
		
		String skill = list.get(2);
		System.out.println("2: "+skill);
		
		for(int i=0; i<list.size();i++) {
			String str=list.get(i);
			System.out.println(i+":"+str);
		
		
//		list.remove(1);
		for(String sttr : list) {
			System.out.println(sttr);
		}
		}
		

	}

}
