package programs;

public class SecondLargestNumberINarray {

	public static void main(String[] args ) {
		int t, size;
		int array[]  = {12,22,45,78,96,66,58};
		
		 size = array.length;
		 
		 for(int i =0; i < size; i++) {
			 for(int j = i+1; j < size; j++) {
				 if(array[i] > array[j]) {
					 t = array[i];
					 array[i] = array[j];
					 array[j] = t;
				 }
				 
			 }
		 }
		System.out.println("The Second Largest Number is:-" +array[size-1]);
	
	}

}
