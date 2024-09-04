package day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		// Read the length of the array
		int n = sc.nextInt();
		
		// Read the IDs of the prisoners
		int[] ids = new int[n];
		
		for(int i=0; i < n ; i++ ) {
			
			ids[i]=sc.nextInt();
		}
		
		
		//Create a HashMap to count the occurrences of each ID
		Map<Integer, Integer> idCount = new HashMap<Integer, Integer>();
		for(int id : ids) {
			idCount.put(id, idCount.getOrDefault(id, 0)+ 1);
		}
		
		boolean foundID = false;
		for(Map.Entry<Integer, Integer> entry: idCount.entrySet()) {
			
				if(entry.getValue() > 1) {
					System.out.print(entry.getKey());
					foundID=true;
				}
		}
		
		if(!foundID) {
			System.out.print("-1");
		}
		
		
		float a = 22.43636432f;
		
		System.out.println(Math.round(a));
		System.out.printf("%.2f",a);
	}

}
