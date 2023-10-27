package loopsConcepts;

public class NestedLoop {
	public static void main(String[] args) {
		for(int i=1; i<=4; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.println(i);
			}
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!2!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println();
		
		for(int i=1; i<3; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.println(j);
			
			}
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!3!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println();
		
		for (int i=1; i<=3; i++)
		{
			for(int j=0; j<1; j++)
			{
				System.out.println(j+"        ");
			
			}
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!4!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println();
		
		for(int i=1; i<3; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(i+"   ");
			}
			System.out.println();
		}
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!5!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println();
		
		for(int i=1; i<=5; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print( "  *  "+"                ");
			}
			System.out.println();
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!6!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println();
		
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<i; j++)
			{
				System.out.println(j+"    ");			
			}
			System.out.println();
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!7!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println();
		
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(i+"           ");			
			}
			System.out.println();
		}
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!8!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println();
		
		for(int i=5; i>=0; i--)
		{
			for(int j=1; j>=0; j--)
			{
				System.out.print(j+"         ");			
			}
			System.out.println();
		}
	}
	
}
		
	


