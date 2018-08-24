package firstTri;

import java.util.Scanner;


public class guessingNumber {

	public static void main(String[] args) 
	{
	Scanner s1 = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = s1.nextLine();
		System.out.println("Nice to meet you " + name + "!");
		boolean redo = true;
		while(redo)
		{
			
		Scanner s2 = new Scanner(System.in);
		System.out.println("Please choose a difficulty between 1, 2 and 3.");
		
		Scanner s3 = new Scanner(System.in);
		int diff = s3.nextInt();
		Scanner s4 = new Scanner(System.in);
		boolean guessing = true;
		int difficulty = 0;
		
		
			
		
		if(diff == 1)
		{
			difficulty = 10;
			
		}
		else if(diff == 2)
		{
			difficulty = 15;
		}
		else if(diff == 3)
		{
			difficulty = 20;
		}
		
		
		int secretNumber = (int)(Math.random( ) * difficulty) + 1;
			System.out.println("Difficulty " + diff + ": Please choose a number between 1 and " + difficulty);
		int counter = 0;
		while(guessing)
		{
			counter++;
			System.out.println("What is your guess?");
			int guess = s2.nextInt();
			
			if(guess > secretNumber)
			{
				System.out.println("Too high.");
				
			}
			else if(guess < secretNumber)
			{
				System.out.println("Too low.");
				
			}
			else
			{
				System.out.println("Just right.");
				
				guessing = false;
			
			}
			
		}
		if(counter == 1)
		{
			System.out.println("It took you " + counter +  " guess to guess the number.");
		}
		else {
			System.out.println("It took you " + counter + " guesses to guess the number.");
		}
		
		System.out.println("Do you want to play again?");
		System.out.println("Yes == 1 & No == 2");
		Scanner s5 = new Scanner(System.in);
		int redo1 = s5.nextInt();
		
		
		if(redo1 == 2)
		{
			System.out.println("Thanks for playing.");
			redo = false;
		}
		}
	
	

	}
}

