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
        Random rand = new Random();
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
            else if (remainder % 2 == 0)
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

