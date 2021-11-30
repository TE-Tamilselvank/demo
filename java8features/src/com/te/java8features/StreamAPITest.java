package com.te.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAPITest {

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
		integers.add(11);
		integers.add(12);
		integers.add(15);

		System.out.println(" org " + integers);

		// convert manipulated data to list

		List<Integer> mapOutput = integers.stream().map(x -> x ).collect(Collectors.toList());

		// convert manipulated data to set
		Set<Integer> mapSetOutput = integers.stream().map(x -> x * x).collect(Collectors.toSet());

		// integers.stream().map(x->x*x).forEach(System.out::println);

		System.out.println("Map " + mapOutput);
		System.out.println("Set " + mapSetOutput);

		// integer = mapOutput; reassign data
		System.out.println("after the operation " + integers);

		System.out.println("---------sorted---------");

		List<Integer> sortedList = integers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		System.err.println(" org " + integers);

		System.out.println("----------square root--------");

		List<Double> squareRoot = integers.stream().map(a -> Math.sqrt(a)).collect(Collectors.toList());

		System.out.println(squareRoot);

		System.out.println("-----------even numbers-----------");

		List<Integer> evenNumber = integers.stream().map((a) -> {
			if (a % 2 == 0) {
				return a;
			} else {
				return a + 1;
			}
		}).collect(Collectors.toList());

		System.out.println(evenNumber);

		System.out.println("-----------odd number-------------");

		List<Integer> oddNumber = integers.stream().map((a) -> {
			if (a % 2 == 0) {
				return a - 1;
			} else {
				return a;
			}
		}).collect(Collectors.toList());

		System.out.println(oddNumber);

		System.out.println("-------distinct----------");

		List<Integer> dislist = integers.stream().distinct().collect(Collectors.toList());

		System.out.println("distinct list:" + dislist);

		System.out.println("-----------count---------");

		Long count = integers.stream().count();
		System.out.println("count: "+count);

		System.out.println("------------skip-----------");
		System.out.println(sortedList);
		List<Integer> skiplist = integers.stream().skip(4).collect(Collectors.toList());
		System.out.println("skip list :"+skiplist);
		
		System.out.println("------------filter-----------");
		System.out.println(sortedList);
		List<Integer> filterList = integers.stream().filter(x->x%2 !=0).collect(Collectors.toList());
		System.out.println("filter list :"+ filterList);
		
		
		
	}
}
