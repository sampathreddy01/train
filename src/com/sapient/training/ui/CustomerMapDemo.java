package com.sapient.training.ui;

import java.io.PrintStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.sapient.training.model.Customer;

public class CustomerMapDemo {

	public static void main(String[] args) {
//		Map<Integer,Customer> customerMap= new HashMap<>();
//		Map<Integer,Customer> newCustomerMap =
//					Collections.synchronizedMap(customerMap);
		
		Map<Integer,Customer> customerMap= new ConcurrentHashMap<>();
		
		Customer c1= new Customer(1,"Smith");
		Customer c2= new Customer(4,"Clarke");
		Customer c3=new Customer(3,"Jones");
		Customer c4=new Customer(2,"Avinash");
		
		customerMap.put(c1.getId(), c1);
		customerMap.put(c2.getId(), c2);
		customerMap.put(c3.getId(), c3);
		customerMap.put(c4.getId(), c4);
		
		for(Map.Entry<Integer,Customer> c: customerMap.entrySet()) {
			System.out.print(c.getKey()+":");
			System.out.println(c.getValue());
		}

		Set<Integer> cutomerIds = customerMap.keySet();
		Collection<Customer> customers = customerMap.values();
		
		
		PrintStream printStream=new PrintStream(System.out);
		printStream.println("Hello!!");
		//instead use predefined output stream System.out
		
		System.out.println("Hello!!");
	}

}
