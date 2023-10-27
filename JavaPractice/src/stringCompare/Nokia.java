package stringCompare;

public class Nokia {

	public static void main(String[] args) {
	              
		String N1="oPPo";
		String N2="oppo";
		
		if(N1.equals(N2))
		{
		   System.out.println("N1 variable value is equal to N2 variable value");
		}
		else
		{
			System.out.println("N1 variable value is Not Equals to N2 Variable value");
		}
		
		System.out.println("////////4/////////////////////////////");
		System.out.println();
		
		String J="Samsung";
		String J2="samsung";
		
		if(J.equals(J2))
		{
			System.out.println("J Variable Value  is Equals to J2 variable value");
		}
		else
		{
			System.out.println("J Variable Value  is Not Equals to J2 variable value");
		}
		
		String N3=N1.toLowerCase();
		System.out.println("The vale of the variable N3 is:-" +N3);
		
		String N4=J2.toLowerCase();
		System.out.println("------------------");
		
		String N5=J.toUpperCase();
		System.out.println("The value of the vairable N5 is :-"+N5);
		
		System.out.println("------------------------------");
		
         String w="jamesbond";
         String w2="bond";
          if(w.contains(w2))
          {
        	  System.out.println("bond is existing in the jamesbond ");
          }
          
          System.out.println("------------------------------");
          
          String w3="NickFury";
          String w4="nickfury";
          String w5="samsung";
          if (w3.equalsIgnoreCase(w4))
          {
        	  System.out.println("The value of the w3 is same as w4 ");
          }
          if(w5.equalsIgnoreCase(J))
          {
        	  System.out.println("both the values are same");
          }
          
          System.out.println("------------------------------");
          
          
          

	}

}
