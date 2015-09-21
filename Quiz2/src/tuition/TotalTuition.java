package tuition;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class TotalTuition {

	public static void main(String[] args) {
		// Scan in all variables
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the initial tuition cost? ");
		double initial_tuition = sc.nextInt();
		System.out.print("What is the percentage increase? ");
		float percentage = sc.nextInt();
		System.out.print("What is the repayment APR? ");
		float apr = sc.nextInt();
		System.out.print("What is the repayment term? (in years) ");
		int term = sc.nextInt();
		
		//calculate monthly payment by calling function
		
		double monthly_payment = monthly_payment(apr, term, percentage, initial_tuition);
		
		// I found this style for converting a variable into a currency format in the textbook pg 1073
		NumberFormat currencyFormat =
				NumberFormat.getCurrencyInstance(Locale.US);
		System.out.printf("The monthly payment is " + currencyFormat.format(monthly_payment));
	}
	public static double calc_tuition(int term, double percentage, double initial_tuition) {
		
		//iterate over term to 
		
		double total_tuition = 0;
		
		for(int i=1; i < term; i++){
			//use initial tuition for first term
			if(term == 1)
				total_tuition = (initial_tuition * percentage) + initial_tuition;
			//use the accumulative tuition for the rest of terms
			else
				total_tuition += (total_tuition * percentage) + total_tuition;
		}
	
		return total_tuition;
		
	}
	
	public static double monthly_payment(float apr, int term, float percentage, double initial_tuition){
		
		//calculates monthly payment by calling function calc tuition and dividing by # of months in term
		double total_tuition = calc_tuition(term, percentage, initial_tuition);
		double monthly_payment = total_tuition / (term * 12);
		
		return monthly_payment;
	}
	
	
	
}
