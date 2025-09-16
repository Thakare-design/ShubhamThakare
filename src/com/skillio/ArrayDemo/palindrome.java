package com.skillio.ArrayDemo;

public class palindrome {

	public static void main(String[] args) {

		int num = 121 , d ,rev = 0;
		
		for (int i = num ; i > 0 ; i++ ) {
		d = num % 10;
		rev = rev * 10 + d;
		d = num % 10;
		
		for (int j = num+1; j > 0; j++) {
			
		d = num % 10;
		rev = rev * 10 + d;
		d = num % 10;
		}}
		
		if( num == rev ) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
	}
}
		
//		int start = 0;
//		int end = arr.length -1;
//
//		while (start <= end) {
//
//			int temp = arr[start];
//			arr[start++] = arr[end];
//			arr[end--] = temp;
//
//		}
//		if (start == end ) {
//
//			System.out.println("Array is Palindrome");
//
//		} else {
//			System.out.println("Array is not Palindrome");
//
//		
//	    for (int num : arr) {
//	    	
//	    	System.out.println(num);
			
		