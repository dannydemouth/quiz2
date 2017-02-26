package quiz2;
import java.util.Scanner;

public class quiz2 {
	public static void main(String[] args){
		double tut;
		double perc;
		double per;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is the current tuition?:");
		tut = keyboard.nextDouble();
		double fina = tut;
		System.out.printf("first year tuition is $%.2f" , tut);
		//System.out.println("What is the Percentage increase?:");
		//perc = keyboard.nextDouble();
		for (int i = 1; i<=3; i++) {
			System.out.print("\nWhat is the Percentage increase?:");
			perc = keyboard.nextDouble();
			per = perc/100;
			tut = tut*per + tut;
			fina = fina + tut;
			System.out.printf("The next year tuition is $%.2f" , tut);
		}
System.out.printf("\nYour total tuition is $%.2f",fina);
	
	
}
}

