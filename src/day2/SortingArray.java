package day2;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();  // 
		
		String[] arr = new String[n];
		
		for(int i =0; i <n ;i++) {
			arr[i]=sc.nextLine();
		}
		
		// sort
		Arrays.sort(arr);
		
		for(String str: arr) {
			System.out.print(str+" ");
		}
	}

}
