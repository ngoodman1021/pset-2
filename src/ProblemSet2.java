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
		 
		System.out.print("Enter your first name: ");
		String firstName = in.nextLine();
		System.out.print("Enter your last name: ");
		String lastName = in.nextLine();
		System.out.print("Enter your grade: ");
		int grade = in.nextInt();
		System.out.print("Enter your age: ");
		int age = in.nextInt();
		in.nextLine();
		System.out.print("Enter your hometown: ");
		String homeTown = in.nextLine();
		//asks first name, last name, grade, age, and hometown (NAYA)
		
        
		System.out.println("\nNAME      : " + firstName + " " + lastName);
        System.out.println("GRADE     : " + "" + grade);
		System.out.println("AGE       : " + age);
		System.out.println("HOMETOWN  : " + homeTown);
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
		double amount = in.nextDouble();
		System.out.println(" ");
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
		
		System.out.printf("DOLLARS  : %.0f", amountOfDollars);
		System.out.printf("\nQUARTERS : %.0f", amountOfQuarters);
		System.out.printf("\nDIMES    : %.0f", amountOfDimes);
		System.out.printf("\nNICKELS  : %.0f", amountOfNickels);
		System.out.printf("\nPENNIES  : %.0f\n", amountOfPennies);
		
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
		 
		 System.out.print("\nEnter a dollar amount: ");
		 double amount2 = in.nextDouble();
         System.out.println(" ");
         amount2 = amount2 * 100;
		 //asks the dollar amount (NAYA)

         double TEN = Math.floor(amount2/tenDollars);
         amount2 = amount2 % tenDollars;
         double FIVE = Math.floor(amount2/fiveDollars);
         amount2 = amount2 % fiveDollars;
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
		  * Given a number of inches, print the equivalent number of miles, yards, feet,
		  * and inches.
		  */
			 
	     double inchesInMiles = 63360;
         double inchesInYards = 36;
         double inchesInFeet = 12;

         System.out.print("\nEnter a number of inches: ");
         double inches = in.nextDouble();
         System.out.println("");
		 //asks for the amount of inches
		 

         double miles = Math.floor(inches/inchesInMiles);
         inches = inches % inchesInMiles;
         double yards = Math.floor(inches/inchesInYards);
         inches = inches % inchesInYards;
         double feet = Math.floor(inches/inchesInFeet);
         inches = inches % inchesInFeet;
		 //converts inches into other US measurements


         System.out.printf("MILES  : %.0f\n", miles);
         System.out.printf("YARDS  : %.0f\n", yards);
         System.out.printf("FEET   : %.0f\n", feet);
         System.out.printf("INCHES : %.0f\n", inches);
		 //prints the other US measurements




         /*
          * Exercise 5.
          *
          * Given a number of centimeters, print the equivalent number of kilometers,
          * meters, and centimeters.
          */

         double centimeterInKilometers = 100000;
         double centimeterInMeters = 100;
		 //conversion of the meteric system into centimeters

         System.out.print("\nEnter a number of centimeters: ");
         double centimeters = in.nextDouble();
         System.out.println("");
		 // asks for the amount of centimeters

         double kilometer = Math.floor(centimeters/centimeterInKilometers);
         centimeters = centimeters % centimeterInKilometers; 
         double meter = Math.floor(centimeters/centimeterInMeters);
         centimeters = centimeters % centimeterInMeters;
		 //converts centimeters into the other meteric system


         System.out.printf("KILOMETERS  : %.0f\n", kilometer);
         System.out.printf("METERS      : %.0f\n", meter);
         System.out.printf("CENTIMETERS : %.0f\n", centimeters);
		 // prints out centimeters and the other measurements




         /*
          * Exercise 6.
          *
          * Given a diameter, print the area and circumference of the corresponding circle.
          */

         System.out.print("\nEnter a diameter: ");
         double diameter = in.nextDouble();
         System.out.println("");
		 //asks for the diameter in order to find the area and circumference
		 
         double radius = diameter / 2;
         double circleArea = Math.PI * Math.pow(radius, 2);
         double circumference = 2 * Math.PI * radius;
		 // equations to find each one
		 
         System.out.printf("AREA          : %.2f\n", circleArea);
         System.out.printf("CIRCUMFERENCE : %.2f\n", circumference);
		 //prints out the area and circumference

        

        
         /*
          * Exercise 7.
          *
          * Given a length and width, print the area, perimeter, and diagonal of the
          * corresponding rectangle.
          */

         System.out.print("\nEnter a length: ");
         double rectangleLength = in.nextDouble();
		 
         System.out.print("Enter a width: ");
         double rectangleWidth = in.nextDouble();
         System.out.println("");
		 //asks for the width and the length

         double rectangleArea = rectangleLength * rectangleWidth;
         double rectanglePerimeter = (rectangleLength * 2) + (rectangleWidth * 2);
         double diagonal = Math.hypot(rectangleLength, rectangleWidth);
		 //equations for the perimeter, area, and the diagonal

         System.out.printf("AREA      : %.2f\n", rectangleArea);
         System.out.printf("PERIMETER : %.2f\n", rectanglePerimeter);
         System.out.printf("DIAGONAL  : %.2f\n", diagonal);
		 //prints out the perimeter, area, and the diagonal
        

        
		
        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */

         System.out.print("\nEnter a side length: ");
         double hexagonLength = in.nextDouble();
         System.out.println("");
		 //asks for the hexagon length

         double hexagonArea = ((3 * Math.sqrt(3)) / 2) * Math.pow(hexagonLength, 2);
         double hexagonPerimeter = 6 * hexagonLength;
		 //equations to find the hexagon area and perimeter

         System.out.printf("AREA      : %.2f\n", hexagonArea);
         System.out.printf("PERIMETER : %.2f\n", hexagonPerimeter);
         in.nextLine();
		 //prints out the area and the perimeter

        

        
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