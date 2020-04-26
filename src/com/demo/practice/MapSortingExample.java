//java program to sort a hashmap by values in java8
package com.demo.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapSortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n Sorting using java8 streams");
		
		sortByValueJava8Stream();
				
	}

	private static void sortByValueJava8Stream() {
		// TODO Auto-generated method stub
		Map<String, Integer> unSortedMap=getUnSortedMap();
		System.out.println("Unsorted Map:"+unSortedMap);
		
		LinkedHashMap<String, Integer> sortedMap=new LinkedHashMap<String, Integer>();
		unSortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.forEachOrdered(x->sortedMap.put(x.getKey(),x.getValue()));
		
		System.out.println("sorted Map:"+sortedMap);
		
		
	}

	private static Map<String, Integer> getUnSortedMap() {
		// TODO Auto-generated method stub
		Map<String,Integer> unsortMap=new HashMap<>();
		unsortMap.put("alex",1);
		unsortMap.put("david",2);
		unsortMap.put("elle",3);
		unsortMap.put("bryan",4);
		
		
		return unsortMap;
	}

}
