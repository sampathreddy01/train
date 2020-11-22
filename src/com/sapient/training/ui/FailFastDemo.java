package com.sapient.training.ui;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastDemo {
	public static void main(String[] args) {
		Map<String,String> myMap = new HashMap<>();		
		myMap.put("1", "1");myMap.put("2", "1");
		myMap.put("3", "1");myMap.put("4", "1");
		myMap.put("5", "1");myMap.put("6", "1");
		
		myMap.put("5","5");
//		System.out.println("HashMap before iterator: "+myMap);
		//Fail-fast iterator
		Iterator<String> iterator = myMap.keySet().iterator();
		//throws java.util.ConcurrentModificationException
		while(iterator.hasNext()){
			String key = iterator.next();
			if(key.equals("3")) {
				myMap.put(key+"new", "new3");
			}
		}
		System.out.println("HashMap after iterator: "+myMap);
	}
}



