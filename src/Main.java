import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int favNum = 0;
        String trash = "";


        Scanner in = new Scanner(System.in);
        boolean done = false;

        double itemPrice = 0;
        double totalPrice = 0;
        double averagePrice = 0;
        int numItems = 0;
        String anotherYN = "";

        int grade = -1;
        int totalGrades = 0;
        int numGrades = 0;
        double averageGrade = 0;

        final int SENTINAL = -1;

        // For loop
        for(int x=0; x < 10; x++)
        {
            System.out.println("loop " + x);
            System.out.println("Hello" + x);
        }

        do {
            // Favorite number 1 - 10
            System.out.print("Enter your fav num [1 - 10]: ");
            if (in.hasNextInt())
            {
                favNum = in.nextInt();
                in.nextLine(); // clear the newline form the buffer
                if (favNum >= 1 && favNum <= 10)
                {
                    System.out.println("\nYou said your fav num is " + favNum);
                    done = true;
                }
                else
                {
                    System.out.println("You said your fav num is " + favNum + " but that is out of range");
                }
            } else  // don't have an int
            {
                trash = in.nextLine();
                System.out.println("You must enter an integer not " + trash);
            }
        }while (!done);

        // Get a series of prices simulating a shopping basket
        // calculate the total, the average and the number of items

        done = false;  // reset the done control variable to use again

        do
        {

            System.out.print("Enter the cost of your item: ");
            if(in.hasNextDouble())
            {
                itemPrice = in.nextDouble();
                in.nextLine(); // clear the buffer

                totalPrice += itemPrice; // totalPrice = totalPrice + itemPrice
                numItems++;

                // Do you have another...
                System.out.print("Do you have more items [Y/N]: ");
                anotherYN = in.nextLine();

                if(anotherYN.equalsIgnoreCase("N"))
                {
                    done = true;
                }

            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a vlid number not " + trash);
            }

        }while(!done);

        averagePrice = totalPrice / numItems;

        System.out.println("You have a total of " + numItems + " items.");
        System.out.println("You have a total cost of " + totalPrice);
        System.out.printf("You have an average price of %8.2f\n", averagePrice);

        // Sentinal example

        done = false;
        do
        {
            System.out.print("Enter your grades [0 - 100] or -1 to quit");
            if(in.hasNextInt())
            {
                grade = in.nextInt();
                in.nextLine();  // clear the buffer
                if(grade == -1)
                {
                    done = true;
                }
                else if(grade >= 0 && grade <= 100)
                {
                    totalGrades += grade; // totalGrades = totalGrades + grade
                    numGrades++;
                }
                else  // an int that is out of ragne [0-100]
                {
                    System.out.println("Grade value is out of range must be [0-100] You: " + grade);
                }
            }
            else  // Not an int
            {
               trash = in.nextLine();
               System.out.println("Yo umust enter a valid int [0-100] or -1");
            }

        }while(!done);

        averageGrade = totalGrades / numGrades;

        System.out.println("You have a total of " + numGrades + " grades.");
        System.out.println("You have a total of " + totalGrades);
        System.out.printf("You have an average grade of %8.2f\n", averageGrade);




    }
}