package day2;

import java.util.Scanner;

public class PrintConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		StringBuilder constantsOnly = new StringBuilder();
		
		//Iterate through the string
		for(char c : s.toCharArray()) {
			if(c == ' ') {
				constantsOnly.append(c);
			}else if(isConstant(c)) {
				constantsOnly.append(c);
			}
		}
		
		//check if there are no constants
		if(constantsOnly.toString().replaceAll(" ", "").isEmpty()) {
			System.out.println("-1");
		}else {
			System.out.println(constantsOnly.toString());
		}
	}
	
	// method to check if a character is a constant
	public static boolean isConstant(char c) {
		
		c = Character.toLowerCase(c);
		return (c >= 'a' && c <= 'z') && "aeiou".indexOf(c) == -1;
	}

}
