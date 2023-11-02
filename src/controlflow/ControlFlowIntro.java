package controlflow;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ControlFlowIntro {

//	Functions in Java MUST specify the datatype that is returned by that function
	// If you intend to write a calculator function (using ints) your return type
	// will likely be
	// int or Integer

	// To write a function in java, you can do the following

	// public -> this can be instantiated / accessed from anywhere
	// static -> each ControlFlowIntro object will share one version of this sum
	// method
	// int -> this function HAS to return an int type
	// sum -> the name of the function
	// (int num1, int num2) -> input arguments separated by commas where we MUST
	// specify the datatype
	public static int calculator(int num1, int num2, String operation) {
		// This return statement is ensuring that some piece of data (an int in this
		// case) is being sent
		// back to wherever called the sum function. Each function must only run 1
		// return statement per function call

		// As soon as a function runs a return statement, the function is done running.
		// You SHOULD NOT
		// have code underneath a return statement since it will never

		if (operation.equals("sum"))
			return num1 + num2;
		else if (operation.equals("difference"))
			return num1 - num2;
		else if (operation.equals("product"))
			return num1 * num2;
		else if (operation.equals("quotient"))
			return num2 / num1;
		return -1;

//		System.out.println("This code will never run");
	}

//	Remember, to execute code inside of a class (or a java project in general), we need a main method

	public static void main(String[] args) {
		// Remember this is the equivalent of console.log() - just printing to the
		// console
		System.out.println("Hello, World");

		// Three main types of statements when it comes to control flow:

		// Decision statements - conditionally deciding to execute code

//		The basic decision statement is of course the if statement
		int favoriteNumber = 82;

//		This block of code will only run if you have a favorite number bigger than 100
		if (favoriteNumber > 100) {
			System.out.println("You have a big favorite number");
		} // In java, we can also provide several of these in the form of else if
			// statements
			// We can do as many of these as we want
		else if (favoriteNumber < 50) {
			System.out.println("You have a small favorite number");
		} else {
			// For catch all statements that do not fulfill any of the prior if / else if
			// statements, we can use
			// else
			System.out.println("You have a medium-sized favorite number");
		}

		// The more you nest your code blocks (e.g. putting if statements in if
		// statements, or if statements in
		// nested loops, etc.), the harder it will be to read your code. Be very careful
		// about how you structure
		// and format your conditional statements.

		// One way to avoid / address heavily nested code is to use guard clauses -
		// checking for errors and
		// ending your function early before proceeding onwards with further conditional
		// checks

		// You can have single-line if statements if you only need to execute a single
		// line of code after an if check
		String myString = "This is a fairly long string...........";
		if (myString.length() > 10) {
			System.out.println("That's a long string!");
		}

		if (myString.length() > 10)
			System.out.println("That's a long string (single line of code)");

		// Let's say we only need to do a series of equivalent checks (if a string is
		// equal to a certain series
		// of predetermined values), we can do a shortcut in the form of a switch
		// statement

		int dayOfWeek = 10; // Sun, Mon, Tues, Wed, Thurs, Fri, Sat
		switch (dayOfWeek) {
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
		case 6:
			System.out.println("Can Sleep In Tonight");
			break;

		default:
//			This code will run if we pass in a value that our cases can't handle
			System.out.println("That day of the week does not exist...");
		}

		// Looping statements - repeatedly executing code

		// For Loops:
//		For loops are ways of executing code a preset number of times. They take in 3 arguments:
		// an initial value for a variable that you will have access to in each
		// iteration of your loop,
		// a condition that will determine when to keep running the loop, and a number
		// to increment or decrement
		// by at each iteration of the loop

		for (int i = 0; i < 10; i++) {
			System.out.printf("This is iteration number %d \n", i);
		}
		for (int i = 10; i > 0; i--) {
			System.out.printf("This is iteration number %d \n", i);
		}
//		We can manipulate the amount by which we increment as well
		for (int i = 0; i <= 100; i += 20) {
			System.out.printf("This the current value of i is %d \n", i);
		}

		// Enhanced For Loops
		// Enhanced For loops allow us to iterate through anything that inherits from
		// the Collection (and therefore
		// iterable interface). The idea is that only certain types of objects in Java
		// are able to use this
		// and an ArrayList is one of them...
		ArrayList<String> myFruits = new ArrayList<String>();
		myFruits.add("Apple");
		myFruits.add("Kiwi");
		myFruits.add("Orange");
		myFruits.add("Cherry");
		System.out.println(myFruits);
		// This code essentially makes an ArrayList that will hold a bunch of fruit
		// strings and prints it out all
		// at once

		// To use an enhanced for loop in Java, we use the following syntax:
		// We need to give it two arguments: a variable that will act as a placeholder
		// for each
		// item in our collection. Make sure that you declare its type as the same type
		// as whatever
		// is held in that collection (so since we have an ArrayList of Strings, this
		// placeholder MUST
		// be of type String)

		// We then give the for loop a colon and follow that by the name of the
		// collection
		// We are now able to work with an individual fruit for each iteration of our
		// enhanced for loop
		for (String fruit : myFruits) {
			System.out.println(fruit);
		}

		// While Loops:
		// Just like in Javascript, While loops will continue iterating endlessly until
		// a certain condition
		// is no longer met

		int myAge = 0;

		while (myAge < 21) {
			System.out.println("You cannot drink alcohol...");

			myAge++;
			System.out.printf("You just had a birthday, your age is now: %d \n", myAge);
		}

		System.out.println("Congratulations you can drink now");

		// Do While Loops:
		// Do While Loops, like while loops, take a condition and will continue running
		// so long as that
		// condition evaluates to true... However, the difference between a while loop
		// and a do-while loop
		// is that a while loop, if the condition initially resolves to false, will
		// never even try to
		// execute the code inside of its code block. A do-while loop, in contrast, will
		// always execute
		// the code inside of its block AT LEAST ONCE.

		// Let's use a do-while to have a loop that will consistently ask the user for
		// positive integers
		// and will continue incrementing a sum variable until the user puts in a
		// negative number
//		Scanner input = new Scanner(System.in);
//
//		int sum = 0;
//		int currentUserInput;
//		do {
//			System.out.println(
//					"Please enter a positive integer to add to your sum total (or enter a negative number to quit):");
//			currentUserInput = input.nextInt();
//			if (currentUserInput >= 0) {
//				sum += currentUserInput;
//				System.out.printf("You inputted %d, which brings your total sum to %d \n", currentUserInput, sum);
//			}
//
//		} while (currentUserInput >= 0);

		// Branching Staments - allowing the flow of execution to jump to a different
		// part of the program also typically based on a condition

		// They also have the common effect of immediately endingthe execution of a
		// block of code

		// Break
		// Will immediately break out of the most immediate code block

		// Let's make a loop that will stop running as soon as it randomly generates an
		// even number:

		Random random = new Random();
		int currentRandomNumber;
		System.out.println(
				"-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-");

		for (int i = 0; i < 20; i++) {
			System.out.printf("Currently on iteration number %d \n", i);

			currentRandomNumber = random.nextInt(100);

			System.out.printf("The current random number is %d \n", currentRandomNumber);
			if (currentRandomNumber % 2 == 0) {
				System.out.println("The current random number is even, so we break out of the loop...");
				break; // breaks out of the immediate code block (the for loop in this case)
			}

			System.out.println("Randomly Generated Number was odd...");
			System.out.println(
					"-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-");
		}

		// Continue
		// Is a keyword used to skip the current iteration of a loop and move on to the
		// next

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				// This will stop the current iteration in its tracks but NOT break out of the
				// loop completely like break. Instead, Java will just start the next iteration
				// with
				// i=6
				continue;
			}

			System.out.printf("Value of i is %d \n", i);
		}

		// Labeled Breaks / Continues:
		// When we have nested loops, we may want to break out of more than one loop at
		// a time (calling
		// a break in an inner loop would also break out of the outer loop)

		// This is called a label, we are allowed to reference these in conjunction with
		// our branching statements
		// to break / continue out of several loops at once
		outer: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) {
					// This ensures that we break out of all loops up UNTIL OUTER
					// Gives us some control over the degree to which we are breaking/continuing
					// with our
					// branching keywords
					break outer;
				}
				System.out.printf("i = %d, j = %d \n", i, j);

			}
		}
		// The same idea applies with continue, when we do break outer, we will act as
		// though we are done running
		// the inner loop (even if it has to skip several iterations) and begin with the
		// next iteration of the
		// outer loop.

		// Return

		System.out.println(calculator(14, 10, "product"));

	}

}
