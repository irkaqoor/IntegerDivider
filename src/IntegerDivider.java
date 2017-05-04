
import java.util.Scanner;

public class IntegerDivider {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Input Integer number and press Enter : ");

		int number = input.nextInt();
		
		if ((number < 0)){
			number = number*(-1);
			}

			for (int i = 1; i <= number; i++){
				if ((number % i) == 0)
				{ 
					System.out.println(i  + " and "+ i*(-1) );
				}
			}
	}
}




