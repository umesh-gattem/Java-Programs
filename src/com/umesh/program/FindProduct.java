//You have been given an array A of size N consisting of positive integers. 
//You need to find and print the product of all the number in this array Modulo 10^9+7.


package com.umesh.program;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindProduct {

	static List<Long> input = new ArrayList<>();
	static int data[] = new int[20];
	static Long result = (long) 1;
	// static List<Integer> data=new ArrayList<>();

	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		for (int i = 0; i < value; i++) {
		    data[i]=sc.nextInt();
			result = ((result * data[i])%1000000007);
		}

		System.out.println(+result);

	}

}
