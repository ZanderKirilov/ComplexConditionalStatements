import java.io.Console;
import java.time.Year;
import java.util.Scanner;

public class PointInTheFigure {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
				
		int h = Integer.parseInt(console.nextLine());
		int x = Integer.parseInt(console.nextLine());
		int y = Integer.parseInt(console.nextLine());
		
		if ((x >= 0 && x <= h * 3 && y >= 0 && y <= h) || (x >= h && x <= h * 2 && y >= h && y <= h * 4))
	    {
	        if ((x > 0 && x < h * 3 && y > 0 && y < h) || (x > h && x < h * 2 && y > h && y < h * 4))
	            System.out.println("inside");
	        else
	        {
	            if (x > h && x < h * 2 && y == h)	
	                System.out.println("inside");
	            else
	                System.out.println("border");
	        }
	    }
	    else
	        System.out.println("outside");
	}
		
}
