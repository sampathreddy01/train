package com.sapient.training.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.sapient.training.model.Customer;

public class ListDemo {

	public static void main(String[] args) {
		List<String> courseList=new ArrayList<>();
		courseList.add("Java");
		courseList.add(0, "C++");
		courseList.add("Spring");
		
		Iterator<String> iterator= courseList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(courseList.size());
		Integer a[]= {98,90,87};
		List<Integer> marksList=Arrays.asList(a);
		
		List<Customer> customerList=new ArrayList<>();
		customerList.add(new Customer(1,"Smith"));
		customerList.add(new Customer(4,"Clarke"));
		customerList.add(new Customer(3,"Jones"));
		customerList.add(new Customer(2,"Avinash"));
		
		
		System.out.println("-------------------------------");
		Iterator<Customer> customerIterator=customerList.iterator();
		while(customerIterator.hasNext()) {
			System.out.println(customerIterator.next());
		}
		System.out.println("--------------------");
		System.out.println(customerList.get(0));
		List<Customer> newCustomerList= 
							Collections.synchronizedList(customerList);
		//at this point, 2 references, 1. customerList 2. newCustomerList
		Collections.sort(customerList);
		System.out.println("--------------------");
		customerIterator=newCustomerList.iterator();
		while(customerIterator.hasNext()) {
			System.out.println(customerIterator.next());
		}
		System.out.println("------------------------------");
		System.out.println(customerList.hashCode());
		System.out.println(newCustomerList.hashCode());
		System.out.println("------------------------------");
		customerList=null;
		customerIterator=newCustomerList.iterator();
		while(customerIterator.hasNext()) {
			System.out.println(customerIterator.next());
		}
		System.out.println("------------------------------");
		newCustomerList=null;
		customerIterator=newCustomerList.iterator();
		while(customerIterator.hasNext()) {
			System.out.println(customerIterator.next());
		}
		

	}

}
