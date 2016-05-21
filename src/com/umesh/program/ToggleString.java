//You have been given a String S consisting of uppercase and lowercase English alphabets.
//You need to change the case of each alphabet in this String. 
//That is, all the uppercase letters should be converted to lowercase and 
//all the lowercase letters should be converted to uppercase.
//You need to then print the resultant String to output.



package com.umesh.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ToggleString {

	public static void main(String[] args){
//		Scanner scan=new Scanner(System.in);
//		String inputString=scan.nextLine();
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String inputString;
			

			while( (inputString = br.readLine()) != null )
			{
				int length=inputString.length();
				StringBuilder sb=new StringBuilder();
				for(int i=0;i<=length-1;i++){
					if(Character.isUpperCase(inputString.charAt(i))){
						sb.append(Character.toLowerCase(inputString.charAt(i)));
					}
					if(Character.isLowerCase(inputString.charAt(i))){
						sb.append(Character.toUpperCase(inputString.charAt(i)));
					}
				}
				System.out.println(sb.toString());

			}

		}
		catch( IOException io )
		{
			io.printStackTrace();
		}
	}

}
