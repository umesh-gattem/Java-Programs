//Write a program for String reverse


package com.umesh.program;

import java.io.*;

public class StringReverse {
	
	static BufferedReader br;

	public static void main(String args[]) {

	//	String[] input=new String[20];
		br=new BufferedReader(new InputStreamReader(System.in));
		String input;
		try {
			while((input=br.readLine())!=null){
			String output=new StringBuffer(input).reverse().toString();
			System.out.println(output);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	

}
