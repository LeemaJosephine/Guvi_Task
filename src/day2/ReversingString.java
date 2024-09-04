package day2;

import java.util.Scanner;

public class ReversingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		//Using StringBuilder to reverse a string
		StringBuilder reverseString = new StringBuilder(s);
		reverseString.reverse();
		
		String result = reverseString.toString();
		char[] resultArray = result.toCharArray();
		
		// change the case of each character
		for(int i = 0; i< resultArray.length;i++) {
			if(i==0) {
				resultArray[i]= Character.toUpperCase(resultArray[i]);
			} else {
				resultArray[i]= Character.toLowerCase(resultArray[i]);
			}
			
		}
		
		result = new String(resultArray);
		System.out.println(result);
		
		
		
	}

}
