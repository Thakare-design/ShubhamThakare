package com.skillio.ArrayDemo;

public class swap {

	public static void main(String[] args) {
		
		int[] arr= {0,3,2,0,1,2,5};
		
		int start = 0;
		
		for (int i = arr.length-2; i < 0; i--) {
			
		
		int temp = arr[start];
		arr[start++] = arr[i];
		arr[start--] = temp;
		
		arr[i] = arr[i-1];
		
		}
		
		for(int num : arr) {
		
		System.out.println(num);
	}
		
		/*int count = 0;
		
		//int[] temp = new int[arr.length];
		
		for (int i = 0; i <= arr.length-1; i++) {
			int[] temp = new int[arr.length];
			
			if (arr[i] != 0) {
				temp[count] = arr[i];
				count++;
				
			
			}
			System.out.println(temp);*/
			
				
}	
		}
	


