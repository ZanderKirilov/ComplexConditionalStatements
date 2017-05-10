import java.util.Scanner;
import java.util.function.Predicate;

public class Cinema {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		String typeProjection = console.nextLine();
		int r = Integer.parseInt(console.nextLine());
		int c = Integer.parseInt(console.nextLine());
		double price = 0;
		
		if (typeProjection.equals("Premiere")) price = 12.00;
		else if (typeProjection.equals("Normal")) price = 7.5;
		else if (typeProjection.equals("Discount")) price = 5.0;
		
		System.out.printf("%.2f leva", r * c * price);
	}

}
