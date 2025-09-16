package com.skillio.ArrayDemo;

public class leftshift {

	public static void main(String[] args) {

		int[] arr = { 10, 11, 12, 13, 14, 15, 16, 17, 18};

		int first = arr[0];

		for(int i = 0; i < arr.length - 1; i++) {

			arr[i] = arr[i + 1];

		}

		arr[arr.length - 1] = first;

		for (int num : arr) {

			System.out.println(num + " ");

		}
	}

}
