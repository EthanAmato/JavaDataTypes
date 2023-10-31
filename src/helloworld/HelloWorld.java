package helloworld;

// To actually include code from other parts of our project, we need to IMPORT
// classes using the 'import' keyword and the path to the class we want
// This path means that the Scanner class exists inside of the java.util package
// in the JRE System Library
import java.util.Scanner;

public class HelloWorld {
	// To write a comment in java, we use // just like in JS
	
	// Inside of our main class in a Java Project (in this case it would be HelloWorld)
	// We need to have something called a 'main method.' A main method is a function
	// in Java that will actually execute code necessary to make our program work
	
	// The syntax for a main method is as follows:
	// We will go over all of these keywords over time - to put it simply
	// public allows for this method to be called anywhere by any class
	// static means that this method is not tied to any individual object instance, but
	// is instead called directly through the HelloWorld class
	// void means that this function returns nothing
	
	// String[] args is basically some Java magic to hook onto text put into the
	// command prompt that runs this code (I wouldn't worry about it too much)
	public static void main(String[] args) {
		
		// We can now run a command that will print a String to the console
		// The command for printing in Java looks like this:
		
		// This command will print out the String "Hello, World" to the console and
		// will append that string with an invisible new line character (hence, println ->
		// print line)
		System.out.println("Hello, World");
		System.out.println("This is a new line");

		// Let's say we don't want a new line after our Hello, World
		// We can instead use the System.out.print() method to NOT include that invisible
		// new line character
		
		System.out.print("This is on the ");
		// Can manually add \n to force a line break
		System.out.print("same line as the previous print \n statement \n");

		// This is the equivalent of console.log() in Javascript, but now that 
		// we're working in a more backend-oriented language, it is much more common
		// (in Command Line UI apps at least) to get user input than using prompt() in JS
		// To receive user input from the Console, we need to import our very first
		// Java Object
		
		// The Java object responsible for taking in user input from the console (via the keyboard)
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
		// specifying what type of variable (String, an integer, a decimal, a boolean, etc.)
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
		
		
		
		
	}
	
}
