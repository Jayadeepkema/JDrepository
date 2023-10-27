package arrays;

public class ObjectArraay {
	public static void main(String[] args) {

		Object array1[] = new Object[4];

		array1[0] = 10;
		array1[1] = "Marvel Studios";
		array1[2] = 'i';
		array1[3] = 12.345f;
         //array1[4] = "jsadhi";
		for (int index = 0; index <= 3; index++) {
			System.out.println(array1[index]);
		} 

		System.out.println("-----------------------------------------");

		Object hostel[][] = new Object[2][2];
		hostel[0][0] = "Nidevellar";
		hostel[0][1] = 'j';
		hostel[1][0] = 2398745;
		hostel[1][1] = "$&";
      //  hostel[1][2] ="jai";
        //hostel[2][1] ="balayya";
        //hostel[2][2] ="legend";
		for (int galaxy = 0; galaxy <= 2; galaxy++) {
			for (int realm = 0; realm <= 2; realm++) {
				System.out.println(hostel[galaxy][realm] + "!");
			}
			System.out.println();
		}

	}
}
