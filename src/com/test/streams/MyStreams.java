package com.test.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyStreams {
	public static void main(String[] args) {
		IntStream
		  	.range(1, 11)
		  	.skip(3)
		  	.forEach(System.out:: println);
		
		System.out.println("---------------------------");
		
		IntStream
	  	.range(1, 11)
	  	.skip(3)
	  	.forEach(x ->System.out.println(x));
		System.out.println("---------------------------");
		
		System.out.println("Sum of 1 to 3 "+ IntStream
	  	.range(1, 4)
	  	.sum());
		System.out.println("---------------------------");
		Stream.of("Jagadish","1Matt", "Wade")
		  .sorted()
		  .findFirst()
		  .ifPresent(System.out:: println);
		
		System.out.println("---------------------------");
		
		String[] myFriends= {"Sashi","Kelly","Sandy"};
		Arrays.stream(myFriends)
		 	.filter(x -> x.startsWith("S"))
		 	.sorted()
		 	.forEach(System.out :: println);
		System.out.println("---------------------------");		         
		
		Arrays.stream(new int[] {5,3,9,4})
		.map(x -> x*x)
		.average()
		.ifPresent(System.out:: println);
		System.out.println("---------------------------");
		
		List<String> names= Arrays.asList("Al","Ankit","Sarika","Amanda","Kelly");
		names.stream()
		.map(String :: toLowerCase)
		.filter(x->x.startsWith("k"))
		.forEach(x -> System.out.println(x));
		
		int myNumber = retunArgument(10);
		String myName = retunArgument("Hello");
		//myNumber = retunArgument("Hello");
		List<?> wildcardList = new ArrayList<String>(); 
		//wildcardList.add("");
		
		int arr[] = {1,2,3,4};
		Arrays.asList(arr).forEach(ele -> System.out.println(ele));
	}
	
	private static<T> T retunArgument(T argument) {
		return argument;
	}
}
