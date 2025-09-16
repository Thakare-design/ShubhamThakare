package com.skillio.ArrayDemo;

public class reversearray {

	public static void main(String[] args) {

		int[] arr = { 10, 11, 12, 13, 14, 15, 16, 17 };
		// for (int i = 0; i < a.length; i++) {

		// System.out.println(a[i]);

		int start = 0;
		int end = arr.length-1;


		while (start < end) {

			int temp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = temp;

		}
		for (int num : arr) {

			System.out.print(" "+num);
		}
	}
}
