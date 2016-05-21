//You have been given 3 integers l r and k. Find how many numbers between l and 
//r (both inclusive) are divisible by k. You do not need to print these numbers, you just have to find their count.
package com.umesh.program;

import java.util.Scanner;

public class CountDivisors {
	public static void main(String args[])
	{

		Scanner scan=new Scanner(System.in);
		int count=0;
		int l=scan.nextInt();
		int r=scan.nextInt();
		int k=scan.nextInt();
		for(int i=l;i<=r;i++){
			if((i%k)==0){
				count++;
			}
		}
		System.out.println(+count);
	}

}
