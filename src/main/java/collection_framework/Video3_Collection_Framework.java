package collection_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Video3_Collection_Framework {
	//Collection is a single entity or an object in which we can store multiple data
	//framework - represents the library
	//Collection framework - it is set of pre-defined Classes, Interfaces which is used to store multiple data
	//it contains 2 main packages - java.util.Collection, - we can store data directly 
	//                              java.util.Map         - we store data in key value pair
	//Please refer to the image Collection_Framework_part1.png and Collection_Framework_part2.png
	
	////Refer to the images Collection1, Collection2, Collection3.png
	

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Selenium");
		al.add('z');
		
		HashSet hs = new HashSet();
		hs.add("Python");
		hs.add(true);
		hs.add(20);
		
		//Both al and hs are Collection Objects which are storing objects in intself.
		//So what is the difference between these two Collection Objects ? 
		//Both objects have different properties. Internally working principle is different. And this is very important in interviews
		
		List l1 = new ArrayList();
		List l2 = new LinkedList();
		List l3 = new Vector();
		//Refer to the images Collection_Object.png
		
		
		HashMap hm = new HashMap();
		hm.put(100, "Java");
		hm.put(101, "C++");
		hm.put(102, "Python");
		
		//Refer to the image Map_Object.png
		
		

	}

}
