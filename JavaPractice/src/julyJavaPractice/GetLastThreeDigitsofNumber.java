package julyJavaPractice;

public class GetLastThreeDigitsofNumber {

	public static void main(String[] args) {

		int num = 123456789;

		String number = String.valueOf(num);
		System.out.print("The Last Three Digits Of num is:-");
		System.out.println(number.substring(number.length() - 3));

		String name = "jayadeep";
		System.out.print("The Avenger Of Earth:- ");
		System.out.println("jayadeep".substring(name.length() - 8));

	}

}
