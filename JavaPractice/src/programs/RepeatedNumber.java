package programs;

public class RepeatedNumber {

	public static void main(String[] args) {
		 int arr [] = new int[] {2, 5, 3, 2, 1, 8, 3, 1};
		  
		 System.out.println("RepeatedNumbers in arraylist is given:");
		 
		 for(int i = 0; i < arr.length; i++) {
			 for(int j = i+1; j < arr.length; j++) {
				 if(arr[i] == arr[j])
					 
					 System.out.println(arr[j]);
			 }
		 }
	}
}
