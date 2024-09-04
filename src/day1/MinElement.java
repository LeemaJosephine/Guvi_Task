package day1;

import java.util.Scanner;

public class MinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] array = new int[n];
		for(int i =0; i<n;i++) {
			
			array[i]=sc.nextInt();
		}
		
		// Find the minimum element
		int min = array[0];  // Assume the first element is minimum 
		// 20 10 30 40
		for(int i =1;i< n ; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		
		System.out.print(min);
		
	}

}
