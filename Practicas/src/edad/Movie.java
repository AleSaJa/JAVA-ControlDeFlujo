package edad;
import java.util.Scanner;

public class Movie {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age =  s.nextInt();
		System.out.println("Enter how many Tickets you want to buy:");
		int ticket = s.nextInt();
		s.close();
		if(age>=0 && age<5) {
			System.out.println("The price of your Ticket is: "+discount(ticket,7*0.3));
		}else if(age>60 && age<=150) {
			System.out.println("The price of your Ticket is: "+discount(ticket,7*0.55));
		}else if(age>=5 && age<=60) {
			System.out.println("The price of your Ticket is: "+discount(ticket,7));			
		}else {
			System.out.println("Out of Range");
		}
	}
	static double discount (double value, double ticket) {
		if(value>=2) {
			double ticketFinal = ticket*0.3;
			System.out.println(ticketFinal);
			return ticketFinal;
		}
		return ticket;
	}
}
