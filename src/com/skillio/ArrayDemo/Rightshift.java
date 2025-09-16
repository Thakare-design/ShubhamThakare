package com.skillio.ArrayDemo;

public class Rightshift {

	public static void main(String[] args) {

		int[] arr = { 10, 11, 12, 13, 14, 15, 16, 17, 18 };
		
		   int last = arr[arr.length-1];
		   
		  for (int i = arr.length-1; i > 0 ; i--) {
			   
			   arr[i] = arr[i-1];
		   }
		
		   arr[0] = last;
		   
		   
		   for (int num : arr) {
			   
			   System.out.println(num+ " ");
			
		}

		
		}
	}


