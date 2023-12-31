package helloworld;

// To actually include code from other parts of our project, we need to IMPORT
// classes using the 'import' keyword and the path to the class we want
// This path means that the Scanner class exists inside of the java.util package
// in the JRE System Library
import java.util.Scanner;

public class HelloWorld {
	// To write a comment in java, we use // just like in JS

	// Inside of our main class in a Java Project (in this case it would be
	// HelloWorld)
	// We need to have something called a 'main method.' A main method is a function
	// in Java that will actually execute code necessary to make our program work

	// The syntax for a main method is as follows:
	// We will go over all of these keywords over time - to put it simply
	// public allows for this method to be called anywhere by any class
	// static means that this method is not tied to any individual object instance,
	// but
	// is instead called directly through the HelloWorld class
	// void means that this function returns nothing

	// String[] args is basically some Java magic to hook onto text put into the
	// command prompt that runs this code (I wouldn't worry about it too much)
	public static void main(String[] args) {

		// We can now run a command that will print a String to the console
		// The command for printing in Java looks like this:

		// This command will print out the String "Hello, World" to the console and
		// will append that string with an invisible new line character (hence, println
		// ->
		// print line)
		System.out.println("Hello, World");
		System.out.println("This is a new line");

		// Let's say we don't want a new line after our Hello, World
		// We can instead use the System.out.print() method to NOT include that
		// invisible
		// new line character

		System.out.print("This is on the ");
		// Can manually add \n to force a line break
		System.out.print("same line as the previous print \n statement \n");

		// This is the equivalent of console.log() in Javascript, but now that
		// we're working in a more backend-oriented language, it is much more common
		// (in Command Line UI apps at least) to get user input than using prompt() in
		// JS
		// To receive user input from the Console, we need to import our very first
		// Java Object

		// The Java object responsible for taking in user input from the console (via
		// the keyboard)
		// is called the 'Scanner' class

		// To instantiate any variable or object inside of Java, we need to first
		// type out the data type of that object (if it is a Scanner object, we
		// need to prepend the name of the variable with 'Scanner', if it is a String,
		// we prepend with "String" and so on...)
		// Next, to instantiate an object like a Scanner, we use the 'new' keyword
		// and the name of the class with parentheses (which calls the constructor),
		// and pass in any necessary input arguments.

		// In this case, we give our scanner System.in as input, which is an input
		// stream associated with the keyboard (essentially it gives our input object
		// the ability to see what the user types into the console using their keyboard)
		Scanner input = new Scanner(System.in);

		System.out.println("What is your name?");

		// To collect the next line of user info from the console, we can
		// use the method .nextLine() on our input Scanner object
		// and store it as a string
		String firstName = input.nextLine();

		// Notice how we are currently fitting this functionality into 2 separate
		// print statements:
		System.out.print("Your name is: ");
		System.out.println(firstName);

		// What if we wanted to format our print statement string so that
		// it automatically hooks onto the value inside of firstName
		// To do this, we can use the System.out.printf (stands for format) method:

		// Takes 2 args minimum: a string with a 'placeholder value' formatted like %s
		// or %d or %f and the print statement will put the right data types inside
		// of the right parts of the string
		// %s -> placeholder for a string
		// %d -> placeholder for integers (digit)
		// %f -> placeholder for floating-point numbers (decimals)
		// %t -> formatting date/time values
		System.out.printf("Your name is: %s %d \n", firstName, 14);

		// Let's get some more practice with creating variables in Java:
		// To reiterate: we MUST MUST MUST include the data type of the variable
		// when we declare it.

		// there is no 'let' no 'const' or 'var,' we declare a variable by
		// specifying what type of variable (String, an integer, a decimal, a boolean,
		// etc.)
		// it is:

		// Primitives: These are datatypes that are NOT objects in Java
		// These are stored directly in memory (the stack) and are efficient
		// with how much space they take up but DONT have any real special
		// methods associated with them:

		// This is an 8-bit integer that can range from -128 to 127
		byte myByte = 120;

		// This is a 16-bit integer that ranges from -32,768 to 32,767
		short myShort = 32000;

		// int is a 32 bit number (specifically an integer that ranges from
		// -2,147,483,648 to 2,147,483,647)
		int myInteger = 14;

		// long is a 64-bit integer ->
		// -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		// When we make a long we MUST add a lowercase l at the end
		long myReallyBigNumber = 1000000000000000000l;

		// If we want to store a decimal or a number with a decimal, we need
		// to either use the float or double datatypes:

		// When we are making a float, we need to append it with an 'f'
		// Do NOT need to worry about upper and lower range of this
		float myFloat = 100.23010430f;

		// For a double, which just has an even MORE ridiculous upper / lower range
		// we will follow it with a lowercase 'd'
		double myDouble = 10.00000000000000000000000000000001d;

		// Besides number primitives in Java, we have the 'boolean' primitive as well
		// A boolean primitive only takes up 1 bit (because it only has 2 possible
		// states: true or false)

		// to make a boolean variable we use the boolean datatype:
		// Lowercase true and false for values:
		boolean isTodayHalloween = true;
		boolean isEthansFavoriteColorGreen = false;

		// Another datatype primitive is called char
		// Char is an unfamiliar datatype to us:
		// it is like a string, but ONLY STORES A SINGLE VALUE REPRESENTED AS
		// A CHARACTER:

		// Note that this character is surrounded by single quotes (you will get
		// an error)
		char myFavoriteLetter = 'X';

		// Besides straight up letters, you can also provide hexidecimal codes,
		// ascii values,
		char lowercaseA = 97;
		System.out.println(lowercaseA);

		// String is a weird case in that we are able to instantiate them
		// as though they were a primitive, BUT THEY ARE ACTUALLY OBJECTS.
		// More specifically they are arrays of characters and have a series
		// of methods we can call to help us deal with them

		// note that we need to use double quotes to make a string in Java
		String myFavoriteFood = "Sushi";
		// example of a method we can call on the String class
		myFavoriteFood.charAt(2);

		// However, let's say you wanted access to some methods that pertain
		// to each primitive type: each and every primitve we have discussed
		// so far has an associated 'wrapper class' that allows us to perform
		// additional methods on that type. These follow the convention of
		// the name of the primitive but with just an uppercase first letter

		// for example, if we wanted to get the 'wrapper class' instance of a
		// boolean variable, we can use the Boolean (note uppercase) class:
		Boolean isTodayTuesday = true;
		isTodayTuesday.compareTo(false);

		// Sometimes in Java, you want to convert one datatype to another.
		// for example you might want to convert one datatype to another:
		short smallNum = 120;
		int newSmallNum = (int) smallNum;
		System.out.println(newSmallNum);

		// This is called casting and it can lead to unforeseen results:
		byte b = (byte) 2301;
		System.out.println(b);

		int smallInt = 120; // both of these ints are 4 bytes (32 bits)
		int biggerInt = 550;

		// Downcasting 4 bytes into 1 byte:
		byte b1 = (byte) smallInt;
		System.out.printf("B1 from smallInt (120) becomes %d \n", b1);

		byte b2 = (byte) biggerInt;
		System.out.printf("B2 from biggerInt (550) becomes %d \n", b2);

		short s1 = (short) biggerInt;
		System.out.printf("S1 from biggerInt (550) becomes %d \n", s1);

		// Operations in Java:
		int x = 10;
		int y = 20;
		int z = 31;

		// We have access to the standard add, subtract, multiply, and divide characters
		// + - * /
		System.out.println(x + y);
		System.out.println(x - z);
		System.out.println(y * z);
		System.out.println(y / x);

		// We also have access to the modulo operator (%), it works just
		// like in javascript -> it divides the two numbers and then returns
		// the REMAINDER between the two
		System.out.println(y % x); // results in 0 because there is no remainder when dividing 20 and 10
		System.out.println(z % x); // Results in 1 because 31 / 10 would be 3 and 1 as remainder

		// Just like in Javascript we also have access to shorthand ways of
		// incrementing variables by one
		// Let's say we wanted to add 1 to a variable, we can use ++
		// x++; // the same thing as saying x = x + 1
		System.out.println(x++); // this will increment AFTER printing (this will print 10 and THEN add 1)
		System.out.println(x); // meaning that this will print 11

		// Let's say you wanted to increment before printing though,
		// you can use the ++x syntax:
		System.out.println(++x); // This will add first (11 + 1 = 12) and THEN print

		// Using the -- syntax (x-- and --x) is the same idea, but it just subtracts by
		// 1
		System.out.println(--x);

		// Other shorthand includes combining mathematical operations with = signs:

		int num1 = 2;
		int num2 = 4;

		num1 += num2; // sets num1 = num1 + num2 (6)
		num1 -= num2; // sets num1 = num1 - num2
		num1 *= num2; // sets num = num1 * num2
		num2 /= num1; // sets num2 = num2 / num1

		// If statements -> if statements allow us to execute code
		// based on a condition (essentially something that will evaluate
		// to a boolean value of true or false). In Java there are NO falsey
		// values (other than false) so we cant really get away with if(myString)

		// However, the syntax for an if statement in Java is identical to Javascript:

		// Inside the parentheses we can put our conditions:

		// Possible relational operators that determine whether a condition
		// is true or false can be

		// Equality operators:
		int myFifteen = 15;

		if (myFifteen == 15) { // checks to see if both sides are equal, if so it resolves to true
			System.out.println("They are equal!");
		}

		if (myFifteen != 15) { // checks to see if both sides are NOT equal
			System.out.println("This won't run since myFifteen IS 15");
		}

		// Of course, we also have access to other relational operators like:

		// x > y -> greater than
		// x < y -> less than
		// x >= y -> greater than or equal to
		// x <= y -> less than or equal to

		// Just like Javascript, we have logical operators that follow
		// the &&, ||, and ! syntax:
		// Remember, these logical operators allow us to evaluate several
		// boolean conditions within a single if statement:

		boolean isWearingCostume = true;
		int candyCount = 1000;

		// Let's write a script that automates whether or not to hand out
		// candy to trick or treaters:
		// Our criteria is the following:
//						IF someone is wearing a costume AND they look like they
//						don't have an unreasonable amount of candy, we will give
//		 				them a treat.
//						Else we will play a trick on them 

		if (isWearingCostume == true && candyCount < 100) {
			System.out.println("Here's a treat!");
		} else {
			System.out.println("Prepare to be tricked");
		}

		// Naming conventions in Java:
		// Naming conventions are ways that we will name variables, files, etc.
		// These are NOT enforced by Java or its compiler, but rather by
		// angry senior developers that have to read your code (which is arguably
		// scarier). Generally certain types of variables or files will be
		// capitalized in a certain way to easily clue in onlookers (or yourself
		// upon reviewing code after some time) on the original purpose of that
		// variable/file.

		// Variables in Java typically follow camel case:
		// You will leave first letter lower case but uppercase each
		// subsequent word:
		String myFavoriteVideoGame;

		// Sometimes you will run into snake case variable in Java
		// Snake case looks like this (words separated by underscores):
		String my_favorite_snake_species;

		// However, you will rarely see this in regular java variables. The
		// place where you will see snake case in Java is with completely all caps
		// variables like this:

		// (final means that you can't change this variable's value after it has
		// been set, kinda like const in JS)
		final long SPEED_OF_LIGHT = 299_792_458l;

		// Classes tend to be in pascal case
		// Pascal case is where each word is capitalized:
		String HelloWorld;

		// Packages tend to be lower case despite having several words
		// although you should try to avoid having several words to describe
		// one package
		// e.g. java.util.function <- all lowercase

		// Scope
		// Inside of our programs, Scope is just as important as it was
		// in Javascript -> We will be passing values from high levels of scope
		// to lower levels. In Java, we can see different levels of scope using
		// code blocks {}

		int outer = 14;
		if (true) {
			System.out.println(outer);
			int inner = 40;
		}
		// System.out.println(inner); causes an error because inner was declared
		// in a lower level of scope and therefore this layer of the program
		// can't access it

		// More on the String class type:
		// As said previously, String is a bit of a special case when it comes
		// to the 'native types' / primitives in that it is a class.
		// But it happens to be so fundamental and is also able to be instantiated
		// through literal assign using ""
		
		String myString = "foo bar"; // literal assignment using ""
		
		// Since a String is a class, we can additionally instantiate it using
		// a constructor:
		String myString2 = new String("foo bar 2");
		
		// Since String is a class, it comes with its own set of methods that
		// are very useful.
		
		// Can use .length() to get the length of a string
		System.out.printf("The length of myString2 is %d \n", myString2.length());
		
		// We can retrieve the character at a particular part of a string (by its index)
		// remember, indices are 0-indexed, meaning the first character is index=0
		System.out.println(myString2.charAt(2));
		
		String myGreeting = "Hello";
		// The concat method helps us make bigger strings by adding them together
		String myLongerGreeting = myGreeting.concat(" ").concat("From Ethan").concat(" In Tuesday's class");
		String myConcatenation = myGreeting + " " + "From Ethan";
		System.out.println(myLongerGreeting);
		System.out.println(myConcatenation);
		
		
		myLongerGreeting = myLongerGreeting.replace('e', 'o');
		System.out.println(myLongerGreeting);
		
		// The moral of the story is that when we use wrapper classes or classes in general, we unlock
		// a lot of functionality that we don't really need to worry about the inner workings of. As long
		// as we can read documentation, we can write succinct code that relies on abstracted-away classes
		
		
		
		
	}

}
