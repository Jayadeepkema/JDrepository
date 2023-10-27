package evenORoddNumber;

import java.util.Scanner;

public class EvenOROddInputFromUser {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		if(number %2 ==0)
			System.out.println(number+"Even Number");
		else
			System.out.println(number+"Odd Number");
		
		
		
		
	}

}
