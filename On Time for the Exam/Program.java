import java.util.Scanner;
	
	public class OnTimeExam {
	
		public static void main(String[] args) {
			Scanner console = new Scanner(System.in);
			
			int hourExam= Integer.parseInt(console.nextLine());
			int minuteExam= Integer.parseInt(console.nextLine());
			int hourArrival= Integer.parseInt(console.nextLine());
			int minuteArrival= Integer.parseInt(console.nextLine());
			
			 int totalMinuteExam = hourExam * 60 + minuteExam;
	         int totalMinuteArrival = hourArrival * 60 + minuteArrival;
	
	         int difference = totalMinuteExam - totalMinuteArrival;
	
	         int diffHours = 0;
	         
	         if (difference == 0 || difference > 0 && difference <=30 ){
	        	 System.out.println("On time");
	        	 if (difference != 0) {
	        		 System.out.printf("%d minutes before the start", difference);
	        	 }
	         }
	         else if (difference > 30) {
	        	 System.out.println("Early");
	        	 while (difference > 59)
	             {
	                 diffHours++;
	                 difference -= 60;
	             }
	
	             if (diffHours > 0)
	             {
	                 System.out.printf("%d:%02d hours before the start", diffHours, difference);
	             }
	             else
	             {
	                 System.out.printf("%d minutes before the start", difference);
	             }
	
	         }
	         else  {
	        	 System.out.println("Late");
	        	 difference = Math.abs(difference);
	        	 
	        	 while (difference > 59)
	             {
	                 diffHours++;
	                 difference -= 60;
	             }
	
	             if (diffHours > 0)
	             {
	                 System.out.printf("%d:%02d hours after the start", diffHours, difference);
	             }
	             else
	             {
	                 System.out.printf("%d minutes after the start", difference);
	             }
	
	         }
		}
	
	}
