package com.sapient.training.ui;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
//		Map<Long,String> mobileData=new LinkedHashMap<>();
		Map<Long,String> mobileData=new TreeMap<>();
		mobileData.put(9246114544L, "Rohit Sharma");
		mobileData.put(8246114540L, "Kapil Dev");
		mobileData.put(8298114544L, "Virat Kohli");
		mobileData.put(7246176540L, "Sunil Gavaskar");
//		mobileData.put(null, null);
		mobileData.put(5006176500L, null);
		
		for(Map.Entry<Long,String> e : mobileData.entrySet()) {
			System.out.print(e.getKey()+":");
			System.out.println(e.getValue());
		}
		
		

	}

}
