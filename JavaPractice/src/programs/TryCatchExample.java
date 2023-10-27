package programs;

public class TryCatchExample {
	
	public void  addtion() {
		
		int var1=15;
		int var2=30;
		int var3;
		
		var3=var1+var2;
		System.out.println("The value of the variable var3 after addition is:-"+var3);
	}
	
	public void division()
	{
		try
		{
		int var1=20;
		int var2=0;
		int var3;
		
		var3=var1/var2;
	    System.out.println("The Value of the variable var3 after divison is:-"+var3);
	}
		catch(Exception e)
		{
			System.out.println(e);
		}

}
	public static void main(String[] args) {
		
		TryCatchExample tc= new TryCatchExample();
				
		              tc.division();
		              tc.addtion() ;
				
		
		
	}
}
