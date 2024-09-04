package day2;

import java.util.Scanner;

public class ConsecutiveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		// Variable to keep track of the number of characters to be inserted
		int insertCount =0;
		
		// Iterate through the string to check for three consecutive same character.
		for(int i =0; i<s.length()-2 ; i++) {
			// check if the current character and next two characters are the same
			if(s.charAt(i) == s.charAt(i + 1) && s.charAt(i + 1) == s.charAt(i + 2)) {
				//Increment the insert count
				insertCount++;
				
				//Move the index by 2 to skip the next two characters since they form a triplet
				i += 2;
				
			}
		}
		
		System.out.println(insertCount);
	}

}
