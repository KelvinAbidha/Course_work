using System;

public class Exercise5
{
    public static void Main(string[] args)
    {
        // Declaration of variables 
        int number1, number2, temp;

        // Prompting the user to input 
        Console.Write("\nInput the First Number : ");
        number1 = int.Parse(Console.ReadLine());
        Console.Write("\nInput the Second Number : ");
        number2 = int.Parse(Console.ReadLine());
        temp = number1;
        number1 = number2;
        number2 = temp;

        // Displaying the result after swapping
        Console.Write("\nAfter Swapping : ");
        Console.Write("\nFirst Number : " + number1); 
        Console.Write("\nSecond Number : " + number2); 
    }
}

