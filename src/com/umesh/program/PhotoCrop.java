//Roy wants to change his profile picture on Facebook. Now Facebook has some restriction over the dimension of picture that we can upload.
//Minimum dimension of the picture can be L x L, where L is the length of the side of square.
//
//Now Roy has N photos of various dimensions.
//Dimension of a photo is denoted as W x H 
//where W - width of the photo and H - Height of the photo
//
//When any photo is uploaded following events may occur:
//
//[1] If any of the width or height is less than L, user is prompted to upload another one. Print "UPLOAD ANOTHER" in this case.
//[2] If width and height, both are large enough and 
//(a) if the photo is already square then it is accepted. Print "ACCEPTED" in this case.
//(b) else user is prompted to crop it. Print "CROP IT" in this case.
//
//(quotes are only for clarification)
//
//Given L, N, W and H as input, print appropriate text as output.
package com.umesh.program;

import java.util.Scanner;

public class PhotoCrop {

	static int width[] = new int[10000];
	static int height[] = new int[10000];
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		int length = scan.nextInt();
		int n = scan.nextInt();
		if (length <= 10000 && length >= 1 && n >= 1 && n <= 1000) {
			uploadPhoto(length, n);
		}
	}

	private static void uploadPhoto(int length, int n) {

		for (int i = 0; i < n; i++) {
			width[i] = scan.nextInt();
			height[i] = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (width[i] <= 10000 && width[i] >= 1 && height[i] >= 1 && height[i] <= 10000) {
				if (width[i] < length || height[i] < length) {
					System.out.println("UPLOAD ANOTHER");
				} else if (width[i] >= length && height[i] >= length && width[i] != height[i]) {
					System.out.println("CROP IT");
				} else if (width[i] >= length && height[i] >= length && width[i] == height[i]) {
					System.out.println("ACCEPTED");
				}
			}
		}
		return;

	}

}
