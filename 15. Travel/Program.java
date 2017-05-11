import java.util.Scanner;

public class Travel {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		double budget = Double.parseDouble(console.nextLine());
		String season = console.nextLine();
		String destination ;
		String accomodation = "camp";
		
		if(budget >= 10 && budget <= 100){
			if (season.equals("summer")) {
				System.out.println("Somewhere in Bulgaria");
				System.out.printf("Camp - %.2f", budget * 0.3);
			} else if (season.equals("winter")){
				System.out.println("Somewhere in Bulgaria");
				System.out.printf("Hotel - %.2f", budget * 0.7);
			}
		}else if(budget > 100 && budget <= 1000){
			if (season.equals("summer")) {
				System.out.println("Somewhere in Balkans");
				System.out.printf("Camp - %.2f", budget * 0.4);
			} else if (season.equals("winter")){
				System.out.println("Somewhere in Balkans");
				System.out.printf("Hotel - %.2f", budget * 0.8);
			}
		}else if(budget > 1000 && budget <= 5000){
			System.out.println("Somewhere in Europe");
			System.out.printf("Hotel - %.2f", budget * 0.9);
		}

	}

}
