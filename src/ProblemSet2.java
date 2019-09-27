        /**
 * Problem Set 2.
 * 
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         * 
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */
		 
		System.out.print("\nEnter your first name: \n");
		String firstName = in.nextLine();
		System.out.print("\nEnter your last name: \n");
		String lastName = in.nextLine();
		System.out.print("\nEnter your grade: \n");
		int grade = in.nextInt();
		System.out.print("\nEnter your age: \n");
		int age = in.nextInt();
		System.out.print("\nEnter your hometown: \n");
		String homeTown = in.nextLine();
		//asks first name, last name, grade, age, and hometown (NAYA)
		
        
		System.out.println("\nNAME\t:”  + “ ” + firstName + " " + lastName"\n");
        System.out.println("\nGRADE\t:" + “ ” + grade + "\n");
		System.out.println("\nAGE\t:" + “ ” + age + "\n");
		System.out.println("\HOMETOWN\t:" + “ ” + homeTown + "\n");
		/*prints first name, last name, grade, age, and hometown
		 *based on the response of the code above (NAYA)
		 */
		
        /*
         * Exercise 2.
         * 
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollars
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */
		 
		double dollar = 100;
		double quarter = 25;
		double dime = 10;
		double nickel = 5;
		double penny = 1;
		// change amount (NAYA)
		
		System.out.print("\nEnter a dollar amount: ");
		double.amount = in.nextDouble();
		System.out.println("\n ");
		//asks the dollar amount (NAYA)
		
		amount = amount * 100;
		double amountOfDollars = Math.floor(amount/dollar);
		amount = amount % dollar;
		double amountOfQuarters = Math.floor(amount/quarter);
		amount = amount % quarter;
		double amountOfDimes = Math.floor(amount/dime);
		amount = amount % dime;
		double amountOfNickels = Math.floor(amount/nickel);
		amount = amount % nickel;
		double amountOfPennies = Math.floor(amount/penny);
		amount = amount % penny;
		
		/*calculates the number of dollars needed and number of coins needed
		 *based on the remainder (NAYA)
		 */
		
		System.out.printf("/nDOLLARS\t\t: %.0f", amountOfDollars);
		System.out.printf("/nQUARTERS\t\t: %.0f", amountOfQuarters);
		System.out.printf("/nDIMES\t\t: %.0f", amountOfDimes);
		System.out.printf("/nNICKELS\t\t: %.0f", amountOfNickels);
		System.out.printf("/nPENNIES\t\t: %.0f", amountOfPennies);
		
		/*prints bills, quarters, dimes, nickels, and pennies
		 *based on the response of the code above (NAYA)
		 */

        /*
         * Exercise 3.
         * 
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */
		 
		 double tenDollars = 1000;
		 double fiveDollars = 500;
		 // limit
		 
		 System.out.print(“\nEnter a dollar amount: ”);
		 double amount2 = in.nextDouble();
         System.out.println("\n ");
         amount2 = amount2 * 100;
		 //asks the dollar amount (NAYA)

         double TEN = Math.floor(amount2/ten);
         amount2 = amount2 % ten;
         double FIVE = Math.floor(amount2/five);
         amount2 = amount2 % five;
         double amountOfDollars2 = Math.floor(amount2/dollar);
         amount2 = amount2%dollar;
         double bills = TEN + FIVE + amountOfDollars2;
		 /*converts all change to bills
		 *adds all of the bills up
		 */

         double amountOfQuarters2 = Math.floor(amount2/quarter);
         amount2 = amount2 % quarter;
         double amountOfDimes2 = Math.floor(amount2/dime);
         amount2 = amount2 % dime;
         double amountOfNickels2 = Math.floor(amount2/nickel);
         amount2 = amount2 % nickel;
         double amountOfPennies2 = amount2/penny;
         amount2 = amount2 % penny;
		 double coins = amountOfQuarters2+amountOfDimes2+amountOfNickels2+amountOfPennies2; 	
		/*converts all change to the remainder
		 *adds all of the change up
		 */

         System.out.printf("BILLS : %.0f\n", bills);
         System.out.printf("COINS : %.0f\n", coins);
		//prints the amount of coins and bills


        /*
         * Exercise 4.
         * 
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */


        
        /*
         * Exercise 5.
         * 
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */
        

        
        /*
         * Exercise 6.
         * 
         * Given a diameter, print the area and circumference of the corresponding circle.
         */
        


        /*
         * Exercise 7.
         * 
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */
        

        
        /*
         * Exercise 8.
         * 
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */
        

        
        /*
         * Exercise 9.
         * 
         * Given a string, reverse and print the first and second halves of that string.
         */
        

        
        /*
         * Exercise 10.
         * 
         * Given a first, middle, and last name, print the corresponding initials.
         */
        

        
        in.close();
    }
}