package com.sapient.training.ui;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.sapient.training.model.Customer;

public class CustomerSetDemo {

	public static void main(String[] args) {
		//HashSet and LinkedHashSet allow one null object
		Set<Customer> customerSet=new HashSet<>();
		//TreeMap doesn't allow null object
//		Set<Customer> customerSet=new TreeSet<>();
//		Set<Customer> customerSet=
//				new TreeSet<>(new CustomerNameComparator());
		
		customerSet.add(new Customer(1,"Smith"));
		customerSet.add(new Customer(4,"Clarke"));
		customerSet.add(new Customer(3,"Jones"));
		customerSet.add(new Customer(2,"Avinash"));
		customerSet.add(new Customer(1,"Smith"));
		
		customerSet.remove(new Customer(3,"Jones"));
		customerSet.add(null);
//		Collections.sort(customerSet);
		
		
		Iterator<Customer> iterator=customerSet.iterator();
		while(iterator.hasNext()) {
			Customer c1=iterator.next();
			//System.out.println(c1.hashCode()+"---"+c1);
			System.out.println(c1);
			System.out.println();
		}
	}

}
