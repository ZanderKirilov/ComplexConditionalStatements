import java.util.Scanner;

public class FruitOrVegetable {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		String entrance = console.nextLine();
		
		if (entrance.equals("banana") || entrance.equals("apple") || entrance.equals("kiwi") || entrance.equals("cherry") || entrance.equals("lemon") || entrance.equals("grapes")) {
			System.out.println("fruit");
		} else if (entrance.equals("tomato") || entrance.equals("cucumber") || entrance.equals("pepper") || entrance.equals("carrot")) {
			System.out.println("vegetable");
		}else {
			System.out.println("unknown");
		}
	}

}
