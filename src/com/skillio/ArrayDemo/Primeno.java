package com.skillio.ArrayDemo;

public class Primeno {

	public static void main(String[] args) {

		int[] x = { 10, 11, 12, 13, 14, 15, 16};

		/*for (int index = 0; index < x.length; index++) {
			int num = x[index];*/
		for (int num : x) {
			int katori = 0;

			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					katori++;
				}
			}

			if (katori == 2) {
				System.out.println(num + " is prime");

			} else {
				System.out.println(num + " is not prime");

			}

		}
	}
}
