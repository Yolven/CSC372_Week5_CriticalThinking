package main;

import java.util.Scanner;
import java.util.ArrayList;

public class main {
	

	
	public static ArrayList<Double> Get_Input(int time, ArrayList<Double> user_numbers, Scanner user_input) {

		
		if (time <= 0) {
			
			return user_numbers;	
				
	}
		
			System.out.print("Enter number: ");
			double input = user_input.nextDouble();
			
			user_numbers.add(input);
			
			
			return Get_Input(time-1, user_numbers, user_input);

	    
	}
	
	public static double Get_Sum(ArrayList<Double> user_numbers, int element) {
		
		if (element == user_numbers.size()) {
			
			return 0;
		}
		
		return user_numbers.get(element) + Get_Sum(user_numbers, element + 1);

		}


	public static void main(String[] args) {
		
		//variables
		double final_number = 0;
		int element = 0;
		
		//create array list
		ArrayList<Double> user_numbers = new ArrayList<Double>();
		
		//user input
		Scanner user_input = new Scanner(System.in);
		
		//call get input recursive method
		user_numbers = (Get_Input(5, user_numbers, user_input));
		
		//call get sum recursive method
		final_number = Get_Sum(user_numbers, element);
		
		//print final sum
		System.out.print(final_number);
		

	}

}