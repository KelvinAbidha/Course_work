using System;

public class Exercise5
{
    public static void Main(string[] args)
    {
        int number1, number2, temp;
// temp(temporary variable stores value of one of the variables you are swapping)
        
        Console.Write("\nInput the First Number : ");
        // Using TryParse instead of Parse - if conversion fails, number1 will be 0
        int.TryParse(Console.ReadLine(), out number1);

        Console.Write("\nInput the Second Number : ");
        // Using TryParse instead of Parse - if conversion fails, number2 will be 0
        int.TryParse(Console.ReadLine(), out number2);

        // Swapping the values
        temp = number1;
        number1 = number2;
        number2 = temp;

        Console.Write("\nAfter Swapping : ");
        Console.Write("\nFirst Number : " + number1);
        Console.Write("\nSecond Number : " + number2);

        Console.Read();  // Keeping the console window open until a key is pressed
    }
}

*/ Question 2:
//Using Visual studio arithmetic opertarions are performed automaticallly
class Arithmatics
{
    static void Main()
    {
        Console.WriteLine(-1 + 4 * 6);
        Console.WriteLine( (35 + 5) % 7);
        Console.WriteLine( 14 + -4 * 6 / 11);
        Console.WriteLine(  2 + 15/6 * 1 -7 % 2);

    }
}

*/Question 3:
using System;
class Age
{
    static void Main()
    {
        Console.Write("Kindly input your age: ");
        int age = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine($"You look older than {age}!");
    }
}
---------------------------------------------------------------------------------------------------------------------------
    QN1.
    using System;

class GameProgram
{ 
    static void Main()
    {
        int totalScore = 0;
        Random rand = new Random(); // Choose to set  secret num as random variable,keeps it interesting its a game after all 
        int secretNumber = rand.Next(2, 10); // Generates a random secret number between 2 and 9

        Console.WriteLine($"(Secret number has been randomly chosen!)");

        Console.Write("Enter the number of rounds: ");
        int rounds = int.Parse(Console.ReadLine());

        for (int i = 1; i <= rounds; i++)
        {
            Console.Write($"Enter your lucky number for round {i} Champ !!: ");
            int luckyNumber = int.Parse(Console.ReadLine());

            int remainder = luckyNumber % secretNumber;

            if (remainder == 0)
            {
                totalScore += 1; // Draw
                Console.WriteLine("Draw! +1 point, one on one my guy niko na wewe HAHAHA..");
            }
            else if (remainder % 2 == 0) // Being divisble by 2 without reminder makes it even
            {
                totalScore += 3; // Win
                Console.WriteLine("Win! +3 points");
            }
            else
            {
                totalScore -= 3; // Loss
                Console.WriteLine("Loss! -3 points, Don't cry on my keyboard!!");
            }
        }

        Console.WriteLine($"\nFinal Score: {totalScore}");
        Console.WriteLine($"(The secret number was: {secretNumber})"); // Revealing the secret number at the end

        if (totalScore > 0)
            Console.WriteLine("Congratulations! You win! , You must really be lucky!");
        else
            Console.WriteLine("Game over! You lose. Give me 50 Pushups!!");
    }
}
QN2.//Nested loops :Nested loops are those loops that are present inside another loop. 
    // For this question i found 2 ways to do it :
    /*a) Since number of rows and columns are equal(6) u assign it to a single variable
    e.g in my code "size" set to 6. If u look closely diagonally notice & , Kwa code cheki when 
    "j=i" when index of row and column are the same ndo" &" when not the same" *"/*
    using System;

class PatternProgram
{
    static void Main()
    {
        int size = 6; // Number of rows and columns

        for (int i = 0; i < size; i++) // Outer loop for rows
        {
            for (int j = 0; j < size; j++) // Inner loop for columns
            {
                // First and last rows should be all '&'
                if (i == 0 || i == size - 1)
                    Console.Write("& ");
                // Print '&' at column equal to row index
                else if (i == j)
                    Console.Write("& ");
                else
                    Console.Write("* ");
            }
            Console.WriteLine(); // Move to the next line after each row
        }
    }
}
/*b) So i wondere what if we were given different number of rows and columns lets say 4 rows
5 columns. Code is below , u can replace values of row and column with 6 and still get the same 
result as the 1st example/*
using System;

class PatternProgram
{
    static void Main()
    {
        int rows = 4;  // Number of rows , to match the question weka 6
        int cols = 5;  // Number of columns, same here weka 6

        for (int i = 0; i < rows; i++) // Outer loop for rows
        {
            for (int j = 0; j < cols; j++) // Inner loop for columns
            {
                // First and last row should be all '&'
                if (i == 0 || i == rows - 1)
                    Console.Write("& ");
                // Print '&' where row index and column index are the same (diagonal)
                else if (i == j)
                    Console.Write("& ");
                else
                    Console.Write("* ");
            }
            Console.WriteLine(); // Move to the next line after each row
        }
    }
}
    
QN3. // Credit for purchase , Wasn't much here just experimented with for loop and while loop
/*"for" loop is basically used when the number of times loop statements are to be executed is known beforehand. U will see comments in my code 
try for fun to understand looping /*
using System;

class CreditCheck
{
    static void Main()
    {
        Console.Write("Enter the number of customers: ");
        int n = int.Parse(Console.ReadLine()); // Read the number of customers

        for (int i = 1; i <= n; i++) // Loop for each customer
        {
            Console.WriteLine($"\nCustomer {i}:");

            // Read credit limit
            Console.Write("Enter your credit limit: ");
            double creditLimit = double.Parse(Console.ReadLine());

            // Read item price
            Console.Write("Enter the price of the item: ");
            double price = double.Parse(Console.ReadLine());

            double totalValue;/* When using for loop instead of "while(true)" below set this to
                                 double totalValue = 0;/*
            int quantity; 
            
            /* Below u can replace with for loop  "for (int i = 1; i <= n; i++)" as long as u initialize
            value of "totalValue to 1 as shown above if not firmiliar with using Boolean /* 
            
            while (true) 
            {
                Console.Write("Enter the quantity of items you want to purchase: ");
                quantity = int.Parse(Console.ReadLine());

                totalValue = price * quantity; // Calculate total value

                if (totalValue > creditLimit)
                {
                    Console.WriteLine("Sorry, you cannot purchase goods worth such a value on credit.");
                    Console.WriteLine("Please re-enter a valid quantity.");
                }
                else
                {
                    break; // Exit loop if the purchase is valid
                }
            }

            Console.WriteLine($"Thank You for purchasing from us!");
            Console.WriteLine($"Total Purchase Value: {totalValue:C}"); // Displays value in currency format
        }
    }
}
