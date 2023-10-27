package julyJavaPractice;

public class CountNumberOfDigits {
	public static void main(String[] args) {
		
		int count=0 , num = 117858945;
		
		while(num != 0)
		{
			//num=num/10
			
			num /=10;
			++count;
		}
		System.out.println("The Number of Digits: " + count);
		
	}

}
