package day2;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
        
		int row = 5;


        //Outer lopp for the rows
        for(int i =1; i<=row; i++){

            //Inner loop for Columns
            for(int j=1; j<=row; j++){

                if(j == i || j == row -i +1){
                    System.out.print("*");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        }
}
