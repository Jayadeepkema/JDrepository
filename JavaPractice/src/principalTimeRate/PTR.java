package principalTimeRate;

import java.util.Scanner;

public class PTR {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		int principal = sc.nextInt();
		double rate = sc.nextDouble();
		int time = sc.nextInt();
		
		int si = (int)(principal * rate * time)/100;
		System.out.println(si);

	}

}
