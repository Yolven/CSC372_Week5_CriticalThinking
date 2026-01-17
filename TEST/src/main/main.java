package main;

import java.util.Scanner;
import java.util.ArrayList;

public class main {
	

	
	public static ArrayList<Double> Get_Input(int time, ArrayList<Double> user_numbers, Scanner user_input) {

		
		if (time > 0) {
			
			System.out.print("Enter number: ");
			double input = user_input.nextDouble();
			
			user_numbers.add(input);
			
			
			Get_Input(time-1, user_numbers, user_input);
				
	}
		
	    return user_numbers;	
	    
	}
	
	public static double Get_Sum(int time, ArrayList<Double> user_numbers, double final_number, int get_number) {
		
		if (time > 0) {
			
			final_number = final_number + user_numbers.get(get_number);
			
			get_number += 1;
			
			final_number = Get_Sum(time-1, user_numbers, final_number, get_number);

		}
		
		return final_number;		
	}

	public static void main(String[] args) {
		
		//variables
		int get_number = 0;
		double final_number = 0;

		//create array list
		ArrayList<Double> user_numbers = new ArrayList<Double>();
		
		//user input
		Scanner user_input = new Scanner(System.in);
		
		//call get input recursive method
		user_numbers.addAll(Get_Input(5, user_numbers, user_input));
		
		//call get sum recursive method
		final_number = Get_Sum(5, user_numbers, final_number, get_number);
		
		//print final sum
		System.out.print(final_number);
		

	}

}