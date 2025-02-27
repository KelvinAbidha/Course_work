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

