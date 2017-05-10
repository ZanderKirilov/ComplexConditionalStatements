import java.util.Scanner;
import java.util.function.Predicate;

public class FruitOrVegetable {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		String fruit = console.nextLine();
		String day = console.nextLine();
		double quantity = Double.parseDouble(console.nextLine());
		double price = 0;
		
		if (day.equals("Saturday") || day.equals("Sunday")) {
			if (fruit.equals("banana")) price = 2.70;
			else if (fruit.equals("apple")) price = 1.25;
			else if (fruit.equals("orange")) price = 0.90;
			else if (fruit.equals("grapefruit")) price = 1.60;
			else if (fruit.equals("kiwi")) price = 3.00;
			else if (fruit.equals("pineapple")) price = 5.60;
			else if (fruit.equals("grapes")) price = 4.20;
		} else if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")){
			if (fruit.equals("banana")) price = 2.50;
			else if (fruit.equals("apple")) price = 1.20;
			else if (fruit.equals("orange")) price = 0.85;
			else if (fruit.equals("grapefruit")) price = 1.45;
			else if (fruit.equals("kiwi")) price = 2.70;
			else if (fruit.equals("pineapple")) price = 5.50;
			else if (fruit.equals("grapes")) price = 3.85;
		} else {
			System.out.println("error");
		}
		System.out.printf("%.2f", price * quantity);
	}

}
