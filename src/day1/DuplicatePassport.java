package day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DuplicatePassport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] pass = new String[n];
		
		for(int i =0; i<n;i++) {
			
			pass[i]=sc.next();
			
		}
		//String[] passports = sc.nextLine().split(" ");
		
		Set<String> unique = new LinkedHashSet<String>();
		
		for(String passport: pass) {
			
			unique.add(passport);
		}
		
		List<String> lst = new ArrayList<String>(unique);
		
		for(int i =0; i<lst.size();i++) {
			
			if(i==lst.size()-1) {
			
			System.out.print(lst.get(i));
			}
			else {
				System.out.print(lst.get(i)+" ");
			}
		}
		
//		for(String uniquePassport : unique) {
//			
//			System.out.print(uniquePassport + " ");
//		}
	}

}
