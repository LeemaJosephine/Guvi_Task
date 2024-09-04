package day1;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int totalLength = n + m;
		
		int[] array1 = new int[n];
		int[] array2 = new int[n];
		
		for(int i =0; i<n;i++) {
			
			array1[i]=sc.nextInt();
		}
		
		for(int i =0; i<m;i++) {
			
			array2[i]=sc.nextInt();
		}
		
		// Sort array1 in ascending order
		Arrays.sort(array1);
		
		// Sort array2 in descending order
		Arrays.sort(array2);
		reverse(array2);
		
		int[] array3 = new int[totalLength];
		System.arraycopy(array1, 0, array3, 0, n);
		System.arraycopy(array2, 0, array3, n, m);
		
		for(int i =0;i<totalLength;i++) {
			
			if(i==totalLength-1) {
				
				System.out.print(array3[i]);
			} else {
				System.out.print(array3[i]+ " ");
			}
		}
		
	}
	
	public static void reverse(int[] arr) {
		
		int left=0;
		int right = arr.length-1;
		
		while(left < right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
	}

}
