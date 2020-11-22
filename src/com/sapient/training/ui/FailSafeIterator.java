package com.sapient.training.ui;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIterator {

	public static void main(String[] args) {		
		Map<String,String> myMap = new ConcurrentHashMap<>();
		myMap.put("1", "1");myMap.put("2", "1");
		myMap.put("3", "1");myMap.put("4", "1");
		myMap.put("5", "1");myMap.put("6", "1");
//		System.out.println("HashMap before iterator: "+myMap);
		Iterator<String> iterator = myMap.keySet().iterator();
		//Fail-safe iterator
		while(iterator.hasNext()){
			String key = iterator.next();
			if(key.equals("3")) {
				myMap.put(key+"new", "new3");
			}
		}
		System.out.println("HashMap after iterator: "+myMap);

	}

}
