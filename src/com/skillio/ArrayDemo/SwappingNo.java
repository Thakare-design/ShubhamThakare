package com.skillio.ArrayDemo;

public class SwappingNo {
	
	public static void main(String[] args) {  //Swapping Two No ...
		
	  /*int a = 10;
		int b = 15;
		
		System.out.println("before swapping: a=" +a+ "b=" +b );
		
		int temp = a;
		       a = b;
		       b = temp;
		
			System.out.println("after swapping: a=" +a+ "b=" +b);
		}
}*/


  // Swapping No without using variable
		
		/*int a = 10;
		int b = 15;
		
		System.out.println("before swapping: a=" +a+ "b=" +b );
		
		a = a+b;// addition is 25
		b = a-b;//
		a = a-b;
		
		System.out.println("after swapping: a=" +a+ "b=" +b);*/
		
		
// xor bitwise code trick
		
		int a = 10;
		int b = 15;
		
		System.out.println("before swapping: a=" +a+ "b=" +b);
		
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println("after swapping: a=" +a+ "b=" +b);
		
		
	}
	
}

  

