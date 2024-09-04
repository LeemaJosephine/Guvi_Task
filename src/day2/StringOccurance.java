package day2;

import java.util.Scanner;

public class StringOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		
		String searchString = sc.nextLine();
		
		int occurance = countOccurences(sentence, searchString);
		if(occurance > 0) {
			System.out.println(occurance);
		} else {
			System.out.println(-1);
		}
		
	}
	
	public static int countOccurences(String sentence, String searchString) {
		
		int count=0;
		int index=0;
		
		while((index = sentence.indexOf(searchString, index)) != -1) {
			count++;
			index += searchString.length(); // Move past the last found substring
		}
		
		return count;
		
	}

}
