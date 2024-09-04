package day2;

import java.util.Scanner;

public class VowelASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		// String for vowel
		String vowels="aeiou";
		
		// Variable to maintain ASCII values of vowels
		int vaowelAsciiSum = 0;
		
		// Iterate through string
		for(char c : s.toCharArray()) {
			if(vowels.indexOf(c) != -1) {
				// add the ASCII value of the vowel
				vaowelAsciiSum += (int) c;
			}
		}
		
		//check if the sum is multiple of 8
		if(vaowelAsciiSum % 8 ==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
			 
	}

}
