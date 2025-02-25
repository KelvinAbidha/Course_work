using System;

public class Exercise5
{
    public static void Main(string[] args)
    {
        int number1, number2, temp;

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

        Console.Read();
    }
}
