package day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArticleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//input from user
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		// Convert the input string to lowercase to handle case sensitivity
		String lowerCase = s.toLowerCase();
		
		// Split the input string into words
		String[] words = lowerCase.split("\\s+");
		
		// List of articles
		String[] articles = {"a","an","the"};
		
		// List to hold the words that comes after articles
		List<String> wordsAfterArticles = new ArrayList<String>();
		
		// Iterate through words
		for(int i = 0; i < words.length -1 ;i ++) {
			for(String article : articles) {
				if(words[i].equals(article)) {
					wordsAfterArticles.add(words[i+1]);
					break;
				}
			}
		}
		
		//print the result
		if(wordsAfterArticles.isEmpty()) {
			System.out.println("-1");
		}else {
			for(int i =0; i<wordsAfterArticles.size();i++) {
				
				if(i==wordsAfterArticles.size()-1) {
				
				System.out.print(wordsAfterArticles.get(i));
				}
				else {
					System.out.print(wordsAfterArticles.get(i)+" ");
				}
			}
		}
		
		
		
		
		
	}

}
