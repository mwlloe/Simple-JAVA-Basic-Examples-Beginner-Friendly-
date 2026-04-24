import java.util.Scanner;

public class Chapter5Testing
{
	// Main Method(s) thread
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Currrently Displaying: ");
		displayValue((int) 7.5); // Uses Cast Operator, (int), to force integer variable
		myMethod(3, 2, 1);
		System.out.println("and now, end of message.");

		int x = 1;
		double y = 3.4;
		System.out.println(x + " " + y);
		changeUs(x, y);
		System.out.println(x + " " + y);
		System.out.println(" ");
		System.out.println(" Space left blank intentionally. ");
		System.out.println(" ");

		// Cubeing a number Method that returns cubed number
		int result;
		result = cube(5);
		System.out.println(result);

		// Calling 3 diff types of variables Method
		char initial = 'T';
		int age = 25;
		double income = 50000.00;

		System.out.println("Yes or No? ");
		String answer = keyboard.nextLine();
		if (answer.equalsIgnoreCase ("yes"))
		{
			display(age, income, initial);
		}
		else
		{
			System.out.println("It did not work :(");
		}
		// End of Caling 3 diff types of variables Method

		// This Method should have worked by returning a number multiplied by 10
		double multipleOfTen;
		double digit;

		System.out.println("Enter a number to be multiplied by 10: ");
		digit = keyboard.nextDouble();
		multipleOfTen = timesTen(digit);
		System.out.println("Result: " + digit);

		// Taking a number then Squaring the return Method
		int numSquared;
		numSquared = square(5);
		System.out.println(numSquared);

	}

	// Display Method
	public static void displayValue(int num)
	{
		System.out.println("Value: " + num);
	}

	// Change Method
	public static void myMethod(int a, int b, int c)
	{ System.out.println(a + "faehno" + b + c); }

	// Change number Method
	public static void changeUs(int a, double b)
	{
		a = 0;
		b = 0.0;
		System.out.println(a + " " + b);
	}

	// Calling method 5
	public static int cube(int num)
	{
		return num * num * num;
	}

	// Display multiple types of variables Method
	public static void display(int arg1, double arg2, char arg3)
	{
		System.out.println("The values are: " + arg1 + ", " + arg2 +
											", and " + arg3);
	}

	// Method that returns a number multiplied by 10
	public static double timesTen(double num2)
	{
		return num2 * 10.0;
	}

	// Method that squares a number then returns it when called
	public static int square(int num3)
	{
		return num3 * num3;
	}
}