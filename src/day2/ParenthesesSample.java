package day2;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesesSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		if(areParenthesesBalanced(s)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

	public static boolean areParenthesesBalanced(String s) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for(char c: s.toCharArray()) {
			//If its opening, push it onto the stack
			if(c == '(' || c == '{' || c == '[') {
				stack.push(c);
			}
			
			// If it's closing
			else if(c == ')' || c == '}' || c == ']') {
				if(stack.isEmpty()) {
					return false;
				}
				
				// {()}
				char top= stack.pop();
				if((c == ')' && top != '(') || (c == '}' && top != '{') || (c== ']' && top != '[')) {
					return false;
				}
					
			}
		}
		
		return stack.isEmpty();
		
		
	}
}
