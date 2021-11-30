package com.te.java8features;

import java.util.ArrayList;
import java.util.List;

public class ListJava8Method {

	public static void main(String[] args) {

		List<Integer> integers = new ArrayList<Integer>();

		integers.add(11);
		integers.add(12);
		integers.add(15);
		integers.add(17);
		integers.add(14);
		integers.add(18);
		integers.add(7);
		integers.add(2);
		integers.add(5);

		System.out.println("original order=" + integers);

//		integers.forEach(a->System.out.println(a));
//		
//		System.out.println("after forEach()="+integers);
//		integers.forEach(System.out::println);
//		
//		System.out.println("method ref(static)");
//		integers.forEach(ListJava8Method::getData);
//		
//		integers.removeIf(x -> x > 7);
		integers.removeIf(ListJava8Method::filter);
		System.out.println("after remove If "+integers);

	}

	public static void getData(int a) {
		System.out.println(a + " from other method");
	}
	
	public static boolean filter(int a) {
		return a>7;
	}

}
