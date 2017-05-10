import java.util.Scanner;

public class InvalidNumber {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		double num = Double.parseDouble(console.nextLine());
		
		boolean inRange = (num >= 100 && num <= 200) || num == 0;
		if (!inRange)
		  System.out.println("invalid");


	}

}

