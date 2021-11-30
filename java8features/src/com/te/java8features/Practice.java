package com.te.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice {
	
	public static int add(int a) {
		return a+10;
	}
	
	
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		
		list.add(12);
		list.add(8);
		list.add(9);
		list.add(6);
		list.add(7);
		list.add(4);
		list.add(3);
		
//		list.stream().map(a->a).forEach(System.out::println);
		
		//list.stream().filter(a->a.startsWith("h")).forEach(System.out::println);
		
//		System.out.println(list);
		
		//list.stream().distinct().forEach(System.out::println);
		
		//list.stream().sorted().forEach(System.out::println);
//		List lis = list.stream().map(Practice::add).collect(Collectors.toList());
//		
//		
//		System.out.println(lis);
//		
//		List li = list.stream().map(a -> {
//			if (a%2==0) {
//				return a;
//			}
//			return 0;
//		}).collect(Collectors.toList());
//		
//		
//		System.out.println(li);
//		
		
		String str = "tamilselvan";
		
		char[] arr=str.toCharArray();
		
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]);
			
		}

		
				
				
				
	}

}
