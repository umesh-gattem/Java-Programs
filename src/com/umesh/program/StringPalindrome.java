//You have been given a String S. You need to find and print whether this string is a palindrome or not.
//If yes, print "YES" (without quotes), else print "NO" (without quotes).

package com.umesh.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPalindrome {

	public static void main(String args[]) {

		String input;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while ((input = br.readLine()) != null) {
				String result = printIsItPalindromeString(input);
				System.out.println(result);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static String printIsItPalindromeString(String input) {

		String output = new StringBuilder(input).reverse().toString();
		if (input.equals(output)) {
			return "YES";
		} else {
			return "NO";
		}
	}

}
