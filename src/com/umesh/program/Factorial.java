package com.umesh.program;

import java.util.Scanner;

public class Factorial {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int result = fact(input);
		System.out.println(+result);
	}

	private static int fact(int input) {

		int result = 1;

		for (int i = 1; i <= input; i++) {
			result = result * i;
		}
		return result;

	}

}
