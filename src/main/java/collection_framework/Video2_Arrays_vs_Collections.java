package collection_framework;

import java.util.ArrayList;

public class Video2_Arrays_vs_Collections {
	
	
	public static void main(String[] args) {
	// 1. Arrays can store primitive and non-primitive type of Data
	int[] a = {1,2,3,4};
	
	Video2_Arrays_vs_Collections obj1 = new Video2_Arrays_vs_Collections();
	Video2_Arrays_vs_Collections obj2 = new Video2_Arrays_vs_Collections();
	Video2_Arrays_vs_Collections obj3 = new Video2_Arrays_vs_Collections();
	Video2_Arrays_vs_Collections obj4 = new Video2_Arrays_vs_Collections();
	
	Video2_Arrays_vs_Collections[] ref = {obj1, obj2, obj3, obj4};
	
	//1. Collection framework can only store non-primitive type of data
	ArrayList al = new ArrayList();
	al.add(obj1);
	al.add(10); //the 10 here is Integer which is stored as an Object	
	
	//2. Arrays can store only homogeneous type of data excepting in some cases like int as it will be type casted automatically for example
	int[] b = {1, 2, 'c', 3, 4};
	//so the above can be written as an exception because here character will be type casted automatically to int but we cannot provide
	//any other type like boolean, long, float, double, etc
	//e.g, we cannot write int[] b1 = {1, 10.2, 3, 4};
	
	//2. Collection framework can store heterogeneous type of data - examples already given in lines 23 and 24
	
	//3. Arrays size is fixed, we cannot increase/decrease size of an Array during Runtime 
	//3. We can increase/decrease size of Collections during Runtime
	
	//4. Arrays are inbuilt features of java, so algorithms have to be developed by the developer.
	//4. Collection framework is an API which provides pre-defined Classes and Interfaces and methods. So we can use it directly. 
	
	}

}
