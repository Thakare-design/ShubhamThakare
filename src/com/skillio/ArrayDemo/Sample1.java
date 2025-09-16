package com.skillio.ArrayDemo;

public class Sample1 {

	public static void main(String[] args) {
		// Addition of Array
		
		  int result = 0;
		  
		  int[] arr = { 10, 11, 13, 23, 15, 24 };
		  
		  for (int i = 0; i < arr.length; i++) {
		  
		  result = result + arr[i]; 
		  
		  }
		  
		  System.out.println("Addition Of Array : " + result);
		  
		 }
		  
		  }
		 

//		int[] arr = { 10, 11, 13, 23, 23, 24, 24 };
//
//		int start = 0;
//		int end = arr.length - 1;
//
//		while (start < end) {
//
//			int temp = arr[start];
//			arr[start++] = arr[end];
//			arr[end--] = temp;
//		}
//
//		if (start == end) {
//			
//			System.out.println("palindrome");
//			
//		} else {
//			
//			System.out.println("not");
//
//		}
//		}
//	}
