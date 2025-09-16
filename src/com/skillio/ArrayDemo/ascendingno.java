package com.skillio.ArrayDemo;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ascendingno {
	
	public static void main(String[] args) {
		
		Integer arr[]= {10,34,24,67,45,34,66,55};
		
		List<Integer> index = Arrays.asList(arr); // Using list collection
		
		Collections.sort(index);
		
		
		
		System.out.println("Ascending order is : " +index);
		
		
     System.out.println("==============================================================");		
        
     
        //Descending order
     
		Collections.sort(index, Collections.reverseOrder());
		
		System.out.println("Descending order is : "+index);
		
	}

}
