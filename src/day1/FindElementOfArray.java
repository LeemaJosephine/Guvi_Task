package day1;

import java.util.Scanner;

public class FindElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] array = new int[n];
		for(int i = 0 ; i < n ; i++) {
			array[i]=sc.nextInt();
		}
		
		// Check if K exists in the array
		boolean found = false;
		for(int i = 0 ; i < n ; i++) {
			if(array[i]==k) {
				found=true;
				break;
			}
		}
		
		if(found) {
			System.out.print("yes");
		} else {
			System.out.print("no");
		}
	}

}
