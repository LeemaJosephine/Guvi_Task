package day2;

import java.util.Scanner;

public class PANCarkValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String panNumber = sc.nextLine();
		
		if(isValidPan(panNumber)) {
			System.out.println("pan");
		} else {
			System.out.println("not pan");
		}
		
	}
	
	public static boolean isValidPan(String pan) {
		
		//check if the length is 10
		if(pan.length() != 10) {
			return false;
		}
		
		//Check is al charcaters are uppercase letters or digits
		for(char c : pan.toCharArray()) {
			if(!Character.isUpperCase(c) && !Character.isDigit(c)) {
				return false;
			}	
		}
		
		//check if position 1 to 5 are letters
		for(int i = 0 ; i < 5 ; i ++) {
			if(!Character.isUpperCase(pan.charAt(i))) {
				return false;
			}
		}
		
		//check if 6 to 9 is digit
		for(int i =5 ; i < 9 ; i++) {
			if(!Character.isDigit(pan.charAt(i))) {
				return false;
			}
		}
		
		// check if the last position is a letter
		if(!Character.isUpperCase(pan.charAt(9))) {
			return false;
		}
		
		// if all the checks pass, the true
		return true;
		
		
	}

}
