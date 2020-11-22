package com.sapient.training.ui;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
//		Set<String> courseSet=new HashSet<>();
//		Set<String> courseSet=new LinkedHashSet<>();
		Set<String> courseSet=new TreeSet<>();
		
		courseSet.add(new String("Java"));
		courseSet.add(new String("Spring"));
		courseSet.add(new String("JPA"));
		courseSet.add(new String("Java"));
		courseSet.add(new String("PostgreSQL"));
		
		System.out.println(courseSet.size());
		
		Iterator<String> iterator=courseSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
