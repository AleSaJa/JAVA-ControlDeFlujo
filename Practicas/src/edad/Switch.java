package edad;
import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Sales Range:");
		double value =  s.nextDouble();
		s.close();
		if(value>10000) {
			System.out.println("Your Commision is: "+value*0.3);
		}else if(value>=5001 && value<=9999) {
			System.out.println("Your Commission is "+value*0.2);
		}else if(value>=1001 && value<=4999) {
			System.out.println("Your Commission is "+value*0.1);			
		}else {
			System.out.println("N/A");
		}
	}

}
