package com.Apex.Assignment1;
//Define an HashMap state code and state name and print them.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {

		HashMap<String,String> hmCountry = new HashMap<String,String>();
		//adding elements to the HashMap
		hmCountry.put("ES","Spain");
		hmCountry.put("DE","Germany");
		hmCountry.put("CN","China");
		hmCountry.put("US","United States");
		hmCountry.put("IN","India");
		
		//display the HashMap content using Iterator
		Set set = hmCountry.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			Map.Entry ent = (Map.Entry) iterator.next();
			System.out.print("key: "+ent.getKey()+", Value: ");
			System.out.println(ent.getValue());
		}

	}

}
