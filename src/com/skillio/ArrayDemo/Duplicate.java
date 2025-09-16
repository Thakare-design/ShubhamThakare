package com.skillio.ArrayDemo;

public class Duplicate {
	
    // Find Duplicate Array
	public static void main(String[] args) {
         
		int[] x = {30, 20 ,10, 19, 12, 10, 19,20, 30 };

		//System.out.println("Duplicate Array is: ");

		//boolean isDuplicate = false;

		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {

				if (x[i] == x[j]) {
					System.out.println(x[i]);
				}
			}
		}
	}
}
