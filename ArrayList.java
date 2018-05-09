package com.Apex.Assignment1;
//Define an array list of states of USA and print them. Use Hashset, Treeset and notice

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayList {
	


	public static void main(String[] args) {

		List<String> USAstatesList=Arrays.asList("Alabama","Alaska","Arizona","Arkansas","California","colarado","connecticut",
				         "Delaware","Florida","Georgia");
		System.out.printf("\nUSAstatesList: %s%n", USAstatesList);
		sortList(USAstatesList);
		
	}
	
	private static void sortList(List<String> myList) {
		   Set<String> hashsetList = new HashSet<String>(myList);
		   System.out.printf("\nUnique values using Hashset: %s%n",hashsetList);
		   
		   Set<String> treesetList = new TreeSet<String>(myList);
		   System.out.printf("\nUnique values using TreeSet: %s%n", treesetList);
		}


	
		
	}


