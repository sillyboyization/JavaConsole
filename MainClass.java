/* This project is meant to explain Java in great detail, while staying very "noob friendly". Any details/inaccuracies
missed should be brought to attention as soon as possible by making a pull request. */
import java.util.Scanner; /* Imports the java scanner, which is needed to scan for input later on. Numbers, letters,
etc. */
public class MainClass /* Starts the main class file, which should be the first file created in all Java console
projects.*/
{ // This bracket is what opens up the class, allowing you to write code inside of it.
  public static void main(String[] args) /* Starts the main method needed as the "base", set to public so other classes
  can access it. Somebody please make a pull request and explain "String[] args" + "static". */
	{ // Again, this is a bracket that opens up the place to code inside the main method.
		System.out.print("Enter your name here: "); /* This gives output to the user, which is not needed, but
		makes it extremely user-friendly. Basically out being output, and print being print on the same line.
		print can be changed to println to skip a line after printing. */
		Scanner input = new Scanner(System.in); /* Makes a new scanner called input, which as expected will be
		used to take in user input using System.in */
		String setName = input.next(); /* String setName; is used to start a "string", which is basically just
		text input. */
		PrintClass PrintObject = new PrintClass(); /* printClass calls out the file "printClass.java", then
		"printObject" creates an object for the printClass, which can be used to call out functions from within
		the class. */
		PrintObject.setName(setName); /* Here we call out the function "setName" inside of "printClass.java"
		then use the string setName, and put it into the function by putting setName into the parentheses.
		Now please take the time to look over the file "printClass.java" */
		System.out.println("Hello " + PrintObject.getName() + "."); /* Here we print out some text along with
		the name that was set earlier using setName, which has been passed through the "printClass.java" file
		to return the name using the getName function after calling out to it using printObject (Calls out the
		printClass file) then getting the getName function by adding .getName() after printObject. The name is
		then returned to "mainClass.java", and printed out by println */
		System.out.print("Enter a number here (1/2): ");
		double num1 = input.nextDouble(); /* Here we declare a double type variable, which can be used to set
		numbers that have decimal places. The variable is set using input.nextDouble(), which gets the variable
		from the user then skips over to the next line. */
		System.out.print("Enter a number here (2/2): ");
		double num2 = input.nextDouble(); /* Same thing as before, but naming it num2 instead of num1 to get a
		second number for later use. */
		double num3 = num1 + num2; /* Here we declare another double type variable, but instead of getting
		input from the user this time num1 and num2 are added then stored in the double variable num3. */
		System.out.println(num1 + " + " + num2 + " = " + num3); /* Here num1 is printed out, then " + ", then
		num2, then " = " then finally num3, which is the answer to num1 + num2. If num1 were 1.0, and num2 was
		1.0, it would display like this to the user: 1.0 + 1.0 = 2.0 and then skip to the next line. */
		num3 = num1 - num2; /* Here basically the same thing is happening, except "double num3" is not written
		again because num3 was already declared as a double type earlier. So instead num3 is just overwritten
		with num1 - num2 */
		System.out.println(num1 + " - " + num2 + " = " + num3); /* Here the numbers are printed out again,
		except as subtraction this time. */
		num3 = num1 * num2; // num3 gets re-written here by multiplication this time.
		System.out.println(num1 + " * " + num2 + " = " + num3); /* Then here the multiplication is printed out
		for the user to see. */
		num3 = num1 / num2; // This time num3 is overwritten with division.
		System.out.println(num1 + " / " + num2 + " = " + num3); // Then is printed out to the user.
		if(num3 == Double.POSITIVE_INFINITY) /* Here is an if argument, which is used to compare two things.
		Here it is checking if the num3 variable is equal to infinity. If it is, it is safe to assume the user
		tried to divide by 0. Which we all know is impossible in real life, but results in infinite inside of
		computer code. */
		{
			System.out.println("You tried to divide by 0."); /* Here it prints out the user tried to divide
			by 0 after the if argument is declared as true. If the if argument is false, this code is
			ignored. */
		}
		else if(num3 < 0) /* Here is an else if argument, which only runs if the first if argument proves to be
		false. Here we check if the divided answer is less than 0, and if it is then it is safe to assume the
		user tried to divide a positive number with a negative number. So the program prints out they tried to
		divide a positive number with a negative number when this is proven true. If it is proven false, it
		moves on to the next else if argument. */
		{
			System.out.println("You divided a positive number with a negative number.");
		}
		else if(num3 > 0) /* The next else if argument, in which we check if the answer is greater than 0. If
		it if greater than 0, it is safe to assume the user divided normally. Dividing normally is either by
		dividing a negative number with another negative number, or dividing a positive number with another
		positive number. */
		{
			System.out.println("You divided normally.");
		}
		else if(Double.isNaN(num3) == true) /* Here we check if the Double type variable num3 is not a number
		(NaN). If it's not a number it is safe to assume they tried to divide 0 by 0 since Java crashes when
		they enter letters into the double type variable num1 or num2. */
		{
			System.out.println("You tried to divide 0 by 0.");
		}
		else /* Now the else is triggered, which only gets used when the above if and else if's fail. Since I
		don't currently know how the user can trigger this else, I just print out "I don't know how you did
		that." Then skip over to the next line. */
		{
			System.out.println("I don't know how you did that.");
		}
		System.out.print("Enter a number here (1/1): "); /* Here we prompt the user to enter a number, which is
		declared on the next line. */
		int num4 = input.nextInt(); // Now we declare an integer type variable, which cannot store decimals.
		switch(num4) // Here we start a switch argument, which is continued inside of the switch's brackets.
		{
			case 5: /* Here we test if the number being tested is equal to 5. In this case the number being
			tested is num4, which is inside of the parenthesis of the start of the switch argument. If the
			number tested turns out to be 5, it prints out "Number entered was 5." */
				System.out.println("Number entered was 5.");
				break; /* This stops the switch argument. If the break is taken out, it will continue
				testing the number even after the case is proven true. */
			default: /* The default case is activated after all above cases are proven false, or you don't
			have any breaks. */
				System.out.println("Case default");
				break; /* This is the final break, which closes the switch argument to prevent memory
				leaks. */
		}
		System.out.println("Type ex then press enter exit.");
		String exit = input.next(); // Here we declare a string called exit, and let the user set it.
		do /* Here we start a do while loop, which is the same as a while loop, but makes sure the code runs at
		least once before closing the loop. If you want to do a while loop instead of a do while loop, simply
		delete the do, and replace it with "while(condition1 != condition2){ Code goes here }" In a while loop,
		the code is never run if the condition is proven true before it even gets to the code. Another thing to
		mention is the != operator, which is used as if(condition1 != condition2){ Insert code } The code inside
		the brackets is only run if condition1 is not equal to condition2 when using !=. */
		{
			if(exit.equals("ex") == false) /* Here we check if the exit string is not equal to ex. If the
			exit string is not equal to ex then the code promts the user to enter the string again. */
			{
				exit = input.next();
			}
			else /* If the if argument above proves to be false, as in the argument inside the if is proven
			to be true, then this else code runs. Since the above if argument is not true, then it must be
			false. So the while argument gets set to true, and the code saying Goodbye runs and the program
			closes. */
			{
				System.out.println("Goodbye.");
				input.close(); /* Here we close the input scanner since it is not going to be used
				anymore. Closing the scanner prevents memory leaks. */
			}
		}while(exit.equals("ex") == false);
	}
}
