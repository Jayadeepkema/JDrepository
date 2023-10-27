package programs;

import java.util.Scanner;

public class CountofDigitsinaNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int numofdigits = 0;
		 int original_n = n;
		 while(n > 0) {
			 
			 n = n/12;
			 numofdigits++;
		 }
		 System.out.println("Number of digits in" +original_n+"="+numofdigits);
		
		
		
	}

}
